
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

public class Spiel extends Figuren implements ITuWas
{
    private Schachbrett sb;
    private Taktgeber takt;
    private Taste erzeugenKnopf, starteUhren, tasteZieheDieFigur, partyBrett, setzeZufaelligeBrettFarbe;
    private Eingabefeld gibZuegeEin, gibBrettFarbeEin; 
    private Uhr uhr1, uhr2;
    private int xStart, yStart;
    
    //private Taste setzeUhren;
    //setzeUhrStd, setzeUhrMin, setzeUhrS;
    //private int stunden, minuten, sekunden;
    
    public Spiel(int xStart, int yStart)
    {
        super(xStart, yStart);
        
        sb = new Schachbrett();
        
        takt = new Taktgeber();
        takt.setzteZeitZwischenAktionen(100);
        takt.setzeLink(this);
        takt.setzeID(10);
        
        erzeugenKnopf = new Taste("Erzeuge ganzes Spiel.", 500, 10, 350, 50);
        erzeugenKnopf.setzeLink(this);
        erzeugenKnopf.setzeID(10);
        //Soll Brett und die Figuren erzeugen.
        
        Taste anzeige = new Taste("Hier Züge eingeben:", 500, 70, 350, 50);
        gibZuegeEin = new Eingabefeld("0", 500, 130, 350, 50);
        //Eingabefeld fuer Zuege.
        
        tasteZieheDieFigur = new Taste("Ziehe die Figur!", 500, 190, 350, 50);
        tasteZieheDieFigur.setzeLink(this);
        tasteZieheDieFigur.setzeID(20);
        //Taste, um Zuege zu ziehen.
        
        partyBrett = new Taste("Party Brett !", 500, 250, 350, 50);
        partyBrett.setzeLink(this);
        partyBrett.setzeID(50);
        
        setzeZufaelligeBrettFarbe = new Taste("Zufälliges Brett !", 500, 310, 350, 50);
        setzeZufaelligeBrettFarbe.setzeLink(this);
        setzeZufaelligeBrettFarbe.setzeID(60);
        
        /**setzeUhren = new Taste("Setze Uhren.", 500, 310, 350, 50);
        setzeUhren.setzeLink(this);
        setzeUhren.setzeID(40);
        //setzeUhren
        
        Eingabefeld setzeUhrStd  = new Eingabefeld("Hier Zeit für die Uhr eingeben (STD).", 500, 370, 350, 50);
        Eingabefeld setzeUhrMin  = new Eingabefeld("Hier Zeit für die Uhr eingeben (MIN).", 500, 430, 350, 50);
        Eingabefeld setzeUhrS = new Eingabefeld("Hier Zeit für die Uhr eingeben (S).", 500, 490, 350, 50);
        //Eingabefelder fuer Uhrzeiten
        
        starteUhren = new Taste("Starte Uhr in 3 Sekunden.", 500, 250, 350, 50);
        starteUhren.setzeLink(this);
        starteUhren.setzeID(30);
        //Startknopf fuer die Uhr.
        
        */
    }
    
    public void tuWas(int ID)
    {
        if(ID == 10) // Neuer Takt
        {
            //Bauern auf Knopfdruck erstellen:
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
            
            //andere Figuren:
            erzeugeWeissePferde();
            erzeugeSchwarzePferde();
            erzeugeWeisseTuerme();
            erzeugeSchwarzeTuerme();
            erzeugeWeisseLaeufer();
            erzeugeSchwarzeLaeufer();
            erzeugeWeissenKoenig();
            erzeugeSchwarzenKoenig();
            erzeugeWeisseDame();
            erzeugeSchwarzeDame();
        }
        else if(ID == 20)
        {
            System.out.println(gibZuegeEin.leseText());
            
            //WEISSE BAUER:
            //bewegt Bauer auf a2
            if(gibZuegeEin.leseText().equals("wpa3"))
            {
                b1.setzePosition(0, 300);
            }
            if(gibZuegeEin.leseText().equals("wpa4"))
            {
                b1.setzePosition(0, 240);
            }
            if(gibZuegeEin.leseText().equals("wpa5"))
            {
                b1.setzePosition(0, 180);
            }
            if(gibZuegeEin.leseText().equals("wpa6"))
            {
                b1.setzePosition(0, 120);
            }
            if(gibZuegeEin.leseText().equals("wpa7"))
            {
                b1.setzePosition(0, 60);
            }
            if(gibZuegeEin.leseText().equals("wpa8"))
            {
                b1.setzePosition(0, 0);
            }
            
            //bewegt Bauer auf b2
            if(gibZuegeEin.leseText().equals("wpb3"))
            {
                b2.setzePosition(60, 300);
            }
            if(gibZuegeEin.leseText().equals("wpb4"))
            {
                b2.setzePosition(60, 240);
            }
            if(gibZuegeEin.leseText().equals("wpb5"))
            {
                b2.setzePosition(60, 180);
            }
            if(gibZuegeEin.leseText().equals("wpb6"))
            {
                b2.setzePosition(60, 120);
            }
            if(gibZuegeEin.leseText().equals("wpb7"))
            {
                b2.setzePosition(60, 60);
            }
            if(gibZuegeEin.leseText().equals("wpb8"))
            {
                b2.setzePosition(60, 0);
            }
            
            //bewegt Bauer auf c2
            if(gibZuegeEin.leseText().equals("wpc3"))
            {
                b3.setzePosition(120, 300);
            }
            if(gibZuegeEin.leseText().equals("wpc4"))
            {
                b3.setzePosition(120, 240);
            }
            if(gibZuegeEin.leseText().equals("wpc5"))
            {
                b3.setzePosition(120, 180);
            }
            if(gibZuegeEin.leseText().equals("wpc6"))
            {
                b3.setzePosition(120, 120);
            }
            if(gibZuegeEin.leseText().equals("wpc7"))
            {
                b3.setzePosition(120, 60);
            }
            if(gibZuegeEin.leseText().equals("wpc8"))
            {
                b3.setzePosition(120, 0);
            }
            
            //bewegt Bauer auf d2
            if(gibZuegeEin.leseText().equals("wpd3"))
            {
                b4.setzePosition(180, 300);
            }
            if(gibZuegeEin.leseText().equals("wpd4"))
            {
                b4.setzePosition(180, 240);
            }
            if(gibZuegeEin.leseText().equals("wpd5"))
            {
                b4.setzePosition(180, 180);
            }
            if(gibZuegeEin.leseText().equals("wpd6"))
            {
                b4.setzePosition(180, 120);
            }
            if(gibZuegeEin.leseText().equals("wpd7"))
            {
                b4.setzePosition(180, 60);
            }
            if(gibZuegeEin.leseText().equals("wpd8"))
            {
                b4.setzePosition(180, 0);
            }
            
            //bewegt Bauer auf e2
            if(gibZuegeEin.leseText().equals("wpe3"))
            {
                b5.setzePosition(240, 300);
            }
            if(gibZuegeEin.leseText().equals("wpe4"))
            {
                b5.setzePosition(240, 240);
            }
            if(gibZuegeEin.leseText().equals("wpe5"))
            {
                b5.setzePosition(240, 180);
            }
            if(gibZuegeEin.leseText().equals("wpe6"))
            {
                b5.setzePosition(240, 120);
            }
            if(gibZuegeEin.leseText().equals("wpe7"))
            {
                b5.setzePosition(240, 60);
            }
            if(gibZuegeEin.leseText().equals("wpe8"))
            {
                b5.setzePosition(240, 0);
            }
            
            //bewegt Bauer auf f2
            if(gibZuegeEin.leseText().equals("wpf3"))
            {
                b6.setzePosition(300, 300);
            }
            if(gibZuegeEin.leseText().equals("wpf4"))
            {
                b6.setzePosition(300, 240);
            }
            if(gibZuegeEin.leseText().equals("wpf5"))
            {
                b6.setzePosition(300, 180);
            }
            if(gibZuegeEin.leseText().equals("wpf6"))
            {
                b6.setzePosition(300, 120);
            }
            if(gibZuegeEin.leseText().equals("wpf7"))
            {
                b6.setzePosition(300, 60);
            }
            if(gibZuegeEin.leseText().equals("wpf8"))
            {
                b6.setzePosition(300, 0);
            }
            
            //bewegt Bauer auf g2
            if(gibZuegeEin.leseText().equals("wpg3"))
            {
                b7.setzePosition(360, 300);
            }
            if(gibZuegeEin.leseText().equals("wpg4"))
            {
                b7.setzePosition(360, 240);
            }
            if(gibZuegeEin.leseText().equals("wpg5"))
            {
                b7.setzePosition(360, 240);
            }
            if(gibZuegeEin.leseText().equals("wpg6"))
            {
                b7.setzePosition(360, 240);
            }
            if(gibZuegeEin.leseText().equals("wpg7"))
            {
                b7.setzePosition(360, 240);
            }
            if(gibZuegeEin.leseText().equals("wpg8"))
            {
                b7.setzePosition(360, 240);
            }
            
            //bewegt Bauer auf h2
            if(gibZuegeEin.leseText().equals("wph3"))
            {
                b8.setzePosition(420, 300);
            }
            if(gibZuegeEin.leseText().equals("wph4"))
            {
                b8.setzePosition(420, 240);
            }
            if(gibZuegeEin.leseText().equals("wph5"))
            {
                b8.setzePosition(420, 180);
            }
            if(gibZuegeEin.leseText().equals("wph6"))
            {
                b8.setzePosition(420, 120);
            }
            if(gibZuegeEin.leseText().equals("wph7"))
            {
                b8.setzePosition(420, 60);
            }
            if(gibZuegeEin.leseText().equals("wph8"))
            {
                b8.setzePosition(420, 0);
            }
            
            //SCHWARZE BAUER:
            //bewegt Bauer auf a7
            if(gibZuegeEin.leseText().equals("bpa6"))
            {
                b9.setzePosition(0, 120);
            }
            if(gibZuegeEin.leseText().equals("bpa5"))
            {
                b9.setzePosition(0, 180);
            }
            if(gibZuegeEin.leseText().equals("bpa4"))
            {
                b9.setzePosition(0, 240);
            }
            if(gibZuegeEin.leseText().equals("bpa3"))
            {
                b9.setzePosition(0, 300);
            }
            if(gibZuegeEin.leseText().equals("bpa2"))
            {
                b9.setzePosition(0, 360);
            }
            if(gibZuegeEin.leseText().equals("bpa1"))
            {
                b9.setzePosition(0, 420);
            }
            
            //bewegt Bauer auf b7
            if(gibZuegeEin.leseText().equals("bpb6"))
            {
                b10.setzePosition(60, 120);
            }
            if(gibZuegeEin.leseText().equals("bpb5"))
            {
                b10.setzePosition(60, 180);
            }
            if(gibZuegeEin.leseText().equals("bpb4"))
            {
                b10.setzePosition(60, 240);
            }
            if(gibZuegeEin.leseText().equals("bpb3"))
            {
                b10.setzePosition(60, 300);
            }
            if(gibZuegeEin.leseText().equals("bpb2"))
            {
                b10.setzePosition(60, 360);
            }
            if(gibZuegeEin.leseText().equals("bpb1"))
            {
                b10.setzePosition(60, 420);
            }
            
            //bewegt Bauer auf c7
            if(gibZuegeEin.leseText().equals("bpc6"))
            {
                b11.setzePosition(120, 120);
            }
            if(gibZuegeEin.leseText().equals("bpc5"))
            {
                b11.setzePosition(120, 180);
            }
            if(gibZuegeEin.leseText().equals("bpc4"))
            {
                b11.setzePosition(120, 240);
            }
            if(gibZuegeEin.leseText().equals("bpc3"))
            {
                b11.setzePosition(120, 300);
            }
            if(gibZuegeEin.leseText().equals("bpc2"))
            {
                b11.setzePosition(120, 360);
            }
            if(gibZuegeEin.leseText().equals("bpc1"))
            {
                b11.setzePosition(120, 420);            
            }
            
            //bewegt Bauer auf d7
            if(gibZuegeEin.leseText().equals("bpd6"))
            {
                b12.setzePosition(180, 120);
            }
            if(gibZuegeEin.leseText().equals("bpd5"))
            {
                b12.setzePosition(180, 180);
            }
            if(gibZuegeEin.leseText().equals("bpd4"))
            {
                b12.setzePosition(180, 240);
            }
            if(gibZuegeEin.leseText().equals("bpd3"))
            {
                b12.setzePosition(180, 300);
            }
            if(gibZuegeEin.leseText().equals("bpd2"))
            {
                b12.setzePosition(180, 360);
            }
            if(gibZuegeEin.leseText().equals("bpd1"))
            {
                b12.setzePosition(180, 420);         
            }
            
            //bewegt Bauer auf e7
            if(gibZuegeEin.leseText().equals("bpe6"))
            {
                b13.setzePosition(240, 120);
            }
            if(gibZuegeEin.leseText().equals("bpe5"))
            {
                b13.setzePosition(240, 180);
            }
            if(gibZuegeEin.leseText().equals("bpe4"))
            {
                b13.setzePosition(240, 240);
            }
            if(gibZuegeEin.leseText().equals("bpe3"))
            {
                b13.setzePosition(240, 300);
            }
            if(gibZuegeEin.leseText().equals("bpe2"))
            {
                b13.setzePosition(240, 360);
            }
            if(gibZuegeEin.leseText().equals("bpe1"))
            {
                b13.setzePosition(240, 420);       
            }
            
            //bewegt Bauer auf f7
            if(gibZuegeEin.leseText().equals("bpf6"))
            {
                b14.setzePosition(300, 120);
            }
            if(gibZuegeEin.leseText().equals("bpf5"))
            {
                b14.setzePosition(300, 180);
            }
            if(gibZuegeEin.leseText().equals("bpf4"))
            {
                b14.setzePosition(300, 240);
            }
            if(gibZuegeEin.leseText().equals("bpf3"))
            {
                b14.setzePosition(300, 300);
            }
            if(gibZuegeEin.leseText().equals("bpf2"))
            {
                b14.setzePosition(300, 360);
            }
            if(gibZuegeEin.leseText().equals("bpf1"))
            {
                b14.setzePosition(300, 420);      
            }
            
            //bewegt Bauer g7
            if(gibZuegeEin.leseText().equals("bpg6"))
            {
                b15.setzePosition(360, 120);
            }
            if(gibZuegeEin.leseText().equals("bpg5"))
            {
                b15.setzePosition(360, 180);
            }
            if(gibZuegeEin.leseText().equals("bpg4"))
            {
                b15.setzePosition(360, 240);
            }
            if(gibZuegeEin.leseText().equals("bpg3"))
            {
                b15.setzePosition(360, 300);
            }
            if(gibZuegeEin.leseText().equals("bpg2"))
            {
                b15.setzePosition(360, 360);
            }
            if(gibZuegeEin.leseText().equals("bpg1"))
            {
                b15.setzePosition(360, 420);   
            }
            
            //bewegt Bauer auf h7
            if(gibZuegeEin.leseText().equals("bph6"))
            {
                b16.setzePosition(420, 120);
            }
            if(gibZuegeEin.leseText().equals("bph5"))
            {
                b16.setzePosition(420, 180);
            }
            if(gibZuegeEin.leseText().equals("bph4"))
            {
                b16.setzePosition(420, 240);
            }
            if(gibZuegeEin.leseText().equals("bph3"))
            {
                b16.setzePosition(420, 300);
            }
            if(gibZuegeEin.leseText().equals("bph2"))
            {
                b16.setzePosition(420, 360);
            }
            if(gibZuegeEin.leseText().equals("bph1"))
            {
                b16.setzePosition(420, 420);
            }
        } 
        else if(ID == 30)
        {
            ScheduledExecutorService exService = Executors.newSingleThreadScheduledExecutor();
            exService.schedule(() -> uhrTickt(), 3, TimeUnit.SECONDS); //Versuch
        }
        
        /**else if(ID == 40)
        {
            uhr1 = new Uhr(setzeUhrStd.leseInteger(1), setzeUhrMin.leseInteger(1), setzeUhrS.leseInteger(1));
            uhr2 = new Uhr(setzeUhrStd.leseInteger(1), setzeUhrMin.leseInteger(1), setzeUhrS.leseInteger(1));
            uhr1.wieVielZeitUebrig();
            uhr2.wieVielZeitUebrig();
        }
        */
       
        else if(ID == 50)
        {
            sb.tempLeuchtendesBrett(); 
        }
        else if(ID == 60)
        {
            sb.einZufallsBrett();
        }
    }

    private void uhrTickt()
    {
        //uhr1 = new Uhr(setzeUhrStd.leseInteger(0), setzeUhrMin.leseInteger(0), setzeUhrS.leseInteger(0));
        //uhr2 = new Uhr(setzeUhrStd.leseInteger(0), setzeUhrMin.leseInteger(0), setzeUhrS.leseInteger(0));
        
        //stunden == 0 && minuten == 0 && sekunden == 0
        for(int i = 0; i < 100000000; i++)
        {
            uhr1.zeitLaeuft();
            uhr1.wieVielZeitUebrig();
            uhr2.zeitLaeuft();
            uhr2.wieVielZeitUebrig();
        }
    }
    
    //Bauer erzeugen - Methoden.
    private void erzeugeWeisseBauer()
    {
        weisserBauer n = new weisserBauer(xStart, yStart); 
    }
    private void erzeugeSchwarzeBauer()
    {
        schwarzerBauer n = new schwarzerBauer(xStart, yStart);
    }
    
    //Pferde erzeugen - Methoden.
    private void erzeugeWeissePferde()
    {
        weissesPferd n = new weissesPferd(xStart, yStart);
    }
    private void erzeugeSchwarzePferde()
    {
        schwarzesPferd n = new schwarzesPferd(xStart, yStart);
    }
    
    //Tuerme erzeugen - Methoden.
    private void erzeugeWeisseTuerme()
    {
        weisserTurm n = new weisserTurm(xStart, yStart);
    }
    private void erzeugeSchwarzeTuerme()
    {
        schwarzerTurm n = new schwarzerTurm(xStart, yStart);
    }
    
    //Laeufer erzeugen - Methoden.
    private void erzeugeWeisseLaeufer()
    {
        weisserLaeufer n = new weisserLaeufer(xStart, yStart);
    }
    private void erzeugeSchwarzeLaeufer()
    {
        schwarzerLaeufer n = new schwarzerLaeufer(xStart, yStart);
    }
    
    //Koenige erzeugen  - Methoden.
    private void erzeugeWeissenKoenig()
    {
        weisserKoenig n = new weisserKoenig(xStart, yStart);
    }
    private void erzeugeSchwarzenKoenig()
    {
        schwarzerKoenig n = new schwarzerKoenig(xStart, yStart);
    }
    
    //Damen erzeugen - Methoden.
    private void erzeugeWeisseDame()
    {
        weisseDame n = new weisseDame(xStart, yStart); 
    }
    private void erzeugeSchwarzeDame()
    {
        schwarzeDame n = new schwarzeDame(xStart, yStart);
    }
    
    private void buntesBrett()
    {
        sb.tempLeuchtendesBrett();
    }
}

