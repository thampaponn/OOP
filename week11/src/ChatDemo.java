/*
 * tuntun
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.io.*;

/**
 *
 * @author tunkuki
 */
public class ChatDemo implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel pn, pn1, pn2, pn3;
    private JTextField txt1;
    private JTextArea ta;
    private JButton bn1, bn2;
    private File f;

    public ChatDemo() {
        File f = new File("ChatDemo.dat");
        fr = new JFrame("ChatDemo");
        fr.setLayout(new FlowLayout());
        fr.addWindowListener(this);
        pn = new JPanel(new BorderLayout());
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel(new FlowLayout());
        bn1 = new JButton("Submit");
        bn2 = new JButton("Reset");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        txt1 = new JTextField();
        ta = new JTextArea(20, 45);
        ta.setEditable(false);

        pn1.setLayout(new BorderLayout());
        pn1.add(ta);

        pn2.setLayout(new BorderLayout());
        pn2.add(txt1, BorderLayout.SOUTH);
        pn2.setSize(100, 5);

        pn3.add(bn1);
        pn3.add(bn2);

        pn.add(pn1, BorderLayout.NORTH);
        pn.add(pn2);
        pn.add(pn3, BorderLayout.SOUTH);
        fr.add(pn);

        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bn1)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + dtf.format(LocalDateTime.now()) + " : " + txt1.getText() + "\n");
            txt1.setText("");
        } else if (ae.getSource().equals(bn2)) {
            ta.setText("");
            txt1.setText("");
        }
    }
    public void windowOpened(WindowEvent we) {
        
        try {
            FileInputStream fin;
            DataInputStream din;
            fin = new FileInputStream("ChatDemo.dat");
            din = new DataInputStream(fin);

            String line = din.readUTF();
            ta.setText(line);

            din.close();
            fin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void windowClosing(WindowEvent we) {

        try {
            FileOutputStream fout;
            DataOutputStream dout;
            fout = new FileOutputStream("ChatDemo.dat");
            dout = new DataOutputStream(fout);

            dout.writeUTF(ta.getText());

            dout.close();
            fout.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
