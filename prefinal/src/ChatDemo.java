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
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel pn1, pn2, pn3, pn4;
    private JTextArea ta;
    private JTextField txt;
    private JButton bt1, bt2;
    private File f;
    public ChatDemo() {
        File f = new File("ChatDemo.dat");
        fr = new JFrame("ChatDemo");
        fr.setLayout(new FlowLayout());
        fr.addWindowListener(this);
        pn1 = new JPanel(new BorderLayout());
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel(new FlowLayout());
        bt1 = new JButton("Submit");
        bt2 = new JButton("Reset");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        txt = new JTextField();
        ta = new JTextArea(20, 45);
        ta.setEditable(false);
        
        pn2.setLayout(new BorderLayout());
        pn2.add(ta);
        
        pn3.setLayout(new BorderLayout());
        pn3.add(txt, BorderLayout.SOUTH);
        
        pn4.add(bt1);
        pn4.add(bt2);
        
        pn1.add(pn2, BorderLayout.NORTH);
        pn1.add(pn3);
        pn1.add(pn4, BorderLayout.SOUTH);
        fr.add(pn1);
        
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(bt1)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + dtf.format(LocalDateTime.now()) + " " + txt.getText() + "\n");
            txt.setText("");
        } else if (e.getSource().equals(bt2)){
            ta.setText("");
            txt.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {
            FileInputStream fin = new FileInputStream("ChatDemo.dat");
            DataInputStream din = new DataInputStream(fin);
            
            String word = din.readUTF();
            ta.setText(word);
            
            din.close();
            fin.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            FileOutputStream fout = new FileOutputStream("Chatdemo.dat");
            DataOutputStream dout = new DataOutputStream(fout);
            
            dout.writeUTF(ta.getText());
            
            dout.close();
            fout.close();
        } catch(IOException ex){
            System.out.println(ex);
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
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
