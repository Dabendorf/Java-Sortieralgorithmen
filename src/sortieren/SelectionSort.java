package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit SelectionSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class SelectionSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new SelectionSort();
	}
	
	/**
	 * Diese Methode fuert SelectionSort aus. Hier werden die Indize von 0 bis size()-2 in einer for-Schleife durchgegangen.
	 * In jeder Runde wird in der inneren for-Schleife herausgefunden, welche Zahl die kleinste noch nicht sortierte Zahl ist.
	 * Anschliessend wird diese Zahl mit dem ersten unsortierten Element vertauscht und ein neuer Durchlauf gestartet.
	 */
	public void sortieren() {
		for(int j=0;j<zl.getZahlen().size()-1;j++) {
			int min = Integer.MAX_VALUE;
			int minstelle = Integer.MAX_VALUE;
			for(int i=j;i<zl.getZahlen().size();i++) {
				if(zl.getZahlen().get(i)<min || min==Integer.MAX_VALUE) {
					min = zl.getZahlen().get(i);
					minstelle = i;
				}
			}
			int temp = zl.getZahlen().get(minstelle);
			zl.getZahlen().set(minstelle,zl.getZahlen().get(j));
			zl.getZahlen().set(j,temp);
		}
	}

}