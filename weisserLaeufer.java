public class weisserLaeufer extends Laeufer
{
    public weisserLaeufer(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b21 = new Bild("whiteBishop.png");
        b21.setzePosition(120, 420);       
        b22 = new Bild("whiteBishop.png");
        b22.setzePosition(300, 420);
        
       
    }
}
