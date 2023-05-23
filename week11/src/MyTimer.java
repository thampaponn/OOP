
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * tuntun
 */

/**
 *
 * @author tunkuki
 */
public class MyTimer implements MouseListener{
    private JFrame fr;
    private Timer clock;
    private Thread t;
    public MyTimer(){
        fr = new JFrame();
        clock = new Timer();
        t = new Thread(clock);
        t.start();
        fr.setLayout(new FlowLayout());
        fr.setSize(500, 150);
        fr.add(clock);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new MyTimer();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
