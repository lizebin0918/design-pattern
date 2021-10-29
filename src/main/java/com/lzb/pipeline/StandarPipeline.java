package com.lzb.pipeline;

import java.util.Objects;

/**
 * <br/>
 * Created on : 2021-10-29 08:16
 *
 * @author lizebin
 */
public class StandarPipeline implements Pipeline {

    protected Valve head;
    protected Valve tail;

    @Override
    public Valve head() {
        return head;
    }

    @Override
    public Valve tail() {
        return tail;
    }

    @Override
    public void tail(Valve v) {
        this.tail = v;
    }

    @Override
    public void addValve(Valve v) {
        if (Objects.isNull(head)) {
            head = v;
            v.setNext(tail);
        } else {
            Valve current = head;
            while (Objects.nonNull(current)) {
                if (current.next() == tail) {
                    current.setNext(v);
                    v.setNext(tail);
                    break;
                }
                current = current.next();
            }
        }
    }

    public Valve getHead() {
        return head;
    }

    public void setHead(Valve head) {
        this.head = head;
    }

    public Valve getTail() {
        return tail;
    }

    public void setTail(Valve tail) {
        this.tail = tail;
    }
}
