/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tablero extends JPanel implements KeyListener{
    
     private Figura figura;
     private int x,y;
     private int retraso;
     ImageIcon imagen;
     private ActionListener ac;
     private Timer timer; 
    
    public Tablero ()
    {
        x = 200; y = -80;
        retraso = 1500;
        this.iniciarTablero();
        this.iniciarFigura();
        this.dibujarFiguraInicial();
        this.desarrolloJuego();
    }
    private void iniciarTablero()
    { 
      imagen = new ImageIcon("imagenes/fondo del cuadro de tetris .png");      
      this.setVisible(true);
      JLabel imgTablero = new JLabel();
      imgTablero.setSize(400, 800);
      imgTablero.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400, 800, Image.SCALE_SMOOTH)));
      this.add(imgTablero);
      this.setLayout(null);
      this.setOpaque(false);
      this.setBounds(300, 0, 400, 830);  
      this.addKeyListener(this);
      this.setFocusable(true);
    }        
    private void iniciarFigura()      
    {  int idFigura = ((int)(Math.random()*7)+1); 
       switch(idFigura)
       {
           case 1:
               figura = new T(x,y);
               break;
           case 2: 
               figura = new S(x,y);
               break;
           case 3:
               figura = new Z(x,y);
               break;
           case 4:
               figura = new O(x,y);
               break;
           case 5:
               figura = new L(x,y);
               break;
           case 6:
               figura = new J(x,y);
               break;
           case 7:
               figura = new I(x,y);        
       }    
    }
    private void dibujarFiguraInicial() 
    {
      ArrayList lista = figura.getLista();
      Unidad unidad;
      for(int i = 0;i<lista.size();i++)
      {    
        unidad = (Unidad) lista.get(i);
        this.add(unidad);
      }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch(ke.getExtendedKeyCode())
        {
          case KeyEvent.VK_UP: 
            figura.girar();
            break;
          case KeyEvent.VK_DOWN:
             if(figura.estaEnTablero(2))
             {    
               figura.mover(x,y+40);
               y = y+40;
             }  
            break;
          case KeyEvent.VK_RIGHT:
             if(figura.estaEnTablero(0))
             {    
               figura.mover(x+40,y);
               x = x+40;
             }
            break;
          case KeyEvent.VK_LEFT:   
             if(figura.estaEnTablero(1))
             {  
               figura.mover(x-40,y);
               x = x-40;
             }  
            break;
        }
    }

    private void desarrolloJuego(){
       ac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {  
              y = figura.caerLibremente(x, y);
            }
       };
       timer = new Timer(retraso,ac); 
       timer.start();  
    }
}
