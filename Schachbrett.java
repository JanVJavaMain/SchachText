import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

public class Schachbrett extends Rechteck
{
    Rechteck [][] r1;
    private Random zzgenerator;
    private Zufall zufallgenerator;

    public Schachbrett()
    {
       super();
       zufallgenerator = new Zufall();
       r1 = new Rechteck[8][8];
        
       for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                r1[i][j] = new Rechteck(60, 60);
                r1[i][j].setzePosition(i*60,j*60);
            }
       }
        
       for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                int num = i+j; 
           
                if (num % 2 == 1) 
                {
                    r1[i][j].setzeFarbe("braun");
                    //System.out.println("Zahl ist gerade");
                }
                else
                {
                    //System.out.println("Zahl ist ungerade");
                    //Farbe wird "automatisch zugewiesen" - eher nicht zugewiesen, was zu einer Art "grau" fuehrt.
                }    
            }
       }
    }
    
    public void tempLeuchtendesBrett()
    {
        ScheduledExecutorService exService = Executors.newSingleThreadScheduledExecutor();
        
        for (int i = 0; i < 10000000; i++)
        {
            exService.schedule(() -> blauesBrett(), 2, TimeUnit.SECONDS);
            exService.schedule(() -> rotesBrett(), 2, TimeUnit.SECONDS);
            exService.schedule(() -> grauesBrett(), 2, TimeUnit.SECONDS);
            exService.schedule(() -> braunesBrett(), 2, TimeUnit.SECONDS);
        }
    }
    
    //public void einPartyBrett()
    //{
    //    ScheduledExecutorService exService = Executors.newSingleThreadScheduledExecutor();
    //    exService.scheduleAtFixedRate(() -> tempLeuchtendesBrett(), 0, 10, TimeUnit.SECONDS);
    //}
    
    public void einZufallsBrett()
    {
       zzgenerator = new Random();
       int z; // entspricht zufallszahl bzw. zufallszahl1
       
       z = zufallgenerator.GanzzahlGeben(4) + 1; //gibt Zahl zwischen 1 und 5 aus
       
        if(z == 1)
        {
               blauesBrett();
               System.out.println("Die Zufallszahl ist 1. Somit wird das Brett 'blau'.");
        }
        if(z == 2)
        {
               rotesBrett();
               System.out.println("Die Zufallszahl ist 2. Somit wird das Brett 'rot'.");
        }
        if(z == 3)
        {
               braunesBrett(); 
               System.out.println("Die Zufallszahl ist 3. Somit wird das Brett 'braun'.");
        }
        if(z == 4)
        {
               schwarzesBrett();
               System.out.println("Die Zufallszahl ist 4. Somit wird das Brett 'schwarz'.");
               System.out.println("Warnung: 'Schwarze' Figuren kaum sichtbar!");
        }
        if(z == 5)
        {
               grauesBrett();
               System.out.println("Die Zufallszahl ist 5. Somit wird das Brett 'grau'.");
        }
    } 
    
    private int GanzzahlGeben(int n)
    {
        return zzgenerator.nextInt(n);
    }
    
    public void blauesBrett()
    {
        for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                int num = i+j; 
           
                if (num % 2 == 1) 
                {
                    r1[i][j].setzeFarbe("blau");
                }  
            }
       }
    }
    
    public void rotesBrett()
    {
        for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                int num = i+j; 
           
                if (num % 2 == 1) 
                {
                    r1[i][j].setzeFarbe("rot");
                }  
            }
       }
    }
    
    public void braunesBrett()
    {
        for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                int num = i+j; 
           
                if (num % 2 == 1) 
                {
                    r1[i][j].setzeFarbe("braun");
                }  
            }
       }
    }
    
    public void schwarzesBrett()
    {
        for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                int num = i+j; 
           
                if (num % 2 == 1) 
                {
                    r1[i][j].setzeFarbe("schwarz");
                    System.out.println("Warnung: 'Schwarze' Figuren kaum sichtbar!");
                }  
            }
       }
    }
    
    public void grauesBrett()
    {
        for(int i = 0; i < 8; i++)
       {
            for(int j = 0; j < 8; j++)
            {
                int num = i+j; 
           
                if (num % 2 == 1) 
                {
                    r1[i][j].setzeFarbe("grau");
                }  
            }
       }
    }  
}