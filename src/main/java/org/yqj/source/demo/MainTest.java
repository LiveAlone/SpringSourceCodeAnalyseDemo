package org.yqj.source.demo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/8/29
 * Email: yaoqijunmail@foxmail.com
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        //设置Headless模式
        System.setProperty("java.awt.headless","true");
        BufferedImage bi = new BufferedImage(200, 100,BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        String s ="Headless模式测试";
        g.drawString(new String(s.getBytes(),"GB2312"), 50, 50);
        ImageIO.write(bi,"jpeg", new File("test.jpg"));
    }
}
