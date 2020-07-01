/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;


public class J extends Figura{
    private int cara;
    
    public J(int x,int y)
    {
       color = "azul"; 
       cara = 4;
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
            u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
            u3 = new Unidad(color,eje.getPosX(),eje.getPosY()-(eje.getTamano()*2));
            u4 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
            break;
          case 2:
            u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
            u3 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY());
            u4 = new Unidad(color,eje.getPosX()+(eje.getTamano()*2),eje.getPosY());
            break;
          case 3:
            u2 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY());
            u3 = new Unidad(color,eje.getPosX(),eje.getPosY()+eje.getTamano());
            u4 = new Unidad(color,eje.getPosX(),eje.getPosY()+(eje.getTamano()*2));
            break; 
          case 4:
            u2 = new Unidad(color,eje.getPosX(),eje.getPosY()+eje.getTamano());
            u3 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
            u4 = new Unidad(color,eje.getPosX()-(eje.getTamano()*2),eje.getPosY());
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
        return cara >= 1 && cara <= 4;
    }
}
