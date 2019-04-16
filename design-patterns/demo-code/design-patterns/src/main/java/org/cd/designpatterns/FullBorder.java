package org.cd.designpatterns;

import org.cd.designpatterns.decorator.Border;
import org.cd.designpatterns.decorator.Display;

/**
 * @classname: FullBorder
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-16 22:47
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1; //加上两边字符数
    }
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1; //上下行数
    }
    @Override
    public String getRowText(int row) {
        if (row == 0) {//打印上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        }else if (row == display.getRows() + 1) { //打印下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        }else { //打印中间字符串段
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count ; i++) {
            stringBuffer.append(ch);
        }
        return stringBuffer.toString();
    }
}
