package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit SlowSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class SlowSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new SlowSort();
	}
	
	public void sortieren() {
		sortieren(0,zl.getZahlen().size()-1);
	}
	
	/**
	 * Diese Methode fuert SlowSort aus. Es werden als Parameter die Integer i und j als Schranken eines Intervalls uebergeben.
	 * Es wird zuerst ein Integer m als Mittelwert von i und j gebildet, wobei bei Kommawerten abgerundet wird.
	 * Anschliessend wird der Algorithmus auf die zwei Intervalle i bis m und m+1 bis j angewandt und rekursiv aufgerufen.
	 * Sollte i groesser oder gleich j sein, wird der Durchlauf beendet.
	 * Wenn der Wert der Zahl j kleiner ist als der von m, dann werden diese vertauscht. Abschliessend wird der gleiche Algorithmus auf i bis j-1 angewandt.
	 * Der langsame Algorithmus endet, wenn alle inneren Rekursionen durch return beendet wurden.
	 * @param i Untere Schranke eines Intervalls.
	 * @param j Obere Schranke eines Intervalls.
	 */
	public void sortieren(int i,int j) {
		if(i>=j) {
			return;
		}
		int m = (i+j)/2;
		sortieren(i,m);
		sortieren(m+1,j);
		if(zl.getZahlen().get(j) < zl.getZahlen().get(m)) {
			int temp = zl.getZahlen().get(j);
			zl.getZahlen().set(j,zl.getZahlen().get(m));
			zl.getZahlen().set(m,temp); 
		}
		sortieren(i,j-1);
	}

}