package tetris;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

 /** Write a description of class NextFig here.
 *
 * @author (your name)
 * @version (a version number or a date)
 **/
public class NextFig extends JPanel{
    private Figura nextf;
 public NextFig(){
     this.iniciarTabla();
 }
 private void iniciarTabla(){
    ImageIcon imagen = new ImageIcon("imagenes/TabPos.png");
   this.setVisible(true);
   JLabel imagNextF = new JLabel();
   imagNextF.setSize(230,370);
   imagNextF.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(230, 370, Image.SCALE_SMOOTH)));
   this.add(imagNextF);
   this.setLayout(null);
   this.setOpaque(false);
   this.setBounds(710,10, 230, 370);
   this.setFocusable(true);
    
 }
 public void dibujarFiguraSigte(){
    
    
 }
}