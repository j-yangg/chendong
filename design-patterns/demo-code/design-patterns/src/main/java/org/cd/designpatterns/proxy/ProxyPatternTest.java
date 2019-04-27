package org.cd.designpatterns.proxy;

/**
 * @classname: ProxyPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:41
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test.jpg");
        System.out.println("代理对象第一次display（图像需要从磁盘加载）:");
        proxyImage.display();
        System.out.println("代理对象第二次display（图像不需要重新加载）:");
        proxyImage.display();
    }
}
