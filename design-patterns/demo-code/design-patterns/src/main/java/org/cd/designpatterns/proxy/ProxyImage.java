package org.cd.designpatterns.proxy;

/**
 * @classname: ProxyImage
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:34
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        System.out.println("======Proxy display before=========");
        realImage.display();
        System.out.println("======Proxy display after=========");
    }
}
