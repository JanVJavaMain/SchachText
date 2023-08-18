/**
 * Klasse Bauer soll von Klasse Figur als Unterklasse erben.
 * Die Klasse Bauer sollte, wenn moeglich die Standardregeln (auf Startlinie 2 vorwaerts, auf normalem Feld eins vorwaerts) einhalten.
 */

public class Bauer extends Figuren
{
    protected weisserBauer wB;
    protected schwarzerBauer sB;
    
    public Bauer(int xStart, int yStart )
    {
        super(xStart, yStart);    
        
        //wB = new weisserBauer(1, 1); //Koordinaten spielen eigentlich keine Rolle, da schon im Konstruktor der Unterklasse versetzt wird.
        //sB = new schwarzerBauer(1, 1);
        
    }
}