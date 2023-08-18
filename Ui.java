//Klasse für Maus-Input (evtl. zu nutzen)

import java.awt.*; 
import java.awt.event.*;
public abstract class Ui extends Canvas implements MouseListener
{
    private int x;
    private int y;
    public Ui()
    {
        addMouseListener(this);
    }
    
    public int render(int y, int x, Frame f)
    {
       return 1; 
    }
    
    public void mouseClicked(MouseEvent e) {
    }  
    public void mouseEntered(MouseEvent e) {  
        System.out.println("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        System.out.println("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        System.out.println("Maus gedrueckt.");  
    }  
    public void mouseReleased(MouseEvent e) {  
        System.out.println("Maus losgelassen.");  
    } 
}