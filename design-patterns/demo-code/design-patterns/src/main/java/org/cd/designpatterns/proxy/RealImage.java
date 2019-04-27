package org.cd.designpatterns.proxy;

/**
 * @classname: RealImage
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 22:32
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Display " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
