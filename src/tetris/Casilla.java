package src.tetris;


/**
 * Write a description of class Casilla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
      isFull= false;
      //uni= null;
       
   }
   public void vaciar(){
      isFull = false;
      uni.setIcon(null);
      uni.revalidate();
      uni = null;
   }
   public void setPosY(int nuevaCY){
     y = nuevaCY;
    
    }
}
