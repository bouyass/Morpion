/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javafx.scene.layout.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lyes
 */

public class Vue extends JFrame   {
       Image image =  Toolkit.getDefaultToolkit().createImage("Background.png");;
       JLabel[][] plateau = new JLabel[3][3];
       JPanel panneau = new JPanel(new GridLayout(3,3)) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(, 0, 0, null);
            }
        };
    Color couleur = new Color(153, 76, 0); 
 
    public Vue(){
         drawBoard();
         panneau.setBounds(0, 0, 300, 300);
         this.getContentPane().setLayout(null);
         this.setSize(300, 300);
         this.setTitle("Morpion");
         this.setVisible(true);
         
    }
    
    public void drawBoard(){
        for (int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
               plateau[i][j] = new JLabel();
               plateau[i][j].setOpaque(true);
               plateau[i][j].setBackground(couleur);
               plateau[i][j].setPreferredSize(new Dimension(100,100));
             
               panneau.add(plateau[i][j]);
               
            }
        }
        this.getContentPane().add(panneau);
    }
    
 
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
     
}
}
