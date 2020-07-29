/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;

public abstract class Figura { 
   protected Unidad eje, u2 , u3, u4; 
   protected ArrayList<Unidad> listaUnidades;
   protected String color;
   protected int cara;
   private int idFigura;
   private int limDerecho;
   private int limIzquierdo;
   private int limInferior;
   
    abstract protected void iniciarPosiciones();   
    abstract public void girar();
    /*public int caerLibremente(int x, int y)
    { int res = 0;
       if(this.estaEnTablero(2)){
          // tableroLogico.retomarEstado(listaAntigua);
        this.mover(x, y+40);
        res = y+40;
       } 
      return res; 
    }*/ 
   
     public void mover(int x, int y) {
        //eje.setLocation(x, y);
        eje.actualizarPosiciones(x, y);
        this.establecerPosiciones();
    } 
    /* public boolean estaEnTablero(int n)
    { boolean res = true;
        
      switch(n)
      {  
          
          case 0:
              res = eje.getPosX()<=limDerecho && u2.estaEnRango(n) && u3.estaEnRango(n) && u4.estaEnRango(n);//derecha
            break;
          case 1:
              res = eje.getPosX()>=limIzquierdo&& u2.getPosX()>=40 && u3.getPosX()>=40 && u4.getPosX()>=40;//izquierda
            break;  
          case 2:  
              res = eje.getY()<=limInferior && u2.getY()<=740 && u3.getY()<=740 && u4.getY()<=740; //abajo
            break; 
        }
        return res;
    }*/
    public void defLimite(){
        switch(idFigura){
            case 1 :
            limIzquierdo=40;
            limDerecho=320;
            limInferior=720;
                if(cara==1){
                    //limIzquierdo=40;
                    //limDerecho=320;
                    limInferior=760;
                }
                if(cara==2){
                    limIzquierdo=0;
                    //limDerecho=320;
                    //limInferior=720;
                }
                if(cara==4){
                    //limIzquierdo=40;
                    limDerecho=360;
                    //limInferior=720;
                }
        break;
        case 2:
          limIzquierdo=40;
          limDerecho=320;
          limInferior=720;
               if(cara==1){
                    //limIzquierdo=40;
                    //limDerecho=320;
                    limInferior=760;
                }
                if(cara==2){
                    limIzquierdo=0;
                    //limInferior=720;
                }
         break;
         case 3:
          limIzquierdo=40;
          limDerecho=320;
          limInferior=720;
          if(cara==2){
                   limDerecho= 360;
                }
         break;
         case 4 : 
          limIzquierdo=0;
          limDerecho=320;
          limInferior=720;
          break;
          case 5:
              limIzquierdo=40;
              limDerecho=320;
              limInferior=760;
               if (cara ==1){
                   limIzquierdo= 0;
             
               }
               if (cara ==2){
                   limDerecho=280;
                   limIzquierdo=0;
                   limInferior=720;
                }
                if (cara==3){
                    limInferior=680;
                    limDerecho=360;
                }
                if(cara==4){
                    limIzquierdo=80;
                    limDerecho=360;            
                }
           break;
          case 6:
              limIzquierdo=0;
              limDerecho=360;
              limInferior=760;
              if(cara==1){
                limIzquierdo=40;
                }
              if(cara==2){
                  //limIzquierdo=40;
                  limDerecho=280;
                }
              if(cara==3){
                  //limIzquierdo=0;
                  limDerecho=320;
                  limInferior=680;
                }
              if(cara==4){
                  limIzquierdo=80;
                  limInferior=720;
                } 
                break;
          case 7:
              limIzquierdo=40;
              limDerecho=280;
              limInferior=760;
              if(cara==2){
                  limDerecho=360;
                  limIzquierdo=0;
                  limInferior=680;
                }
        }
        
    } 
    public boolean estaAcomodado(){
        return eje.getY()==760;
    }
    public int getIzquierdo(){
        return limIzquierdo;
    }
     public int getDerecho(){
        return limDerecho;
    }
     public int getInferior(){
        return limInferior;
    }
    public int getcara(){
        return cara;
    }
   
    public void setId(int n)
    {
        idFigura=n;
    } 
    abstract public void establecerPosiciones();
    abstract public ArrayList<Unidad> getLista();
    abstract protected boolean estaEnRango();

}
