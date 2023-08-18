public class schwarzesPferd extends Pferd
{
    public schwarzesPferd(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b19 = new Bild("blackKnight.png");
        b19.setzePosition(60, 0);
        b20 = new Bild("blackKnight.png");
        b20.setzePosition(360, 0);
       
    }
}
