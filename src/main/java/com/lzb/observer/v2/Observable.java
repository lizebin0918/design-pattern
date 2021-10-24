package com.lzb.observer.v2;

import java.util.Objects;
import java.util.Vector;

/**
 * 被观察者<br/>
 * Created on : 2021-10-24 08:11
 *
 * @author lizebin
 */
public class Observable {

    private boolean changed = false;

    private Vector<Observer> observers;

    public Observable() {
        observers = new Vector<>();
    }

    /**
     * 增加观察者
     * @param o
     */
    public synchronized void addObserver(Observer o) {
        Objects.requireNonNull(o);
        if (!observers.contains(o)) {
            observers.addElement(o);
        }
    }

    public synchronized void deleteObserver(Observer o) {
        observers.removeElement(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        Object[] arrLocal;

        // 生成快照（再通知的过程中，不能新增或者删除观察者），缩小锁的同步范围
        synchronized (this) {
            if (!changed) {
                return;
            }
            arrLocal = observers.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length - 1; i >= 0; i--) {
            ((Observer) arrLocal[i]).update(this, arg);
        }
    }

    protected synchronized void clearChanged() {
        changed = false;
    }
}
