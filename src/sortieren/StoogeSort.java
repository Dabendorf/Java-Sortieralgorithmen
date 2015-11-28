package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit StoogeSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class StoogeSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new StoogeSort();
	}
	
	public void sortieren() {
		sortieren(0,zl.getZahlen().size()-1);
	}
	
	/**
	 * Diese Methode fuert StoogeSort aus. Es werden als Parameter die Integer i und j als Schranken eines Intervalls uebergeben.
	 * Nun wird ueberprueft, ob j kleiner als i ist und die beiden Werte korrekt sortiert. Sollte die Differenz aus j und i groesser als 1 sein, so wird das Feld gedrittelt
	 * und anschliessend die ersten zwei Drittel, dann die zweiten zwei Drittel und zum Schluss wieder die ersten zwei Drittel sortiert.
	 * Dies passiert rekursiv durch Aufruf der Funktion selbst und ist dementsprechend langsam.
	 */
	public void sortieren(int i,int j) {
		if(zl.getZahlen().get(j)<zl.getZahlen().get(i)) {
			int temp = zl.getZahlen().get(i);
			zl.getZahlen().set(i,zl.getZahlen().get(j));
			zl.getZahlen().set(j,temp);
		}
		if(j-i>1) {
			int drittel=(j-i+1)/3;
			sortieren(i,j-drittel);
			sortieren(i+drittel,j);
			sortieren(i,j-drittel);
		}
	}

}