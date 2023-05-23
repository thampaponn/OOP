/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

/**
 *
 * @author tun45
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainTest {
    private JFrame fr;
    private JPanel pn1;
    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    private JButton bt1, bt2, bt3, bt4;
    public MainTest(){
        fr = new JFrame();
        pn1 = new JPanel();
        lb1 = new JLabel();
        lb2 = new JLabel();
        lb3 = new JLabel();
        lb4 = new JLabel();
        lb5 = new JLabel();
        lb6 = new JLabel();
        lb7 = new JLabel();
        bt1 = new JButton();
        bt2 = new JButton();
        bt3 = new JButton();
        bt4 = new JButton();
        
        
        
        pn1.setBackground(new Color(0, 0, 0));
        
        lb1.setFont(new Font("Goudy Old Style", 3, 150)); // NOI18N
        lb1.setForeground(new Color(240, 120, 240));
        lb1.setText("T");
        
        lb2.setFont(new Font("Goudy Old Style", 3, 150)); // NOI18N
        lb2.setForeground(new Color(126, 251, 204));
        lb2.setText("E");

        lb3.setFont(new Font("Goudy Old Style", 3, 150)); // NOI18N
        lb3.setForeground(new Color(72, 240, 237));
        lb3.setText("T");

        lb4.setFont(new Font("Goudy Old Style", 3, 150)); // NOI18N
        lb4.setForeground(new Color(255, 189, 0));
        lb4.setText("R");

        lb5.setFont(new Font("Goudy Old Style", 3, 150)); // NOI18N
        lb5.setForeground(new Color(149, 125, 173));
        lb5.setText("I");

        lb6.setFont(new Font("Goudy Old Style", 3, 150)); // NOI18N
        lb6.setForeground(new Color(223, 255, 0));
        lb6.setText("S");

        lb7.setFont(new Font("Goudy Old Style", 3, 90)); // NOI18N
        lb7.setForeground(new Color(248, 152, 164));
        lb7.setText("Murati");

        bt1.setFont(new Font("Goudy Old Style", 3, 30)); // NOI18N
        bt1.setText("Start");

        bt2.setFont(new Font("Goudy Old Style", 3, 30)); // NOI18N
        bt2.setText("Option");

        bt3.setFont(new Font("Goudy Old Style", 3, 30)); // NOI18N
        bt3.setText("About");

        bt4.setFont(new Font("Goudy Old Style", 3, 30)); // NOI18N
        bt4.setText("Exit");
        
        GroupLayout pn1Layout = new GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(pn1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addGroup(pn1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(pn1Layout.createSequentialGroup()
                                .addComponent(lb1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb4))
                            .addComponent(lb7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb6)
                        .addGap(174, 174, 174))
                    .addGroup(GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addGroup(pn1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(bt2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt4, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332))))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pn1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb7)
                .addGap(30, 30, 30)
                .addComponent(bt1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        fr.getContentPane().add(pn1, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    
}
    public static void main(String[] args) {
        new MainTest();
    }
}


