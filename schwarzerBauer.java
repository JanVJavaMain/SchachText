public class schwarzerBauer extends Bauer
{
    private schwarzerBauer[] schwarzeBauer;
    
    public schwarzerBauer(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        schwarzeBauer = new schwarzerBauer[8];
        
        b9 = new Bild("blackPawn.png");
        b9.setzePosition(0, 60);
        b10 = new Bild("blackPawn.png");
        b10.setzePosition(60, 60);        
        b11 = new Bild("blackPawn.png");
        b11.setzePosition(120, 60);
        b12 = new Bild("blackPawn.png");
        b12.setzePosition(180, 60);
        b13 = new Bild("blackPawn.png");
        b13.setzePosition(240, 60);
        b14 = new Bild("blackPawn.png");
        b14.setzePosition(300, 60);
        b15 = new Bild("blackPawn.png");
        b15.setzePosition(360, 60);
        b16 = new Bild("blackPawn.png");
        b16.setzePosition(420, 60);
    }
    
    public void bewegeAlle()
    {
        b9.setzePosition(0, 120);
        b10.setzePosition(60, 120);
        b11.setzePosition(120, 120);
        b12.setzePosition(180, 120);
        b13.setzePosition(240, 120);
        b14.setzePosition(300, 120);
        b15.setzePosition(360, 120);
        b16.setzePosition(420, 120);
    }
    
    public void setzeBauerDiagonal()
    {
        //Koordinaten bearbeiten.
    }
    
    //Methoden, um Bauer auf a7 zu bewegen:
    public void bp1EinsVorwaerts()
    {
        b9.setzePosition(0, 120);
    }
    public void bp1ZweiVorwaerts()
    {
        b9.setzePosition(0, 180);
    }
    public void bp1DreiVorwaerts()
    {
        b9.setzePosition(0, 240);
    }
    public void bp1VierVorwaerts()
    {
        b9.setzePosition(0, 300);
    }
    public void bp1FuenfVorwaerts()
    {
        b9.setzePosition(0, 360);
    }
    public void bp1SechsVorwaerts()
    {
        b9.setzePosition(0, 420);
    }
    
    //Methoden, um Bauer auf b7 zu bewegen:
    public void bp2EinsVorwaerts()
    {
        b10.setzePosition(60, 120);
    }
    public void bp2ZweiVorwaerts()
    {
        b10.setzePosition(60, 180);
    }
    public void bp2DreiVorwaerts()
    {
        b10.setzePosition(60, 240);
    }
    public void bp2VierVorwaerts()
    {
        b10.setzePosition(60, 300);
    }
    public void bp2FuenfVorwaerts()
    {
        b10.setzePosition(60, 360);
    }
    public void bp2SechsVorwaerts()
    {
        b10.setzePosition(60, 420);
    }
    
    //Methoden, um Bauer auf c7 zu bewegen:
    public void bp3EinsVorwaerts()
    {
        b11.setzePosition(120, 120);
    }
    public void bp3ZweiVorwaerts()
    {
        b11.setzePosition(120, 180);
    }
    public void bp3DreiVorwaerts()
    {
        b11.setzePosition(120, 240);
    }
    public void bp3VierVorwaerts()
    {
        b11.setzePosition(120, 300);
    }
    public void bp3FuenfVorwaerts()
    {
        b11.setzePosition(120, 360);
    }
    public void bp3SechsVorwaerts()
    {
        b11.setzePosition(120, 420);
    }
    
    //Methoden, um Bauer auf d7 zu bewegen:
    public void bp4EinsVorwaerts()
    {
        b12.setzePosition(180, 120);
    }
    public void bp4ZweiVorwaerts()
    {
        b12.setzePosition(180, 180);
    }
    public void bp4DreiVorwaerts()
    {
        b12.setzePosition(180, 240);
    }
    public void bp4VierVorwaerts()
    {
        b12.setzePosition(180, 300);
    }
    public void bp4FuenfVorwaerts()
    {
        b12.setzePosition(180, 360);
    }
    public void bp4SechsVorwaerts()
    {
        b12.setzePosition(180, 420);
    }
    
    //Methoden, um Bauer auf e7 zu bewegen:
    public void bp5EinsVorwaerts()
    {
        b13.setzePosition(240, 120);
    }
    public void bp5ZweiVorwaerts()
    {
        b13.setzePosition(240, 180);
    }
    public void bp5DreiVorwaerts()
    {
        b13.setzePosition(240, 240);
    }
    public void bp5VierVorwaerts()
    {
        b13.setzePosition(240, 300);
    }
    public void bp5FuenfVorwaerts()
    {
        b13.setzePosition(240, 360);
    }
    public void bp5SechsVorwaerts()
    {
        b13.setzePosition(240, 420);
    }
    
    //Methoden, um Bauer auf f7 zu bewegen:
    public void bp6EinsVorwaerts()
    {
        b14.setzePosition(300, 120);
    }
    public void bp6ZweiVorwaerts()
    {
        b14.setzePosition(300, 180);
    }
    public void bp6DreiVorwaerts()
    {
        b14.setzePosition(300, 240);
    }
    public void bp6VierVorwaerts()
    {
        b14.setzePosition(300, 300);
    }
    public void bp6FuenfVorwaerts()
    {
        b14.setzePosition(300, 360);
    }
    public void bp6SechsVorwaerts()
    {
        b14.setzePosition(300, 420);
    }
    
    //Methoden, um Bauer auf g7 zu bewegen:
    public void bp7EinsVorwaerts()
    {
        b15.setzePosition(360, 120);
    }
    public void bp7ZweiVorwaerts()
    {
        b15.setzePosition(360, 180);
    }
    public void bp7DreiVorwaerts()
    {
        b15.setzePosition(360, 240);
    }
    public void bp7VierVorwaerts()
    {
        b15.setzePosition(360, 300);
    }
    public void bp7FuenfVorwaerts()
    {
        b15.setzePosition(360, 360);
    }
    public void bp7SechsVorwaerts()
    {
        b15.setzePosition(360, 420);
    }
    
    //Methoden, um Bauer auf h7 zu bewegen:
    public void bp8EinsVorwaerts()
    {
        b16.setzePosition(420, 120);
    }
    public void bp8ZweiVorwaerts()
    {
        b16.setzePosition(420, 180);
    }
    public void bp8DreiVorwaerts()
    {
        b16.setzePosition(420, 240);
    }
    public void bp8VierVorwaerts()
    {
        b16.setzePosition(420, 300);
    }
    public void bp8FuenfVorwaerts()
    {
        b16.setzePosition(420, 360);
    }
    public void bp8SechsVorwaerts()
    {
        b16.setzePosition(420, 420);
    }
}