package pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * Dies wird die Klasse Klassifikator.
 * Sie ist der Mittelpunkt des gesamten Programms, denn in ihr liegen die Variablen, Methoden und
 * Funktionen, die von allen anderen Klassen benutzt werden. So gibt es hier:
 *  - label[]     : Das Array mit den Labels, nach denen die Texte "sortiert" werden.
 *  - texte[]      : Das Array mit den zu klassifizierenden Texten.
 *  - textids	   : Eine ArrayList, die die IDs der Texte speichert (ID=1 heisst (Index in texte[])=1).
 *  - ergebnisse   : ergebnisse ist eine Map, die als Key die jeweilige textid (Int) und als Value ein 
 *  				  boolean[] mit den fuer die Labels ausgewaehlten Werte hat.
 *  - waehleText() : Eine Funktion die aus textids zufaellig ein Element auswaehlt, dieses aus textids
 *  				  entfernt und dann zurueck gibt. Ist textids leer, so wird ein "Fehler-Wert"
 *  				  uebergeben (bspw. -1).
 *  - schrMap()    : Eine Methode, die eine TextID (Int) und ein boolean[] uebergeben bekommt und diese
 *  				  dann als Schluessel-Wert-Paar in ergebnisse eintraegt.
 *  - sortieren()  : Eine Funktion, die in der Lage ist, die uebergebene Map aufsteigend nach dem Key 
 *  				  zu sortieren und dann die sortierte Map zurueck gibt.
 * @author becksusanna
 * @version 0.1
 */
public class Klassifikator {
	
	private String[] label;
	private String[] texte;
	private ArrayList<Integer> textids;
	private HashMap<Integer,boolean[]> ergebnisse;
	private int idgroesse;
	
	/**
	 * Ein leerer Konstruktor...
	 * @param 
	 * @return Klassifikator
	 */
	public Klassifikator() {
		this.label = new String[0];
		this.texte = new String[0];
		this.textids = new ArrayList<Integer>();
		this.ergebnisse = new HashMap<Integer,boolean[]>();
		this.idgroesse = 0;
	}
	
	/**
	 * Ein Konstruktor mit Parametern.
	 * Es werden ein Array mit den Labeln und ein Array mit den Texten übergeben. Der Konstruktor
	 * erstellt gleich textids passend, so dass dort die Anzahl der Elemente/IDs der Anzahl der 
	 * Texte in texte entspricht.
	 * @param String[] label, String[] texte
	 * @return Klassifikator
	 */
	public Klassifikator(String[] label, String[] texte) {
		this.label = label;
		this.texte = texte;
		this.textids = new ArrayList<Integer>();
		this.idgroesse = texte.length;
		for (int i =0;i<idgroesse;i++) {
			textids.add(i);
		}	
		this.ergebnisse = new HashMap<Integer,boolean[]>();
	}
	
	/**
	 * Dies ist eine Funktion.
	 * @return
	 */
	public Integer waehleText() {
		if (textids.size()!=0) {
			int zahl = (int)((Math.random())*idgroesse);
			try {
				textids.remove(textids.indexOf(zahl));
			}
			catch (Exception e) {
				zahl = waehleText();
			}
			return zahl;
		}
		else return -1;
	}
	
	public void schrMap(Integer id, boolean[] werte) {
		this.ergebnisse.put(id, werte);
	}
	
	public HashMap<Integer,boolean[]> sortieren(HashMap<Integer,boolean[]> map) {
		HashMap<Integer,boolean[]> sort = new HashMap<Integer,boolean[]>();
		for (int i = 0; i<map.size();i++) {
			sort.put(i, map.get(i));
		}
		return sort;
	}
	

}
