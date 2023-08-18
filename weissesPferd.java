public class weissesPferd extends Pferd
{
    public weissesPferd(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b17 = new Bild("whiteKnight.png");
        b17.setzePosition(60, 420);
        b18 = new Bild("whiteKnight.png");
        b18.setzePosition(360, 420);
    }
}