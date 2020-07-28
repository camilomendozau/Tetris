/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;

public class Fila{
    private ArrayList<Casilla> fila;
    private int y;
    public Fila(int y){
        fila= new ArrayList<Casilla>();
        this.y = y;
        this.generarFila();
    }
    public boolean estaLleno(){
       int i = 0;
       boolean res = true;
       Casilla cas;
       while(i<fila.size()&& res!= false){
          cas = fila.get(i);
          if(cas.isFull()){
              i++;
              res = true;
             }else{
              res = false;
          }
       }
       return res;
    }
    public void limpiarFila(){
     for(Casilla cas: fila){
        cas.vaciar();
     }
   }
   private void generarFila(){
        Casilla casilla;
        int x = 0;
        for(int i=0;i<10;i++){
         casilla = new Casilla(x,y);
         fila.add(casilla);
         x=x+40;
        }
    }
   public void setPosicionY(int nuevaY){
       y =nuevaY;
       for(Casilla casilla:fila ){
           casilla.setPosY(y);
       }
   }
    public ArrayList<Casilla> getListaf(){
        return fila;
   }
   public void imprimirFila(){
    for(Casilla casilla: fila){
        if(casilla.isFull()){
         System.out.print("true  ");
        }else{
         System.out.print("false ");
        }
    
    }
    
   }
}

