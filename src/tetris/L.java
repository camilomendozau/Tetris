
package tetris;

import java.util.ArrayList;

public class L extends Figura{
    private int cara;
    
    public L(int x,int y)
    {
       color = "naranja"; 
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
            u3.setLocation(eje.getPosX(),eje.getPosY()-(eje.getTamano()*2));
            u4.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY());
            break;
          case 2:
            u2.setLocation(eje.getPosX()+eje.getTamano(),eje.getPosY());
            u3.setLocation(eje.getPosX()+(eje.getTamano()*2),eje.getPosY());
            u4.setLocation(eje.getPosX(),eje.getPosY()+eje.getTamano());
            break;
          case 3:
            u2.setLocation(eje.getPosX(),eje.getPosY()+eje.getTamano());
            u3.setLocation(eje.getPosX(),eje.getPosY()+(eje.getTamano()*2));
            u4.setLocation(eje.getPosX()-eje.getTamano(),eje.getPosY());
            break; 
          case 4:
            u2.setLocation(eje.getPosX(),eje.getPosY()-eje.getTamano());
            u3.setLocation(eje.getPosX()-eje.getTamano(),eje.getPosY());
            u4.setLocation(eje.getPosX()-(eje.getTamano()*2),eje.getPosY());
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
        return cara >= 1 && cara <= 4;
    }
    
    @Override
    protected void iniciarPosiciones() {
        u2 = new Unidad(color,eje.getPosX(),eje.getPosY()-eje.getTamano());
        u3 = new Unidad(color,eje.getPosX(),eje.getPosY()-(eje.getTamano()*2));
        u4 = new Unidad(color,eje.getPosX()+eje.getTamano(),eje.getPosY());
        listaUnidades.add(eje); listaUnidades.add(u2); listaUnidades.add(u3); listaUnidades.add(u4);
    }
}
