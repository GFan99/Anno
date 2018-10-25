package pack;

/**
 * Dies wird die Klasse GUI.
 * In ihr wird die gesamte graphische Oberflaeche progammiert.
 *  - start()		 : Diese Methode startet die GUI.
 *  - getLabel()  	 : Diese Methode soll die vom Nutzer ausgewaehlten Label erfassen und speichern. Dazu
 *  					nutzt sie zunaechst die Funktion Klassifikator.waehleText() und stellt den zur
 *  					erhaltenen TextID gehoerigen Text dar. Dann wartet sie auf ein Clicked-Event des 
 *  					OK-Buttons und prueft dann die Eingaben auf Vollstaendigkeit, bevor sie die zu 
 *  					den Labels erfassten Werte in einem Array speichert, welches sie zusammen mit der
 *  					textID der Methode Klassifikator.schreibeText() uebergibt.
 *  					Sie beginnt nun ihre Arbeit von vorne, solange bis sie durch 
 *  					Klassifikator.waehleText() den Abbruch-Code uebergeben bekommt. Sie schliesst dann
 *  					die GUI.
 *  - schliessen()	 : Beendet die graphische Darstellung und startet den Speichervorgang.
 *  - abbruch()		 : Diese Methode wird ausgeloest, wenn die graphische Oberflaeche vom Nutzer vorzeitig
 *  					geschlossen wird. Sie startet die "Abbruchspeicherung".
 * @author becksusanna
 * @version 0.1
 */
public class GUI {

}
