package org.cd.designpatterns.iterator;

/**
 * @classname: IteratorPatternDemo
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-24 23:52
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
