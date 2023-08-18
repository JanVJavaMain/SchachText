public class schwarzeDame extends Dame
{
    public schwarzeDame(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b30 = new Bild("blackQueen.png");
        b30.setzePosition(180, 0);
        
       
    }
}