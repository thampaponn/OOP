package week7;

import javax.swing.*;
import java.awt.*;

public class SimpleCalGUI {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JButton btn1, btn2, btn3, btn4;
    private JTextField txt1, txt2, txt3;
    public SimpleCalGUI(){
        fr = new JFrame("เครื่องคิดเลข");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());
        p3.setLayout(new FlowLayout());
        p4.setLayout(new BorderLayout());
        p1.add(txt1, BorderLayout.NORTH);
        p2.add(txt2, BorderLayout.NORTH);
        btn1 = new JButton("บวก"); btn2 = new JButton("ลบ"); btn3 = new JButton("คูณ"); btn4 = new JButton("หาร");
        p3.add(btn1); p3.add(btn2); p3.add(btn3); p3.add(btn4);
        p4.add(txt3, BorderLayout.NORTH);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleCalGUI();
    }
}
