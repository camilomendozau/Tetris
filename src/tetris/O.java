/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;

public class O extends Figura{
    private final int cara;
    
    public O(int x,int y)
    {
       color = "amarillo"; 
       cara = 2;
       eje = new Unidad(color,x,y);
       this.establecerPosiciones();
       listaUnidades = new ArrayList<Unidad>();
       listaUnidades.add(eje); listaUnidades.add(u2); listaUnidades.add(u3); listaUnidades.add(u4);
    }        

    /*@Override
    public void dibujar(JPanel tablero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }*/

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void establecerPosiciones() {
        System.out.println(cara);
            u2 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY());
            u3 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
            u4 = new Unidad(color,eje.getPosX(),eje.getPosY()+eje.getTamano());     
    }
    
    @Override
    public ArrayList<Unidad> getLista()
    {
        return listaUnidades;
    }

    @Override
    public void girar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           this.establecerPosiciones();
    }

    @Override
    public boolean estaEnRango() {
        return true;
    }
}
