/*
 * tuntun
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author tunkuki
 */
public class MyFrame {
    private JFrame fr;
    private MyClock clock;
    private Thread t;
    public MyFrame(){
        fr = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        fr.setLayout(new FlowLayout());
        fr.setSize(500, 150);
        fr.add(clock);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
