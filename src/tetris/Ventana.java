/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame implements ActionListener{

    private Tablero tablero;
    private Tablero_puntuacion Tab_pun;
    private NextFig sigteF;
     JPanel fondo;
     JButton boton1;
    public Ventana()
    {   
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        this.setSize(1000, 830);
        this.setResizable(false);
        this.setTitle("TETRIS CMB");
        this.setLocationRelativeTo(null);
        this.setLayout(null); //importante para que muestre los componentes
        //this.setContentPane(f);
        this.iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         Image miIcono =mipantalla.getImage("imagenes/log.png");
        setIconImage(miIcono);
    }
    
    private void iniciarComponentes()
    {  
      tablero = new Tablero();
      this.getContentPane().add(tablero);
      Tab_pun =new Tablero_puntuacion();
      //tab_pun.setvis
      this.getContentPane().add(Tab_pun);
      sigteF = new NextFig();
      this.getContentPane().add(sigteF);
      this.logo();
      this.colocarBotones();
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
          this.getContentPane().add(fondo);
      
    }
    private void colocarBotones(){
        
         boton1= new JButton();
         boton1.setBounds(800,700,150,50);
         ImageIcon clic= new ImageIcon("imagenes/salir.png");
         boton1.setIcon(new ImageIcon(clic.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH)));
         //fondo.add(boton1);
         this.getContentPane().add(boton1);
         boton1.addActionListener(this);
       }
    @Override
      public void actionPerformed(ActionEvent e){
          
               System.exit(WIDTH);
            
      }
    private void logo(){
        JPanel icono = new JPanel();
        JLabel icon = new JLabel();
        ImageIcon image = new ImageIcon("imagenes/log.png");
        icon.setSize(280,280);
        icon.setIcon(new ImageIcon(image.getImage().getScaledInstance(280,280,Image.SCALE_SMOOTH)));
        icono.add(icon);
        icono.setBounds(20,60,300,300);
        icono.setLayout(null);
        this.getContentPane().add(icon);
    }
}
