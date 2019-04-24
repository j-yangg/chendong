package org.cd.designpatterns.singleton;

/**
 * 双重校验锁
 * 优点：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 缺点：较复杂，你很可能现在看了明天就忘了
 *
 */
public class DoubleLockSingletonObject {

    private volatile static DoubleLockSingletonObject instance;

    private DoubleLockSingletonObject() {
    }

    public static DoubleLockSingletonObject getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingletonObject.class) {
                if (instance == null) {
                    instance = new DoubleLockSingletonObject();
                }
            }
        }
        return instance;
    }
}
