/*
 * tuntun
 */
package week11;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author tunkuki
 */
public class StudentView implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel pn, pn1, pn2;
    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2, txt3;
    private JButton bn1, bn2;
    private File f;
    private Student st;

    public StudentView() {
        st = new Student();
        File f = new File("StudentM.dat");
        fr = new JFrame("StudentView");
        fr.addWindowListener(this);
        pn = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("ID :");
        lb2 = new JLabel("Name :");
        lb3 = new JLabel("Money :");

        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField("0");

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");

        bn1.addActionListener(this);
        bn2.addActionListener(this);

        fr.setLayout(new FlowLayout());
        pn.setLayout(new BorderLayout());
        pn1.setLayout(new GridLayout(3, 2));
        pn2.setLayout(new FlowLayout());
        pn2.setSize(100, 5);
        pn1.add(lb1);
        txt3.setEditable(false);
        pn1.add(txt1);
        pn1.add(lb2);
        pn1.add(txt2);
        pn1.add(lb3);
        pn1.add(txt3);

        pn2.add(bn1);
        pn2.add(bn2);

        pn.add(pn1, BorderLayout.NORTH);
        pn.add(pn2, BorderLayout.SOUTH);
        fr.add(pn);

        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bn1)) {
            
            st.setMoney(st.getMoney() + 100);
            txt3.setText(st.getMoney() + "");
            
        } else if (ae.getSource().equals(bn2)) {
            if (Integer.parseInt(txt3.getText()) <= 0) {
                
                st.setMoney(st.getMoney() + 0);
                
            txt3.setText(st.getMoney() + "");
            } else {
                
                st.setMoney(st.getMoney() - 100);
                txt3.setText(st.getMoney() + "");
                
            }
        }
    }

    public void windowOpened(WindowEvent we) {
        try (FileInputStream fin = new FileInputStream("StudentM.dat");  ObjectInputStream in = new ObjectInputStream(fin);) {

            st = (Student) in.readObject();

            String strid = String.valueOf(st.getID());
            String strmn = String.valueOf(st.getMoney());

            txt1.setText(strid);
            txt2.setText(st.getName());
            txt3.setText(strmn);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    

    

    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fOut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);){
            
            st.setID(Integer.parseInt(txt1.getText()));
            st.setName(txt2.getText());
            
            oOut.writeObject(st);
            oOut.close();
            fOut.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new StudentView();
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
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
