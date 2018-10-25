package pack;

import java.io.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

/**
 * Dies wird die Klasse Input.
 * Input dient dazu die bereitgestellte XML-Datei zu lesen und daraus die zu bearbeitenden Texte
 * mit den gewuenschten Labeln abzuleiten.
 * Sie hat Zugriff auf die Klasse Klassifikator, damit sie dort in das label[] - Array die Namen
 * der Label und in das text[] - Array die zu bearbeitenden Texte eintragen kann.
 * Input ist die erste Klasse, die von Steuerung angesprochen wird, da sie fuer das Laden der Da-
 * ten zustaendig ist, mit denen das Programm dann arbeiten soll.
 * Zusaetzlich kann sie die Dateien lesen, die erstellt werden, falls das Programm vor abarbeiten
 * aller Texte beendet wird. Dies dient dazu, dass der Nutzer mit dem Klassifizieren/Labeln dort
 * weitermachen kann, wo er zuvor aufgehoert hat, ohne einen Text doppelt zu bearbeiten.
 * @author susannabeck
 * @version 0.1
 */
public class Input {
	public String[] labelLesen(){
		try {
			File fXmlFile = new File("/Anno/src/xml/labels.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(fXmlFile);
			NodeList nList = doc.getElementsByTagName("label");
			
			String[] label = new String[nList.getLength()];
			
			for (int i = 0; i < nList.getLength(); i++)
			{
			 Node node = nList.item(i);
			 
			 if (node.getNodeType() == Node.ELEMENT_NODE) {
			    Element eElement = (Element) node;
			    label[i]=eElement.getAttribute("inhalt");
			 }
			}
			return label;
		 } catch (Exception e) {
			e.printStackTrace();
			String[] leer=new String[0];
			return leer;
		 }
		
	}

}
