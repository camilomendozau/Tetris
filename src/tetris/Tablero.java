


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
     private boolean   figuraEstaAcomodada;
     private int x,y;
     private ActionListener ac;
     private Timer timer;
     private int retraso;
      ImageIcon image;
      private TableroLog tableroLogico;
      private ArrayList<Unidad> listaAntigua;
      private Figura figPrueba;
      private int idFigura ;
    
    public Tablero ()
    {
       //  idFigura =6;//((int)(Math.random()*7)+1); 
         //x = 160; y = iniciarY(idFigura);
         figuraEstaAcomodada = false ;
         retraso = 1500;
         tableroLogico = new TableroLog();
        // this.iniciarFigura();
          //this.iniciaFiguras();
         //this.dibujarFiguraInicial();
         
        // this.desarrolloJuego();
        ac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {     
                if(y<=figura.getInferior() )    {
                  tableroLogico.retomarEstado(listaAntigua);
                  figura.mover(x, y+40);
                  y = y+40;
                  tableroLogico.setPosicionesFigura(figura.getLista());
                  //tableroLogico.analizarTablero();
                  //figuraEstaAcomodada=figura.estaAcomodado();
                  tableroLogico.imprimirTab();
                  analizarJuego();
                  
                }
             }
        };
         this.iniciarTablero();
        this.iniciarJuego();
       
    }
    private void iniciarJuego(){
            idFigura =1;//((int)(Math.random()*7)+1); 
            x = 160; iniciarY();
            this.iniciarFigura();
            
            this.dibujarFiguraInicial();
            
            timer = new Timer(retraso,ac);
            timer.start();
       }
    
    private void iniciarTablero()
    { 
      ImageIcon imagen = new ImageIcon("imagenes/fondo del cuadro de tetris .png");      
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
    {  //idFigura =((int)(Math.random()*7)+1); 
       switch(idFigura)
       {
           case 1:
               figura = new T(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
           case 2: 
               figura = new S(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
           case 3:
               figura = new Z(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
           case 4:
               figura = new O(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
           case 5:
               figura = new L(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
           case 6:
               figura = new J(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
           case 7:
               figura = new I(x,y);
               figura.setId(idFigura);
               tableroLogico.setPosicionesFigura(figura.getLista());
               this.dibujarFiguraInicial();
               break;
       }    
    }
     private void  iniciarY( ){
         y=0;
      if( idFigura<7 && idFigura>4 ){
            y=80;
        }
      if(idFigura<3){
            y=40;
        }
    }        
   
    private void iniciaFiguras(){
     figPrueba = new O(0,200);
     tableroLogico.setPosicionesFigura(figPrueba.getLista());
     this.dibujarFiguraInicial1(figPrueba);
     figura = new I(120,200);
     tableroLogico.setPosicionesFigura(figura.getLista());
     this.dibujarFiguraInicial1(figura);
     figura = new I(280,0);
     tableroLogico.setPosicionesFigura(figura.getLista());
      this.dibujarFiguraInicial1(figura);
      tableroLogico.imprimirTab();
    }
    private void dibujarFiguraInicial1(Figura fig){
      ArrayList lista = fig.getLista();
      listaAntigua= fig.getLista();
      Unidad unidad;
      for(int i = 0;i<lista.size();i++)
      {    
        unidad = (Unidad) lista.get(i);
        this.add(unidad);
      }
    }
    
    private void dibujarFiguraInicial() 
    {
      ArrayList lista = figura.getLista();
      listaAntigua= figura.getLista();
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
        switch(ke.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN:
             if(y<figura.getInferior())
             {   
              tableroLogico.retomarEstado(listaAntigua);
               figura.mover(x,y+40);
               y = y+40;
                figura.defLimite();
               tableroLogico.setPosicionesFigura(figura.getLista());
               //tableroLogico.analizarTablero();
               //tableroLogico.imprimirTab();
               this.analizarJuego();
             }  
             
            break;
          case KeyEvent.VK_RIGHT:
             if(x<figura.getDerecho())
             { 
               tableroLogico.retomarEstado(listaAntigua);
               figura.mover(x+40,y);
                 x = x+40;
                 figura.defLimite();
               tableroLogico.setPosicionesFigura(figura.getLista());
               //tableroLogico.analizarTablero();
             // tableroLogico.imprimirTab();
             }
            break;
          case KeyEvent.VK_LEFT:   
             if(x>figura.getIzquierdo())
             { 
               tableroLogico.retomarEstado(listaAntigua);
               figura.mover(x-40,y);
               x = x-40;
               figura.defLimite();
               tableroLogico.setPosicionesFigura(figura.getLista());
             //  tableroLogico.analizarTablero();
             // tableroLogico.imprimirTab();
             }  
            break;
        }
      }
    public void cambioRotacion(int aumentoX, int aumentoY ){
          tableroLogico.retomarEstado(listaAntigua);
               x=aumentoX;
               y=aumentoY;
              figura.mover(x,y);
              figura.girar();
              figura.defLimite();
              tableroLogico.setPosicionesFigura(figura.getLista());
              //tableroLogico.analizarTablero();
              //tableroLogico.imprimirTab();
        }
    
    @Override
     public void keyReleased(KeyEvent ke) {
             int car=figura.getcara();
         if(ke.getExtendedKeyCode()== KeyEvent.VK_UP){ 
          if(idFigura<4 && idFigura>0){
           if(x==0 ){
               cambioRotacion(x+40,y);  
            }else if (x==360){
                 cambioRotacion(x-40,y);
              }else if(y==760){
                cambioRotacion(x,y-40);
            }else  if(idFigura<3&&(x==40&&( car<3))){
                cambioRotacion(x-40,y);
            }else if((idFigura<2&& (((x == 280 || x==320)&& car==3)))||(idFigura==3&&(x==320&& car==1)) ){
                cambioRotacion(x+40,y);
            } else if((idFigura ==1&&(y==720 && car==4)) || (idFigura==2&&(y==720&&car== 2))){
                cambioRotacion(x,y+40);
           
            }else{
                cambioRotacion(x,y);
           }
         }
         if (idFigura==5 ){
            if((x==0 && car==1 ) || (x==360&& car==3)||(y==760 && car==4)){
              cambioRotacion(x,y);
            }else if((x==0 && car==2)||(x==40&& car==3)|| ( x==0 && car==2)){
                cambioRotacion(x+40,y);
               }else if(x == 80  && car==4 ){
                   cambioRotacion(x-80,y);
                   }else if((x==320 && car==1)||(x==40 && car==1)||(x==360 && car==4)){
                       cambioRotacion(x-40,y);
                        }else if(x==280 && car==2){
                       cambioRotacion(x+80,y);
                         }else if((y==760 && car==1)||(y==720 && car==2)){
                       cambioRotacion(x,y-40);
                       }else if(y==680 && car==3){
                       cambioRotacion(x,y+80);
                    }else {
                        cambioRotacion(x,y);}
            }
         if(idFigura==6){
                 if(  ( x==40 && car==1)||(x==80 && car==4)){
                     cambioRotacion(x-40,y);
                }else if((x==0&&car==2)||(x==360&&car==4)||(y==760&&car==1)){
                    cambioRotacion(x,y);
                }else if(x == 0 && car==3 ){
                    cambioRotacion(x+80,y);
                   }else if((x==280 && car==2)||(x==320 && car==3)){
                       cambioRotacion(x+40,y);
                    }else if(x==360&&car==1){
                        cambioRotacion(x-80,y);
                    }else if((y==720&&car==4)||(y==680&&car==3)){
                        cambioRotacion(x,y+40);
                     }else if(y==760&&car==2){
                        cambioRotacion(x,y-80);
                        
                       } else{cambioRotacion(x,y);
                    }}
                   if(idFigura==7){
                            if(x==40&&car==1){
                                cambioRotacion(x-40,y);
                            }else if (x==0&& car ==2){
                                cambioRotacion(x+40,y);
                            }else if (x==280&& car ==1){
                                cambioRotacion(x+80,y);
                            }else if (x==360&& car ==2){
                                cambioRotacion(x-80,y);
                            }else if(y==760 && car==1){
                                cambioRotacion(x,y-80);
                            }else if (y==680 && car ==2){
                                cambioRotacion(x,y+80);
                            }else{
                                cambioRotacion(x,y);}
                            }
                        }
                    }
    
   
    /*private void desarrolloJuego(){
       ac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {  
               
             // y = figura.caerLibremente(x, y);
              if(y<figura.getInferior())    {
                  tableroLogico.retomarEstado(listaAntigua);
                  figura.mover(x, y+40);
                  y = y+40;
                  tableroLogico.setPosicionesFigura(figura.getLista());
                  tableroLogico.analizarTablero();
                  // tableroLogico.imprimirTab();
                 //}
            }
         }
       };
       timer = new Timer(retraso,ac); 
       timer.start();  
    }*/
    private void analizarJuego(){
        if(figuraEstaAcomodada()){
            timer.stop();
            tableroLogico.analizarTablero();
             this.iniciarJuego(); 
            this.dibujarFiguraFinal();
           
            
        }        
    }
    private boolean figuraEstaAcomodada()
    {
        figuraEstaAcomodada = (y==figura.getInferior());
        return figuraEstaAcomodada;
    }
            
     private void dibujarFiguraFinal(){
       ArrayList lista = figura.getLista();
       Unidad unidad;
      for(int i = 0;i<lista.size();i++)
      {    
        unidad = (Unidad) lista.get(i);
        this.add(unidad);
      }       
    }
}
    
    
    

 

