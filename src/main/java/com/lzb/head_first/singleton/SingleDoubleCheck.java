package com.lzb.head_first.singleton;

import java.util.*;
import java.util.concurrent.*;

public class SingleDoubleCheck {

	private static volatile SingleDoubleCheck INSTANCE;
	private SingleDoubleCheck() {}
	
	public static SingleDoubleCheck getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (SingleDoubleCheck.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new SingleDoubleCheck();
                }
            }
        }
		return INSTANCE;
	}

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Callable<SingleDoubleCheck> task = () -> SingleDoubleCheck.getInstance();
        List<Future<SingleDoubleCheck>> list = threadPool.invokeAll(Arrays.asList(
           task,
           task,
           task,
           task,
           task
        ));
        SingleDoubleCheck instance = SingleDoubleCheck.getInstance();
        for (Future<SingleDoubleCheck> result : list) {
            if (result.get() != instance) {
                System.out.println("!!!!!!!!!!!!!error!!!!!!!!!!!");
            }
        }
        threadPool.shutdown();
    }
}
