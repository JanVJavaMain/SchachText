public class schwarzerTurm extends Turm
{
    public schwarzerTurm(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        b27 = new Bild("blackRook.png");
        b27.setzePosition(0, 0);
        b28 = new Bild("blackRook.png");
        b28.setzePosition(420, 0);
       
    }
}
