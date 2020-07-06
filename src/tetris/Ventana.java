/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame{
    
    private Tablero tablero;
    
    public Ventana()
    {   
        this.setSize(1000, 830);
        this.setResizable(false);
        this.setTitle("TETRIS CMB");
        //this.setBounds(20,40,1000,800);
        this.setLocationRelativeTo(null);
        this.setLayout(null); //importante para que muestre los componentes
        //this.setContentPane(f);
        this.iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes()
    {  
      tablero = new Tablero();
      this.getContentPane().add(tablero);
      this.iniciarFondo();
      
    }        
    
    private void iniciarFondo()
        { 
          JPanel fondo = new JPanel();
          
          JLabel imgFondo = new JLabel();    
          ImageIcon imagen = new ImageIcon("imagenes/fondo.png");
          imgFondo.setSize(1000, 800);
          imgFondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH)));
          fondo.add(imgFondo);
          fondo.setSize(1000, 800);    
          fondo.setLayout(null); 
          fondo.setOpaque(false);   
          //fondo.setBackground(Color.MAGENTA);
          this.getContentPane().add(fondo);
      
    }
}
