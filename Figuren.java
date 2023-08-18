
/**
 * Platz für Kommentare, wohin auch immer man sieht...
 * 
 *
 *
 */
public class Figuren 
{
    protected int x, y;
    protected int vx, vy;
    private int anzahl;
    protected Figuren[] figuren; //Array
    protected Bild b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32;
    

    private CBild            obj;
    protected int            breite        = 0;
    protected int            hoehe        = 0;
    protected int            xPos        = 0;
    protected int            yPos        = 0;
    
        
    public Figuren(int xStart, int yStart)
    {
        figuren = new Figuren[31]; //Initialisieren des Array
        
        x = xStart;
        y = yStart;
        vx = 0;
        vy = 0;
    }
    
    public void loescheAlle()
    {
        while (anzahl>0)
        {
                entferne(figuren[0]);
        }
    }
    
    public void entferne(Figuren elementAlt)
    {
        for (int i = 0; i < anzahl; i++)
        {
             if (elementAlt == figuren[i])
             {
                    figuren[i] = figuren[anzahl - 1];
                    figuren[anzahl - 1] = null;
                    anzahl = anzahl - 1;
            }
        }
    }
    
    public void bewege(int zeit)
    {
        x = x + vx * zeit;
        y = y + vy * zeit;
    }
    
    public void setzePosition(int neuesX, int neuesY) 
    {
        xPos = neuesX;
        yPos = neuesY;
        obj.setzePosition(xPos, yPos);
    }

}
