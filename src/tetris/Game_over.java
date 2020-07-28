package src.tetris;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Beimar
 */
public class Game_over extends javax.swing.JFrame implements ActionListener {
     JPanel fondo;
     JButton boton1;
     JButton boton2;
     JButton boton3;
    public Game_over(){ 
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
         this.boton(); 
         this.logo();
         this.iniciarFondo();
         this.colocarBotones();
         
       }
    private void iniciarFondo()
        { 
          fondo = new JPanel();
          JLabel imgFondo = new JLabel();    
          ImageIcon imagen = new ImageIcon("imagenes/fgameover.jpg");
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
         logotipo.setBounds(0,0,500,150);
         ImageIcon image = new ImageIcon("imagenes/logogameover.jpg");
         logo.setBounds(0,0,500,150);
         logo.setIcon(new ImageIcon(image.getImage().getScaledInstance(500,150,Image.SCALE_SMOOTH)));
         logotipo.add(logo);
         logotipo.setLayout(null);
        this.getContentPane().add(logo);
    }
    
    private void colocarBotones(){
         boton1= new JButton();
         
         
         boton1.setBounds(50,400,100,50);
         ImageIcon clic= new ImageIcon("imagenes/inicio.png");
         boton1.setIcon(new ImageIcon(clic.getImage().getScaledInstance(boton1.getWidth()+15, boton1.getHeight()+15, Image.SCALE_SMOOTH)));
         // boton1.setEnabled(true);//
         //boton1.setMnemonic()//para dar comando con el teclado
         fondo.add(boton1);
     
         //boton cierre del programa
          boton1.addActionListener(this);
    }
    private void boton(){
            boton2=new JButton();
            boton2.setBounds(200,400,100,50);
            ImageIcon click= new ImageIcon("imagenes/denuevo.png");
            boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth()+10,boton2.getHeight()+10, Image.SCALE_SMOOTH)));
            //fondo.add(boton2);
            this.getContentPane().add(boton2);
       
          
           boton2.addActionListener(this);
           boton3= new JButton();
           boton3.setBounds(350, 400, 100, 50);
           ImageIcon imag = new ImageIcon("imagenes/Isalir.png");
           boton3.setIcon(new ImageIcon(imag.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
           //fondo.add(boton3);
           boton3.addActionListener(this);
           this.getContentPane().add(boton3);
        }  
         
    
   
     @Override
      public void actionPerformed(ActionEvent e){
           if(e.getSource()==boton1){
               VentanaInicio n= new VentanaInicio();
               n.setVisible(true);
               dispose();
            
        }
           if(e.getSource()==boton2){
            Ventana p = new Ventana ();
               p.setVisible(true); 
               //dispose();
              
           }
           if(e.getSource()==boton3){
               System.exit(WIDTH);
           }
      }
    
}

