package com.gucci;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java SE");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btn = new JButton("OK");
        btn.addActionListener((e) -> System.out.println("Hi,Ich heisse Amir..."));
        frame.add(btn);
    }
}
