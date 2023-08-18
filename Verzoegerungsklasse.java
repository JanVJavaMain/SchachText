
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

public class Verzoegerungsklasse
{
    private static void run()
    {
        System.out.println("Läuft gerade...");
    }
    
    public static void main(String[] args)
    {
        ScheduledExecutorService exService = Executors.newSingleThreadScheduledExecutor();
        exService.schedule(() -> run(), 10, TimeUnit.SECONDS);
    }
}

//Beispiel fuer Verzoegerung
//Sorgt dafuer, dass Methode "run" nach einer Sekunde ausgefuehrt wird.