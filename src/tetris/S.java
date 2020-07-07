/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;

public class S extends Figura{
    private int cara;
    
    public S(int x,int y)
    {
       color = "verde"; 
       cara = 1;
       eje = new Unidad(color,x,y);
       listaUnidades = new ArrayList<Unidad>();
       this.iniciarPosiciones();
    }        

    @Override
    public void establecerPosiciones() {
        System.out.println(eje.getX()+","+eje.getY());    
            switch(cara)
            {    
                case 1:
                  u2.setLocation(eje.getPosX(),eje.getPosY()-eje.getTamano());
                  u3.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY()-eje.getTamano());
                  u4.setLocation(eje.getPosX()-eje.getTamano(),eje.getPosY());
                  break;
                case 2:
                  u2.setLocation(eje.getPosX(),eje.getPosY()-eje.getTamano());
                  u3.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY());
                  u4.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY()+eje.getTamano());
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
    protected boolean estaEnRango()
    {
      return cara >= 1 && cara <= 2;
    }

    @Override
    protected void iniciarPosiciones() {
        u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
        u3 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY()-eje.getTamano());
        u4 = new Unidad(color,eje.getPosX()-eje.getTamano(),eje.getPosY());
        listaUnidades.add(eje); listaUnidades.add(u2); listaUnidades.add(u3); listaUnidades.add(u4);
    }

}
