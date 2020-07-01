/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

public class S extends Figura{
    private int cara;
    
    public S(int x,int y)
    {
       color = "verde"; 
       cara = 1;
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
        if(this.estaEnRango())
        {    
            switch(cara)
            {    
                case 1:
                  u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
                  u3 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()-eje.getTamano());
                  u4 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
                  break;
                case 2:
                  u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
                  u3 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY());
                  u4 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
                  break;
            }
        }    
    }
    
    @Override
    public ArrayList<Unidad> getLista()
    {
        return listaUnidades;
    }

    @Override
    public void girar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        cara ++;  
        if(cara >= 1 && cara <= 2)
        {
           this.establecerPosiciones(); 
        }else{
           cara = 1;
           this.establecerPosiciones();
        }
    }

    @Override
    public boolean estaEnRango() {
        return cara >= 1 && cara <= 4;
    }
}
