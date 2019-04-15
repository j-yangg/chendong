package org.cd.designpatterns.observer;

/**
 * @classname: DigitObserver
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-15 23:10
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        //显示n个星号 n = numberGenerator.getNumber()
        System.out.print("GraphObserver: ");
        for (int i = 0; i < numberGenerator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
        //为了方便演示，延迟100毫秒
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
