package sortieren;

/**
 * Diese Klasse ist die Hauptklasse der Sortieralgorithmen, von der alle anderen Algorithmen erben.
 * Es generiert eine Zahlenliste, fuehrt den Algorithmus aus und dokumentiert die Laufzeit.
 * @author Lukas
 * @version 1.0
 */
public class Sortieralgorithmus {

	public Zahlenliste zl;
	
	public Sortieralgorithmus() {
		zl = new Zahlenliste();
		long zeit = -System.currentTimeMillis();
		sortieren();
		ausgeben();
		System.out.println("Zeit: "+(zeit+System.currentTimeMillis())+"ms");
	}
	
	public void sortieren() {}
	
	/**
	 * Diese Methode gibt die sortierte Zahlenliste aus.
	 */
	private void ausgeben() {
		System.out.println(zl.getZahlen());
	}

}