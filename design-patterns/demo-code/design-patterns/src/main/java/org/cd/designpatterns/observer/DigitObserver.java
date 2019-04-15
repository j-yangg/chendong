package org.cd.designpatterns.observer;

/**
 * @classname: DigitObserver
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-15 23:10
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        //直接打印数字
        System.out.println("DigitObserver: " + numberGenerator.getNumber());
        //为了方便演示，延迟100毫秒
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
