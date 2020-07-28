/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;


public class Casilla{
    private boolean isFull;
    private Unidad uni;
    private int x , y;
   public Casilla(int x, int y){
    isFull = false;
    this.x = x;
    this.y = y;
   }
    public boolean isFull(){
       return isFull ;
   }
   public void setUnidad(Unidad unidad){
     isFull = true;
     uni = unidad;
   }
   public void llenar(){
       isFull = true;
   }
   public void cambiarEstado(){
       if(isFull == true){
           isFull= false;
       }else{
           isFull= true;
       }
    
   }
   public void vaciar(){
       isFull = false;
   }
   public void setPosY(int nuevaCY){
     y = nuevaCY;
    
    }
}

