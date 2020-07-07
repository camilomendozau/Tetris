/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Figura { 
   protected Unidad eje, u2 , u3, u4; 
   protected ArrayList<Unidad> listaUnidades;
   protected String color;
   protected int cara;
   
    abstract protected void iniciarPosiciones();   
    abstract public void girar();
    public int caerLibremente(int x, int y)
    {
        this.mover(x, y+40);
        return y+40;
    }
         
    public void mover(int x, int y) {
        eje.setLocation(x, y);
        eje.actualizarPosiciones(x, y);
        this.establecerPosiciones();
    }     
    
    abstract public void establecerPosiciones();
    abstract public ArrayList<Unidad> getLista();
    abstract protected boolean estaEnRango();
}
