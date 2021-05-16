package com.lzb.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 无锁单例，非volatile<br/>
 * Created on : 2021-05-16 21:43
 * @author lizebin
 */
public class SingleNoLock {

    private static final AtomicReference<Object> instance;

    static {
        instance = new AtomicReference<>();
    }

    public static SingleNoLock getInstance() {
        Object value = SingleNoLock.instance.get();
        if (value == null) {
            synchronized (SingleNoLock.instance) {
                value = SingleNoLock.instance.get();
                if (value == null) {
                    final SingleNoLock actualValue = new SingleNoLock();
                    //这里会有指令重排
                    value = ((actualValue == null) ? SingleNoLock.instance : actualValue);
                    instance.set(value);
                }
            }
        }
        return (SingleNoLock) ((value == SingleNoLock.instance) ? null : value);
    }

    /**
     * 用CAS确保线程安全
     */
    public static SingleNoLock getInstance1(){
        for (;;) {
            SingleNoLock current = (SingleNoLock) instance.get();
            if (current != null) {
                return current;
            }
            current = new SingleNoLock();
            if (instance.compareAndSet(null, current)) {
                return current;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(SingleNoLock.getInstance() == SingleNoLock.getInstance1());
    }

}
