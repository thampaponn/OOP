package week7;

import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel p, p2;
    private JButton btn1, btn2, btn3;
    private JTextField txt1, txt2;
    private JLabel lbl1, lbl2;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(2, 1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel(new GridLayout(2,2));
        p2 = new JPanel(new FlowLayout());
        txt1 = new JTextField();
        txt2 = new JTextField();
        lbl1 = new JLabel("Balance");
        lbl2 = new JLabel("Amount");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        btn3.addActionListener((event) -> System.exit(0));
        fr.setSize(300,200);
        p.add(lbl1); p.add(txt1);
        p.add(lbl2); p.add(txt2);
        p2.add(btn1); p2.add(btn2); p2.add(btn3);
        fr.add(p);
        fr.add(p2);
        fr.setVisible(true);
    }public static void main(String[] args) {
        new TellerGUI();
    }
    
}
