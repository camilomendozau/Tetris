/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package src.tetris;
=======
package tetris;
>>>>>>> master

import java.util.ArrayList;

public class O extends Figura{
<<<<<<< HEAD
   // private final int cara;
=======
    private final int cara;
>>>>>>> master
    
    public O(int x,int y)
    {
       color = "amarillo"; 
       cara = 1;
       eje = new Unidad(color,x,y);
       listaUnidades = new ArrayList<Unidad>();
       this.iniciarPosiciones();
    }        
    
    @Override
    public void establecerPosiciones() {
<<<<<<< HEAD
        //System.out.println(eje.getX()+","+eje.getY());
=======
        System.out.println(eje.getX()+","+eje.getY());
>>>>>>> master
            u2.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY());
            u3.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
            u4.setLocation(eje.getPosX(),eje.getPosY()+eje.getTamano());     
    }
    
    @Override
    public ArrayList<Unidad> getLista()
    {
        return listaUnidades;
    }

    @Override
    public void girar() {
           this.establecerPosiciones();
    }

    @Override
    protected boolean estaEnRango() {
        return true;
    }

    @Override
    protected void iniciarPosiciones() {
        u2 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY());
        u3 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
        u4 = new Unidad(color,eje.getPosX(),eje.getPosY()+eje.getTamano());    
        listaUnidades.add(eje); listaUnidades.add(u2); listaUnidades.add(u3); listaUnidades.add(u4);
    }
}
