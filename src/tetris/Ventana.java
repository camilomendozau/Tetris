/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;


import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame{
    
    private JPanel tablero;
    
    public Ventana()
    {   
        this.setSize(1000, 800);
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
      
      this.iniciarTablero();
      this.dibujarFigura();
      this.iniciarFondo();
    }        
    
    private void iniciarFondo()
        { 
          JPanel fondo = new JPanel();
          
          JLabel imgFondo = new JLabel();    
          ImageIcon imagen = new ImageIcon("/home/camilo/Documentos/Metodos y Tecnicas/Tetris/imagenes/fondo.png");
          imgFondo.setSize(1000, 800);
          imgFondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH)));
          fondo.add(imgFondo);
          fondo.setSize(1000, 800);    
          fondo.setLayout(null);
          
          //fondo.setOpaque(false);
      
          //fondo.setBackground(Color.MAGENTA);
          this.getContentPane().add(fondo);
      
    }
    
    private void iniciarTablero()
    { 
      tablero = new JPanel();
      ImageIcon imagen = new ImageIcon("/home/camilo/Documentos/Metodos y Tecnicas/Tetris/imagenes/fondo del cuadro de tetris .png");      
      //tablero.setBackground(Color.YELLOW);
      //tablero.setVisible(true);
      JLabel imgTablero = new JLabel();
      imgTablero.setSize(400, 800);
      imgTablero.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400, 800, Image.SCALE_SMOOTH)));
      tablero.add(imgTablero);
      tablero.setLayout(null);
      //tablero.setOpaque(false);
      this.getContentPane().add(tablero);
      tablero.setBounds(300, 0, 400, 800);
      
    }        

    private void dibujarFigura() 
    {
      Figura figura = new I(100,100);
      ArrayList lista = figura.getLista();
      Unidad unidad;
      for(int i = 0;i<lista.size();i++)
      {    
        unidad = (Unidad) lista.get(i);
        tablero.add(unidad);
      }
    }
    
}
