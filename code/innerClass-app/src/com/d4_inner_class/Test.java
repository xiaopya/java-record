package com.d4_inner_class;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 匿名内部类的真实使用场景
 * 通常是简化代码，吊用别人的方法去使用匿名内部类
 */
public class Test {
    public static void main(String[] args) {
        // GUI编程
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // 给按钮绑定单击事件监听器
        // 这里就是用的就是别人提供的匿名内部类
        // btn.addActionListener(new AbstractAction() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(win,"登录一下");
        //     }
        // });
        // 以下是上面内部类的简化方式
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登录一下吧"));

        win.setSize(400, 400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
