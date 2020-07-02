/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author camilo
 */
public class Unidad extends javax.swing.JLabel
{   
    private String color;
    private int posX,posY;
    private int tamano;
    
    public Unidad(String color, int x ,int y) 
    {
        this.color = color;
        posX = x;
        posY = y;      
        tamano = 40;
        this.iniciarComponente();
        
    }
    
    private void iniciarComponente()
    {
        this.setBounds(posX, posY, tamano, tamano);
        ImageIcon imagen = new ImageIcon("/home/camilo/Documentos/Metodos y Tecnicas/Tetris/imagenes/unidad_"+ color +".png"); 
        this.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        this.setLayout(null);
        this.setOpaque(false);
        this.setFocusable(true);
    }

    public int getTamano() {
        return tamano;
    }

    public String getColor() {
        return color;
    }

    public int getPosX() {
        return this.getX();
    }

    public int getPosY() {
        return this.getY();
    }
    
    
}
