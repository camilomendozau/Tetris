<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.tetris;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Beimar
 */
public class Tablero_puntuacion extends JPanel {
       // JTextField textField
       private int score;
       private int linea;
       private int nivel;
     public Tablero_puntuacion(){
        this.iniciarTabla();
     }
     private void iniciarTabla(){
      ImageIcon imagen = new ImageIcon("imagenes/TabPos.png");      
      this.setVisible(true);
      JLabel imgPuntuacion = new JLabel();
      imgPuntuacion.setSize(260, 420);
      imgPuntuacion.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(260, 420, Image.SCALE_SMOOTH)));
      this.add(imgPuntuacion);
      this.setLayout(null);
      this.setOpaque(false);
      this.setBounds(20,360, 260, 450);  
      this.setFocusable(true);
     }
     
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Beimar
 */
public class Tablero_puntuacion extends JPanel {
     public Tablero_puntuacion(){
        this.iniciarTabla();
     }
     private void iniciarTabla(){
         ImageIcon imagen = new ImageIcon("imagenes/TabPos.png");      
      this.setVisible(true);
      JLabel imgPuntuacion = new JLabel();
      imgPuntuacion.setSize(260, 420);
      imgPuntuacion.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(260, 420, Image.SCALE_SMOOTH)));
      this.add(imgPuntuacion);
      this.setLayout(null);
      this.setOpaque(false);
      this.setBounds(20,360, 260, 450);  
      this.setFocusable(true);
     }
    
}
>>>>>>> master
