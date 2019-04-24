package org.cd.designpatterns.singleton;

/**
 * 懒汉式，线程不安全
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 *
 */
public class LazySingletonObject {

    private static LazySingletonObject instance;

    //是该对象不能被外部实例化
    private LazySingletonObject() {
    }

    //返回单一实例， 如果为空则创建实例，线程不安全
    public static LazySingletonObject getInstance() {
        if (instance == null) {
            instance = new LazySingletonObject();
        }
        return instance;
    }
}
