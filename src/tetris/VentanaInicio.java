/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class VentanaInicio extends javax.swing.JFrame implements ActionListener {
     JPanel fondo;
     JButton boton1;
     JButton boton2;
    public VentanaInicio(){ 
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        this.setSize(500, 500);
        this.setResizable(false);
        this.setTitle("TETRIS CMB");
        this.setLocationRelativeTo(null);
        this.setLayout(null); //importante para que muestre los componentes
        this.iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Image miIcono =mipantalla.getImage("imagenes/log.png");
        setIconImage(miIcono);
    }
    

    private void iniciarComponentes() {
         this.logo();
         this.iniciarFondo();
         this.colocarBotones();
       }
    private void iniciarFondo()
        { 
          fondo = new JPanel();
          JLabel imgFondo = new JLabel();    
          ImageIcon imagen = new ImageIcon("imagenes/fondo.png");
          imgFondo.setSize(500, 500);
          imgFondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH)));
          fondo.add(imgFondo);
          fondo.setSize(500, 500);    
          fondo.setLayout(null);
          fondo.setOpaque(false);
          this.getContentPane().add(fondo);
      
    }
    private void logo(){
         JPanel logotipo = new JPanel();
         JLabel logo = new JLabel();
         logotipo.setBounds(100,50,250,220);
         ImageIcon image = new ImageIcon("imagenes/log.png");
         logo.setBounds(100,50,250,220);
         logo.setIcon(new ImageIcon(image.getImage().getScaledInstance(250,220,Image.SCALE_SMOOTH)));
         logotipo.add(logo);
         logotipo.setLayout(null);
        this.getContentPane().add(logo);
    }
    private void colocarBotones(){
         boton1= new JButton();
         boton2=new JButton();
         boton1.setBounds(150,300,200,40);
         ImageIcon clic= new ImageIcon("imagenes/start.png");
         boton1.setIcon(new ImageIcon(clic.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
         // boton1.setEnabled(true);//
         //boton1.setMnemonic()//para dar comando con el teclado
         fondo.add(boton1);
     
         //boton cierre del programa
          boton2.setBounds(150,400,200,40);
          ImageIcon click= new ImageIcon("imagenes/salir.png");
          boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth()+20, boton2.getHeight()+20, Image.SCALE_SMOOTH)));
          fondo.add(boton2);
       
          boton1.addActionListener(this);
          boton2.addActionListener(this);
    }
   
     @Override
      public void actionPerformed(ActionEvent e){
           if(e.getSource()==boton1){
               Ventana p = new Ventana ();
               p.setVisible(true);
               dispose();
            
        }
           if(e.getSource()==boton2){
           System.exit(WIDTH);
           }
      }
    
}
     
            
      
       
      


