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
public class PoringConstructor implements ActionListener{
    private JFrame fr;
    private JButton bt;
    private Poring poring;
    public int num = 1;
    public PoringConstructor(){
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        fr.setSize(100, 70);
        bt = new JButton("Add");
        bt.addActionListener(this);
        fr.add(bt);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bt)){
            poring = new Poring(num);
            Thread t = new Thread(poring);
            t.start();
            num++;
        }
    }
}
