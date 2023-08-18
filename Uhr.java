
public class Uhr 
{
    private int stunden;
    private int minuten;
    private int sekunden;
    
    public Uhr(int stunden, int minuten, int sekunden) 
    {
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
    }
    
    public void wieVielZeitUebrig()
    {
        System.out.println("Noch " + stunden + "std " + minuten + "min " + sekunden + "sekunden übrig.");
    }
    
    public boolean zeitAbgelaufen() 
    {
        return (stunden == 0 && minuten == 0 && sekunden == 0);
    }
    
    public void zeitLaeuft() //wenn eine Stunde abgelaufen ist, wird mit Minuten weitergemacht, usw...
    {
        if (this.minuten == 0 && this.sekunden == 0) 
        {
            this.sekunden = 59;
            this.minuten = 59;
            this.stunden --; //verringert
        }
        else if (this.sekunden == 0) 
        {
            this.sekunden = 59;
            this.minuten --;
        }
        else 
        {
            this.sekunden --;
        }
    }
}
