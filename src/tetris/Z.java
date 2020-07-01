/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Z extends Figura{
private int cara;
    
    public Z(int x,int y)
    {
       color = "rojo"; 
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
      switch(cara)
      {    
          case 1:
            u2 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
            u3 = new Unidad(color,eje.getPosX(),eje.getPosY()+eje.getTamano());
            u4 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
            break;
          case 2:
            u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
            u3 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
            u4 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY()+eje.getTamano());
            break;
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
        if(this.estaEnRango())
        {
           this.establecerPosiciones(); 
        }else{
           cara = 1;
           this.establecerPosiciones();
        }
    }    

    @Override
    public boolean estaEnRango() {
        return cara >= 1 && cara <= 2;
    }
}
