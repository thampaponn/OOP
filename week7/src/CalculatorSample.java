/*
 * tuntun
 */

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author tunkuki
 */
public class CalculatorSample {
    public CalculatorSample(){
        JFrame fr = new JFrame("My Calculator");
        JPanel p = new JPanel();
        JButton btn = new JButton();
        JTextField txt = new JTextField();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4,4));
        fr.setSize(300,200);
        btn = new JButton("7");
        p.add(btn);
        btn = new JButton("8");
        p.add(btn);
        btn = new JButton("9");
        p.add(btn);
        btn = new JButton("+");
        p.add(btn);
        btn = new JButton("4");
        p.add(btn);
        btn = new JButton("5");
        p.add(btn);
        btn = new JButton("6");
        p.add(btn);
        btn = new JButton("-");
        p.add(btn);
        btn = new JButton("1");
        p.add(btn);
        btn = new JButton("2");
        p.add(btn);
        btn = new JButton("3");
        p.add(btn);
        btn = new JButton("x");
        p.add(btn);
        btn = new JButton("0");
        p.add(btn);
        btn = new JButton("c");
        p.add(btn);
        btn = new JButton("=");
        p.add(btn);
        btn = new JButton("/");
        p.add(btn);
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorSample();
    }
}
