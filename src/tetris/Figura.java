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
    abstract protected void iniciarPosiciones();   
    abstract public void girar();
    public int caerLibremente(int x, int y)
    { int res = 0;
       if(this.estaEnTablero(2)){
        this.mover(x, y+40);
        res = y+40;
       } 
      return res; 
    }
         
    public boolean estaAcomodado(){
        return eje.getY()==760;
    }
    
    public void mover(int x, int y) {  
        eje.actualizarPosiciones(x, y);
        this.establecerPosiciones();   
    }     
    
    public boolean estaEnTablero(int n)
    { boolean res = true;
      switch(n)
      {  
          case 0:
              res = eje.estaEnRango(n) && u2.estaEnRango(n) && u3.estaEnRango(n) && u4.estaEnRango(n);
            break;
          case 1:
              res = eje.getPosX()>=40 && u2.getPosY()>=40 && u3.getPosX()>=40 && u4.getPosX()>=40;
            break;  
          case 2:  
              res = eje.getY()<=740 && u2.getY()<=740 && u3.getY()<=740 && u4.getY()<=740;
            break;  
      }  
      return res;
    }
    
    abstract public void establecerPosiciones();
    abstract public ArrayList<Unidad> getLista();
    abstract protected boolean estaEnRango();
}
