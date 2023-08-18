public class schwarzerLaeufer extends Laeufer
{
    public schwarzerLaeufer(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b23 = new Bild("blackBishop.png");
        b23.setzePosition(120, 0);
        b24 = new Bild("blackBishop.png");
        b24.setzePosition(300, 0);
       
    }
}
