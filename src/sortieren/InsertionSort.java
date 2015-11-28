package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit InsertionSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class InsertionSort extends Sortieralgorithmus {
	
	public static void main(String[] args) {
		new InsertionSort();
	}
	
	/**
	 * Diese Methode fuert InsertionSort aus. Hier werden die Indize von 1 bis size()-1 in einer for-Schleife durchgegangen.
	 * In jedem Durchlauf wird der Index der bereits sortierten Zahlen am Anfang um eins erhoeht. Die Zahl danach, welche der ersten unsortierten Zahl entspricht wird genommen
	 * und anschliessend in einer inneren for-Schleife von dem Index der Zahl bis zum Index 0 durch Vergleiche ueberprueft, an welcher Stelle sie eingefuegt werden muss.
	 * Der Einfuegeindex bleibt -1, wenn die Zahl an der korrekten Stelle sein sollte.
	 * Wenn der Index nicht -1 ist, wird die Zahl an der neuen Stelle eingefuegt und von der alten Position entfernt.
	 */
	public void sortieren() {
		for(int j=1;j<zl.getZahlen().size();j++) {
			int zahl = zl.getZahlen().get(j);
			int tempindex = -1;
			for(int i=j-1;i>=0;i--) {
				if(zahl<=zl.getZahlen().get(i)) {
					tempindex = i;
				}
			}
			if(tempindex!=-1) {
				zl.getZahlen().add(tempindex,zahl);
				zl.getZahlen().remove(j+1);
			}
		}
	}

}