package org.cd.designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @classname: NumberGenerator
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-15 23:02
 */
public abstract class NumberGenerator {
    private List observers = new ArrayList();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer observer = (Observer) it.next();
            observer.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
