package com.lzb.tank;

import java.awt.*;
import java.awt.event.*;

/**
 * 坦克界面<br/>
 * Created on : 2021-03-11 23:22
 * @author lizebin
 */
public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame() {
        this.setSize(800, 600);
        this.setResizable(false);
        this.setTitle("tank war");
        this.setVisible(true);
        this.addKeyListener(new MyKeyListener());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        x += 10;
        y += 10;
    }

    /**
     * 键盘监听
     */
    private static class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("key press");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
        }
    }

}
