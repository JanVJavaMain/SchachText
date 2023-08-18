
import java.util.Random;
class Zufall
{
    private Random zzgenerator;
    
    Zufall()
    {
        zzgenerator = new Random();
    }

    /**
     * Erzeugung einer zufälligen Ganzzahl aus dem Intervall [0, n[
     */
    int GanzzahlGeben(int n)
    {
        return zzgenerator.nextInt(n);
    }
}
