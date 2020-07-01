/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;
import javax.swing.JPanel;

public abstract class Figura { 
   protected Unidad eje, u2 , u3, u4; 
   protected ArrayList<Unidad> listaUnidades;
   protected String color;
   
    //abstract public void dibujar(JPanel tablero);
    abstract public void girar();
    abstract public void mover();
    abstract public void establecerPosiciones();
    abstract public ArrayList<Unidad> getLista();
    abstract public boolean estaEnRango();
}
