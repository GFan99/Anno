package pack;

/**
 * Dies wird die Klasse Klassifikator.
 * Sie ist der Mittelpunkt des gesamten Programms, denn in ihr liegen die Variablen, Methoden und
 * Funktionen, die von allen anderen Klassen benutzt werden. So gibt es hier:
 *  - labels[]   : Das Array mit den Labels, nach denen die Texte "sortiert" werden.
 *  - texte[]    : Das Array mit den zu klassifizierenden Texten.
 *  - textids	 : Eine ArrayList, die die IDs der Texte speichert (ID=1 heißt (Index in texte[])=1).
 *  - ergebnisse : ergebnisse ist eine Map, die als Key die jeweilige textid (Int) und als Value ein 
 *  				boolean[] mit den für die Labels ausgewaehlten Werte hat.
 *  - waehleText : Eine Funktion die aus textids zufaellig ein Element auswaehlt, dieses aus textids
 *  				entfernt und dann zurück gibt. Ist textids leer, so wird ein "Fehler-Wert" ueber-
 *  				geben (bspw. -100).
 *  - schrMap    : Eine Methode, die eine TextID (Int) und ein boolean[] übergeben bekommt und diese
 *  				dann als Schlüssel-Wert-Paar in ergebnisse eintraegt.
 *  - sortieren	 : Eine Funktion, die in der Lage ist, die übergebene Map aufsteigend nach dem Key zu
 *  				sortieren und dann die sortierte Map zurück gibt.
 * @author becksusanna
 * @version 0.1
 */
public class Klassifikator {

}
