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

public class Z extends Figura{
    
<<<<<<< HEAD
    //private int cara;
=======
    private int cara;
>>>>>>> master
    
    public Z(int x,int y)
    {
       color = "rojo"; 
       cara = 1;
       eje = new Unidad(color,x,y);
       listaUnidades = new ArrayList<Unidad>();
       this.iniciarPosiciones();
    }        

    @Override
    protected void iniciarPosiciones()
    {
        u2 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
        u3 = new Unidad(color,eje.getPosX(),eje.getPosY()+eje.getTamano());
        u4 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
       listaUnidades.add(eje); listaUnidades.add(u2); listaUnidades.add(u3); listaUnidades.add(u4);
    }        

    @Override
    public void establecerPosiciones() {
<<<<<<< HEAD
       // System.out.println(eje.getX()+","+eje.getY());
=======
        System.out.println(eje.getX()+","+eje.getY());
>>>>>>> master
      switch(cara)
      {    
          case 1:
            u2.setLocation(eje.getPosX()-eje.getTamano(),eje.getPosY());
            u3.setLocation(eje.getPosX(),eje.getPosY()+eje.getTamano());
            u4.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());  
            break;
          case 2:
            u2.setLocation(eje.getPosX(),eje.getPosY()-eje.getTamano());
            u3.setLocation(eje.getPosX()-eje.getTamano(),eje.getPosY());
            u4.setLocation(eje.getPosX()-eje.getTamano(),eje.getPosY()+eje.getTamano());
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
