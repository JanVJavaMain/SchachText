public class weisserTurm extends Turm
{
    public weisserTurm(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b25 = new Bild("whiteRook.png");
        b25.setzePosition(0, 420);
        b26 = new Bild("whiteRook.png");
        b26.setzePosition(420, 420);
        
       
    }
}
