package com.lzb.command.gt;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 命令模式将请求（命令）封装成一个对象，这样可以使用不同的请求参数化其他对象，并且能够支持请求（命令）的排队执行：动作 + 数据
 *
 * 当我们把函数封装成对象之后，对象可以存储下来、方便控制。主要应用场景：用来控制命令的执行，这里的执行可以是同步、异步、延迟、排队。
 * 消费者无需关注命令的执行逻辑，只关注执行命令的逻辑
 *
 * 命令模式和策略模式的区别：
 * 策略模式：不同的策略具有相同的目的、不同的实现、互相之间可以替换。比如冒泡排序、选择排序都是为了实现排序，它们的最终目标都是实现排序而已
 * 命令模式：不同的命令具有不同的目的，对应不同的处理逻辑，并且相互之间不可替换
 *
 * 想当年对接多个ERP接口，客户端定义固定接口，采用策略+模板方式组织流程，每次新来一套接口，直接加实现即可。还可以有另一种方式，采用命令模式，这样还能解耦，
 * 生产者只要把命令（动作+数据）封装好放到队列，消费者消费即可，但是这种方式有可能导致一个指令的消费阻塞导致后面的排队指令消费不了
 *
 * Created on : 2021-10-15 13:31
 *
 * @author lizebin
 */
public class Test {

    private static interface Command {
        void execute();
    }

    @Data
    private static class GotDiamondCommand implements Command {

        private String data;
        public GotDiamondCommand(String data) {
            this.data = data;
        }

        @Override
        public void execute() {
            System.out.println("获取钻石执行");
        }
    }

    @Data
    private static class Request {
        private Event event;
        private String data;
    }

    /**
     * 事件枚举
     */
    private enum Event {
        GOT_DIAMOND;
    }

    private static final int MAX_HANDLER_REQ_COUNT_PER_LOOP = 100;

    private Queue<Command> queue = new LinkedList<>();

    public void mainloop() {
        while (true) {
            List<Request> requests = new ArrayList<>();
            requests.forEach(request -> {
                Event event = request.getEvent();
                Command command = null;
                if (event.equals(Event.GOT_DIAMOND)) {
                    command = new GotDiamondCommand(request.getData());
                } // else if ()
                queue.add(command);
            });

            int handledCount = 0;
            while (handledCount < MAX_HANDLER_REQ_COUNT_PER_LOOP) {
                if (queue.isEmpty()) {
                    break;
                }
                Command command = queue.poll();
                command.execute();
                ++handledCount;
            }
        }
    }

}
