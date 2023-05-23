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
public class Poring implements MouseListener, Runnable{
    private JFrame fr;
    private JLabel lb1, lb2;
    private ImageIcon img;
    public Poring(int num){
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        img = new ImageIcon("./src/Poring.png");
        img.setImage(img.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        lb1 = new JLabel(img);
        lb1.addMouseListener(this);
        lb2 = new JLabel("" + num);
        fr.add(lb1); fr.add(lb2);
        fr.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setLocation((int)(Math.random()*dimension.getWidth() - fr.getWidth()), (int)(Math.random()*dimension.getHeight() - fr.getWidth()));
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(30);
                if(Math.random() >= 0.5){
                    fr.setLocation(fr.getX() + 2, fr.getY() + 2);
                } else{
                    fr.setLocation(fr.getX() - 2, fr.getY() - 2);
                }    
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
//        yee
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource().equals(lb1)){
            fr.dispose();
        }    
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
