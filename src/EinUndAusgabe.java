/* Einfache Klasse, um direkt Eingaben von der Tastatur/
 * Konsole zu lesen. Die Methoden fangen Fehler ab und geben bei
 * falschen Eingaben "Standardwerte", genauer den leeren
 * String, -1 und false, zur&uuml;ck.
 * Benutzung auf eigene Gefahr.
 * @author kleuker
 * Version 1.01 22.11.19
 * Version 1.02 16.07.20
 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;


public class EinUndAusgabe {

  /**
   * Konstruktor zur Erzeugung eines Objekts zur Ein- und Ausgabe.
   */
  public EinUndAusgabe() {
  }

  /**
   * Methode zum Lesen eines Textes von der Konsole, der &uuml;ber die
   * Tastatur eingegeben wird. Die Eingabe endet mit der Return-Taste
   * und darf Leerzeichen enthalten.
   *
   * @return eingegebener Text
   */
  public String leseString() {
      String ergebnis;

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try {
          ergebnis = in.readLine();
      } catch (IOException e) {
          ergebnis = "";
      }
      return ergebnis;
  }
  
  /**
   * Methode zum Lesen einer ganzen int-Zahl von der Konsole, die
   * &uuml;ber die Tastatur eingegeben wird. Die Eingabe endet mit der
   * Return-Taste. Sollte es sich bei der Eingabe um keinen
   * g&uuml;ltigen Wert handeln, wird -1 zur&uuml;ckgegeben.
   *
   * @return eingegebene Zahl
   */
  public int leseInteger() {
    int ergebnis;
    try {
      ergebnis = Integer.decode(this.leseString());
    } catch (NumberFormatException e) {
      ergebnis = -1;
    }

    return ergebnis;
  }

  /**
   * Methode zum Lesen einer ganzen byte-Zahl von der Konsole, die
   * &uuml;ber die Tastatur eingegeben wird. Die Eingabe endet mit der
   * Return-Taste. Sollte es sich bei der Eingabe um keinen
   * g&uuml;ltigen Wert handeln, wird -1 zur&uuml;ckgegeben.
   *
   * @return eingegebene Zahl
   */
  public byte leseByte() {
    byte ergebnis;
    try {
      ergebnis = Byte.decode(this.leseString());
    } catch (NumberFormatException e) {
      ergebnis = -1;
    }

    return ergebnis;
  }  
  
    /**
   * Methode zum Lesen einer ganzen long-Zahl von der Konsole, die
   * &uuml;ber die Tastatur eingegeben wird. Die Eingabe endet mit der
   * Return-Taste. Sollte es sich bei der Eingabe um keinen
   * g&uuml;ltigen Wert handeln, wird -1 zur&uuml;ckgegeben.
   *
   * @return eingegebene Zahl
   */
  public long leseLong() {
    long ergebnis;
    try {
      ergebnis = Integer.decode(this.leseString());
    } catch (NumberFormatException e) {
      ergebnis = -1;
    }

    return ergebnis;
  }
  

  /**
   * Methode zum Lesen einer Float-Zahl von der Konsole, die &uuml;ber
   * die Tastatur eingegeben wird. Die Eingabe endet mit der
   * Return-Taste. Sollte es sich bei der Eingabe um keinen
   * g&uuml;ltigen Wert handeln, wird -1 zur&uuml;ckgegeben.
   *
   * @return eingegebene Zahl
   */
  public float leseFloat() {
    float ergebnis;
    try {
      ergebnis = Float.parseFloat(this.leseString());
    } catch (NumberFormatException e) {
      ergebnis = -1f;
    }

    return ergebnis;
  }

  /**
   * Methode zum Lesen einer Double-Zahl von der Konsole, die
   * &uuml;ber die Tastatur eingegeben wird. Die Eingabe endet mit der
   * Return-Taste. Sollte es sich bei der Eingabe um keinen
   * g&uuml;ltigen Wert handeln, wird -1 zur&uuml;ckgegeben.
   *
   * @return eingegebene Zahl
   */
  public double leseDouble() {
    double ergebnis;
    try {
      ergebnis = Double.parseDouble(this.leseString());
    } catch (NumberFormatException e) {
      ergebnis = -1d;
    }

    return ergebnis;
  }

  /**
   * Methode zum Lesen eines Wahrheitswertes von der Konsole, der
   * &uuml;ber die Tastatur eingegeben wird. Die Eingabe endet mit der
   * Return-Taste. Sollte es sich bei der Eingabe nicht um "true"
   * handeln, wird false zur&uuml;ckgegeben.
   *
   * @return eingegebener Wahrheitswert
   */
  public boolean leseBoolean() {
    boolean ergebnis;
    try {
      ergebnis = Boolean.parseBoolean(this.leseString());
    } catch (Exception e) {
      ergebnis = false;
    }

    return ergebnis;
  }

  /**
   * Methode zur Ausgabe eines &uuml;bergebenen Textes. Es wird kein
   * Zeilenumbruch angeh&auml;ngt.
   *
   * @param obj auszugebendes Objekt (nutzt jeweiliges toString)
   */
  public void ausgeben(Object obj) {
    System.out.print(obj.toString());
  }

  /**
   * Methode zur C-formatierten Ausgabe verschiedener Variablen und
   * Textelemente
   *
   * @param text auszugebender Text, der Spezialzeichen wie %d als
   * Platzhalter f&uuml;r auszugebene Variablen enthalten kann
   * @param objekte Objekte, die an Stelle der Platzhalter im Text
   * ausgegeben werden sollen
   */
  public void formatiertAusgeben(String text,
          Object... objekte) {
    System.out.printf(text, objekte);
  }

  /**
   * Methode zur Erzeugung einer ganzahligen Zufallszahl zwischen
   * (einschlie&szlig;lich) den &uuml;bergebenen Grenzen. Es wird
   * erwartet und nicht gepr&uuml;ft, dass der Endwert nicht kleiner
   * als der Startwert ist.
   *
   * @param start minimal m&ouml;glicher Zufallswert
   * @param ende maximal m&ouml;glicher Zufallswert
   * @return zuf&auml;lliger Wert zwischen start und ende (auch diese
   * beiden Werte sind m&ouml;glich
   */
  public int zufall(Integer start, Integer ende) {
    return start
            + (int) (Math.random() * (ende - start + 1));
  }
  
  /** Methode dient zum Speichern eines beliebigen Objekts. Dies ist 
  * fuer selbstgeschrtiebene Klassen nur moeglich, nwenn sie einen 
  * parameterlosen Konstruktor haben.
  * @param <T> beliebiger Typ des abzuspeichernden Objekts
  * @param objekt zu speicherndes Objekt
  * @throws IOException Fehler, falls Klasse keinen parameterlosen konstruktor
  */
  public <T> void speichern(T objekt) throws IOException {
    try (
        FileOutputStream fos = new FileOutputStream("einObjekt.xml"); 
        XMLEncoder encoder = new XMLEncoder(fos)
    ) {
      Class<?> cl = objekt.getClass();
      if (!cl.getName().startsWith("java") && !cl.getName().startsWith("[")) {
        try {
          cl.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException 
            | IllegalArgumentException
            | InvocationTargetException | NoSuchMethodException 
            | SecurityException e) {
          throw new IllegalArgumentException("Objekte der Klasse " + cl.getName()
              + " so nicht speicherbar, da " + "parameterloser Konstruktor fehlt.");
        }
      }
      encoder.writeObject(objekt.getClass().getName());
      encoder.writeObject(objekt);
    }
  }

  /** Dient zum Laden des zuletzt gespeicherten Objekts, das
   * zurueckgegeben wird. Passt der Rueckgabetyp nicht zum Objekttyp,
   * wird eine ClassCastException geworfen.
   * @param <T> Erwarteter Typ der Rueckgabe, der zum Objekttyp passen muss
   * @return eingelesenes Objekt
   * @throws IOException wird geworfen, wenn Datei "einObjekt.xml" nicht existiert
   */
  @SuppressWarnings("unchecked")
  public <T> T laden() throws IOException {
    try (
        InputStream input = new FileInputStream("einObjekt.xml"); 
        XMLDecoder decoder = new XMLDecoder(input)
    ) {
      String typ = (String) decoder.readObject();
      Object o = decoder.readObject();
      System.out.println(typ + ": " + o);
      return (T) o;
    }
  }

// rein zu Testzwecken hier stehen gelassen, kann geloescht werden
//  public static void main(String[] s) {
//    EinUndAusgabe eingabe = new EinUndAusgabe();
//    int ein = 0;
//    while (ein != -1) {
//      System.out.print("Text eingeben: ");
//      System.out.println("Eingegeben wurde:" + eingabe.leseString());
//      System.out.print("Float eingeben: ");
//      System.out.println("Eingegeben wurde:" + eingabe.leseFloat());
//      System.out.print("Double eingeben: ");
//      System.out.println("Eingegeben wurde:" + eingabe.leseDouble());
//      System.out.print("Boolean eingeben: ");
//      System.out.println("Eingegeben wurde:" + eingabe.leseBoolean());
//      System.out.print("Byte eingeben: ");
//      System.out.println("Eingegeben wurde:" + eingabe.leseByte());
//      System.out.print("Long eingeben: ");
//      System.out.println("Eingegeben wurde:" + eingabe.leseLong());
//      System.out.print("Ganze Zahl eingeben (Abbruch mit -1): ");
//      ein = eingabe.leseInteger();
//      System.out.println("Eingegeben wurde: " + ein);
//    }
//  }
}
