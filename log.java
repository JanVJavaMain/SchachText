//Layout: 
//        Datum: Was gemacht wurde
//        Evtl. benötigte Fixes / Umsetzungsvorschläge

//Fixes oder erledigte To Dos (29.6.23):
// * To Do5: Fix für Farbe "schwarz": andere Farbe wählen, da "schwarz" mit Farbe der Figuren kollidert, was in "Unsichtbarkeit" der "schwarzen" Figuren resultiert. (Ersatzfarbe zur Zeit: "grün")
// * Fix To Do 5 (temp): "blue" als Farbe, entspricht einem kräftigen "blau"
// * Fix2 To Do 5 (temp): andere Brettfarbe wählen 
// * To Do3: Bilder einzeln "spawnen", damit das Ganze differenzierbar wird. 
// * Fix To Do 3: Bilder werden nun durch einzelne Klassen gespawned.

//Fixes oder erledigte To Dos (30.6.23);
// * Fix: Projekt weitaus effizienter
// * Fix: To Do6: Maße anpassen - Figuren in Relation zum Brett anpassen (Koordinaten!)...

//Fixes oder erledigte To Dos (1.7.23);
// * Fix: Memory overflow - erstellt jetzt nur noch einen Thread innerhalb der Methode
// * (To Do7: partyBrett als Methode hinzufügen...) -> tempLeuchtendesBrett

//Fixes oder erledigte To Dos (8.7.23);
// * To Do4: Auf eine Oberklasse runterbrechen. -> Nun koennen das Brett und die Figuren mit einer Klasse als Hilfsmitter erzeugt werden.
// * To Do8: Boxen und/ oder Tasten zum Spawnen der Figuren.

//Fixes oder erledigte To Dos (9.7.23);
// * ToDo: Bauern können sich nach Vorne bewegen.


/**
 * Großes ?:
 * Wie bringen wir's zusammen und wie bewegen sich die anderen Figuren? Separate Klassen nutzen? (Für die Regeln, etc...)
 * AUFRÄUMEN!!!
 * 
 * To Dos und Fehler:
 * To Do1: Array + Fehler Fix (Beschrieben in Klasse "Figuren")
 * To Do2: Array für einzelne Figurenklassen (Figuren, die es mehrere Male gibt...) - siehe To Do 1
 * To Do9: Methode "diagonalSetzen" Koordinaten überarbeiten.
 * To Do10: Uhren können nicht erstellt werden (StackOverflow) -> Versuche eine weitere Oberklasse zu erstellen, die das Gnaze erstellt bzw. implementiere in Klasse Spiel.
 * To DO11: Uhr hat decrease Methode (dcr) und kann Zeit ausgeben. Fehlend: Ausgabefeld fuer uebrige Zeit und automatisiertes "Runterzaehlen".
 */

/**
 * Log (seit 27.6.23 - 15.00 Uhr)
 * 
 * Zuvor:
 * 
 * 2D Array, Grundstruktur, Impotieren von manchen Klassen, die spaeter entfernt wurden.
 * 
 * 
 * Hinzufuegen der einzelnen Klassen von der Vorlage, die benoetigt werden fuers Projekt
 * 
 * 
 * 27.6.23: Bilder hinzugefügt für alle Schachfiguren, können im Projektordner gefunden werden (Englische Bezeichnung, voll ausgeschrieben).
 * 
 * 
 * 29.6.23: Neue Variablen in Klasse "Figuren" hinzugefügt (b1-b32), werden in Unterklassen initialisiert.
 * 29.6.23: Fix Formatierungen
 * 29.6.23: Alle Figuren sind "spawnable" mit Angabe der Koordinaten.
 * 29.6.23: Bauern "spawnen" diagonal.
 * 29.6.23: Koordinaten fürs Brett herausgefunden.
 * 29.6.23: Erfolgreich auf Mac portiert. (BlueJ 4.1-> 5.x -> 5.1.0a)
 * 29.6.23: Bauer "spawnen" jetzt auf passender Höhe (2a-2h, 7a-7h).
 * 29.6.23: Verschiedene Farben für Spielbrett hinzugefügt, auch mit zufälliger Farbe möglich.
 * 
 * 
 * 30.6.23: Figuren werden jetzt alle nach "Spawn" an "normale" Positionen "gespawned" (Angaben an BlueJ im extra Fenster werden ignoriert... Die Klassen enthalten einzeln die Methode "setzePosition", um diese festzulegen.)
 * 30.6.23: Entfernen von unnötigen Klassen - 3 entfernt
 * 30.6.23: Hinzufügen der "Verzoegerungsklasse"
 * 30.6.23: Schreiben der Klasse "log". -> keine Schleife mehr beim "Übersetzen" der Klasse. Vorher nicht möglich, da keine Klasse erstellt wurde (s. Code unten, der vorher nicht da war)...
 * 30.6.23: Schachbrett bekommt eine "buntesBrett" - Methode... 
 * 30.6.23: "partyBrett" in Entwicklung
 * 30.6.23: Arrays für Bauern hinzugefügt (Grundtstruktur)...
 * 
 * 
 * 1.7.23: Methode "buntesBrett" in "tempLeuchtendesBrett" umbenannt.
 * 1.7.23: Diese Methode kann nun als "Party-Modus" angesehen werden.
 * 1.7.23: Hinzufügen der Methode "alleBewegen" - Klassen: "weisserBauer" und "schwarzerBauer".
 * 1.7.23: Hinzufügen der Klasse "Uhr".
 * 
 * 
 * 3.7.23: Projekt wurde zu "Fun-Chess" umbenannt. -> Normen des Endprodukts wurden angepasst
 * 
 * 
 * 8.7.23: Erfolgreich auf BlueJ 5.2.0 portiert.
 * 8.7.23: Implementieren der Klasse "Spiel" - sorgt fuer Tasten und Erzeugen des Brettes und der Figuren. 
 * 8.7.23: ENDLICH: Mit einem Knopfdruck wird das Spiel erzeugt.
 * 
 * 
 * 9.7.23: Weisse Bauern können sich durch verschiedene Methoden einfach und zweifach nach Vorn bewegen.
 * 9.7.23: Schwarze Bauern können dies nun auch.
 * 
 * 12.7.23: Abändern grundlegender Dinge. Einige Feautures wurden (z.B. Uhr) in Kommentaren hinterlegt. -> Effizienz! (Hatte zuvor 12gb Ram verbraucht beim Spielen(!))
 * 12.7.23: Tasten für verschiedene Zwecke eingefügt.
 */

class log
{
    private log()
    {
        System.out.println("Das Log ist in Textform. Für weitere Informationen siehe 'log'-Klasse. ;)");
    }
}