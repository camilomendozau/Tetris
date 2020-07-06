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
       cara = 1;
       eje = new Unidad(color,x,y);
       listaUnidades = new ArrayList<Unidad>();
       this.iniciarPosiciones();
    }        
    
    @Override
    public void establecerPosiciones() {
        System.out.println(eje.getX()+","+eje.getY());
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
