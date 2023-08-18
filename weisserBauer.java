/**
 * 
 */
public class weisserBauer extends Bauer
{
    private weisserBauer[] weisseBauer; // Array deklarieren
    
    public weisserBauer(int xStart,int yStart)
    {
        super(xStart, yStart);
        
        weisseBauer = new weisserBauer[8];
        
        b1 = new Bild("whitePawn.png");
        b1.setzePosition(0, 360);
        b2 = new Bild("whitePawn.png");
        b2.setzePosition(60, 360);
        b3 = new Bild("whitePawn.png");
        b3.setzePosition(120, 360);
        b4 = new Bild("whitePawn.png");
        b4.setzePosition(180, 360);
        b5 = new Bild("whitePawn.png");
        b5.setzePosition(240, 360);
        b6 = new Bild("whitePawn.png");
        b6.setzePosition(300, 360);
        b7 = new Bild("whitePawn.png");
        b7.setzePosition(360, 360);
        b8 = new Bild("whitePawn.png");
        b8.setzePosition(420, 360);
    }
    
    public void bewegeAlle()
    {
        b1.setzePosition(0, 300);
        b2.setzePosition(60, 300);
        b3.setzePosition(120, 300);
        b4.setzePosition(180, 300);
        b5.setzePosition(240, 300);
        b6.setzePosition(300, 300);
        b7.setzePosition(360, 300);
        b8.setzePosition(420, 300);
    } 
    
    public void setzeBauerDiagonal()
    {
        //Koordinaten bearbeiten.
    }
    
    //Methoden, um Bauer auf a2 zu bewegen:
    public void wp1EinsVorwaerts()
    {
        b1.setzePosition(0, 300);
    }
    public void wp1ZweiVorwaerts()
    {
        b1.setzePosition(0, 240);
    }
    public void wp1DreiVorwaerts()
    {
        b1.setzePosition(0, 180);
    }
    public void wp1VierVorwaerts()
    {
        b1.setzePosition(0, 120);
    }
    public void wp1FuenfVorwaerts()
    {
        b1.setzePosition(0, 60);
    }
    public void wp1SechsVorwaerts()
    {
        b1.setzePosition(0, 0);
    }
    
    //Methoden, um Bauer auf b2 zu bewegen:
    public void wp2EinsVorwaerts()
    {
        b2.setzePosition(60, 300);
    }
    public void wp2ZweiVorwaerts()
    {
        b2.setzePosition(60, 240);
    }
    public void wp2DreiVorwaerts()
    {
        b2.setzePosition(60, 180);
    }
    public void wp2VierVorwaerts()
    {
        b2.setzePosition(60, 120);
    }
    public void wp2FuenfVorwaerts()
    {
        b2.setzePosition(60, 60);
    }
    public void wp2SechsVorwaerts()
    {
        b2.setzePosition(60, 0);
    }
    
    //Methoden, um Bauer auf c2 zu bewegen:
    public void wp3EinsVorwaerts()
    {
        b3.setzePosition(120, 300);
    }
    public void wp3ZweiVorwaerts()
    {
        b3.setzePosition(120, 240);
    }
    public void wp3DreiVorwaerts()
    {
        b3.setzePosition(120, 180);
    }
    public void wp3VierVorwaerts()
    {
        b3.setzePosition(120, 120);
    }
    public void wp3FuenfVorwaerts()
    {
        b3.setzePosition(120, 60);
    }
    public void wp3SechsVorwaerts()
    {
        b3.setzePosition(120, 0);
    }
    
    //Methoden, um Bauer auf d2 zu bewegen:
    public void wp4EinsVorwaerts()
    {
        b4.setzePosition(180, 300);
    }
    public void wp4ZweiVorwaerts()
    {
        b4.setzePosition(180, 240);
    }
    public void wp4DreiVorwaerts()
    {
        b4.setzePosition(180, 180);
    }
    public void wp4VierVorwaerts()
    {
        b4.setzePosition(180, 120);
    }
    public void wp4FuenfVorwaerts()
    {
        b4.setzePosition(180, 60);
    }
    public void wp4SechsVorwaerts()
    {
        b4.setzePosition(180, 0);
    }
    
    //Methoden, um Bauer auf e2 zu bewegen:
    public void wp5EinsVorwaerts()
    {
        b5.setzePosition(240, 300);
    }
    public void wp5ZweiVorwaerts()
    {
        b5.setzePosition(240, 240);
    }
    public void wp5DreiVorwaerts()
    {
        b5.setzePosition(240, 180);
    }
    public void wp5VierVorwaerts()
    {
        b5.setzePosition(240, 120);
    }
    public void wp5FuenfVorwaerts()
    {
        b5.setzePosition(240, 60);
    }
    public void wp5SechsVorwaerts()
    {
        b5.setzePosition(240, 0);
    }
    
    //Methoden, um Bauer auf f2 zu bewegen:
    public void wp6EinsVorwaerts()
    {
        b6.setzePosition(300, 300);
    }
    public void wp6ZweiVorwaerts()
    {
        b6.setzePosition(300, 240);
    }
    public void wp6DreiVorwaerts()
    {
        b6.setzePosition(300, 180);
    }
    public void wp6VierVorwaerts()
    {
        b6.setzePosition(300, 120);
    }
    public void wp6FuenfVorwaerts()
    {
        b6.setzePosition(300, 60);
    }
    public void wp6SechsVorwaerts()
    {
        b6.setzePosition(300, 0);
    }
    
    //Methoden, um Bauer auf g2 zu bewegen:
    public void wp7EinsVorwaerts()
    {
        b7.setzePosition(360, 300);
    }
    public void wp7ZweiVorwaerts()
    {
        b7.setzePosition(360, 240);
    }
    public void wp7DreiVorwaerts()
    {
        b7.setzePosition(360, 240);
    }
    public void wp7VierVorwaerts()
    {
        b7.setzePosition(360, 240);
    }
    public void wp7FuenfVorwaerts()
    {
        b7.setzePosition(360, 240);
    }
    public void wp7SechsVorwaerts()
    {
        b7.setzePosition(360, 240);
    }
    
    //Methoden, um Bauer auf h2 zu bewegen:
    public void wp8EinsVorwaerts()
    {
        b8.setzePosition(420, 300);
    }
    public void wp8ZweiVorwaerts()
    {
        b8.setzePosition(420, 240);
    }
    public void wp8DreiVorwaerts()
    {
        b8.setzePosition(420, 180);
    }
    public void wp8VierVorwaerts()
    {
        b8.setzePosition(420, 120);
    }
    public void wp8FuenfVorwaerts()
    {
        b8.setzePosition(420, 60);
    }
    public void wp8SechsVorwaerts()
    {
        b8.setzePosition(420, 0);
    }
}
