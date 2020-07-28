package src.tetris;

import java.util.ArrayList;
/**
 * Write a description of class TableroLog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TableroLog{
    private ArrayList<Fila> tableroLog;
    private ArrayList< Unidad> figEntrante;
    
    public TableroLog(){
        //this.geneFilasY();
        tableroLog = new ArrayList<Fila>();
        this.generarTablero();
   }
   public int getTableroLog(){
        return tableroLog.size();
    }
   public void generarTablero(){
        Fila fila;
        int y = 0;
        for(int j=0;j<20;j++){
         fila= new Fila(y);
         tableroLog.add(fila);
         y=y+40;
        }
    }
   public void setPosicionesFigura(ArrayList<Unidad> figura){
        Fila filap ;
        //figEntrante= figura;
        Casilla casill;
        for(int i=0;i<figura.size(); i++){
            filap = tableroLog.get((figura.get(i).getPosY())/40);
            casill =filap.getListaf().get((figura.get(i).getPosX())/40);
            casill.setUnidad(figura.get(i));
        }
    }
     public void retomarEstado(ArrayList<Unidad> figur){
          Fila filap ;
          Casilla casill;
        for(int i=0;i<figur.size(); i++){
            filap = tableroLog.get((figur.get(i).getPosY())/40);
            casill =filap.getListaf().get((figur.get(i).getPosX())/40);
            casill.cambiarEstado();
        }
    }
    public void eliminarFila(int posicionFil){
        tableroLog.get(posicionFil).limpiarFila();
     }
    public void analizarTablero(){
            Fila filanueva;
            for(int i=0;i<tableroLog.size();i++){
                if(tableroLog.get(i).estaLleno()){
                    eliminarFila(i);
                    tableroLog.remove(i);
                    filanueva = new Fila(0);
                    tableroLog.add(i,filanueva);
                    this.recorrerFilas(i);
               
                } 
            }
     }
     public void recorrerFilas(int posFila){
          Fila filaCopia;
          for(int i=posFila-1; i>=0;i--){
              filaCopia =tableroLog.get(i);
              tableroLog.remove(i);
              filaCopia.setPosicionY((i+1)*40);
              tableroLog.add(i+1,filaCopia);
            }
     } 
     public void imprimirTab(){
         for(int i=0;i<tableroLog.size();i++){
             if(i!=tableroLog.size()-1){
                 tableroLog.get(i).imprimirFila();
                 System.out.print("\n");
             }else{
                 tableroLog.get(i).imprimirFila();
                 System.out.print("\n\n");
             }
         }
     }
}
