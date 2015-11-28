package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit ShellSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class ShellSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new ShellSort();
	}
	
	/**
	 * Diese Methode fuert ShellSort aus. Hierbei nutzt man die Grundlage von InsertionSort, mit verschiedenen Zahlenabstaenden, welche in einem Array Spalten definiert sind.
	 * Der Array, welcher auf den Theorien Sedgewicks basiert, wird mit int k durchgegangen, bis man nur noch in EinserSchritten sortieren muss.
	 * Die Variable h ist der Abstand, welcher dem Array entnommen wird. In einer for-Schleife werden die Werte von h bis Size-1 durchgegangen und in selbigen Abstaenden verglichen.
	 * Hierfuer dient die innere While-Schleife, welche so lange laeuft, wie j kleiner/gleich h (Vergleichsabstand) und j-h groesser als der Wert an Stelle j sind.
	 * j wird anschliessend um den Vergleichsabstand vermindert und der ehemalige j-Wert nach vorne auf die neue Position verschoben.
	 * Ein Ende findet nach dem letzten Durchlauf des Einser-Abstandes statt.
	 */
	public void sortieren() {
		int i;/** Entspricht der momentanen Vergleichsposition **/
		int j;/** Die letzte Vergleichsposition **/
		int k;/** Durchlaufvariable der Spaltenlaengen **/
		int h;/** Vergleichsabstand **/
        int[] spalten = {1391376, 463792, 198768, 86961, 33936, 13776, 4592, 1968, 861, 336, 112, 48, 21, 7, 3, 1};/** nach Sedgewick **/
        for(k=0;k<spalten.length; k++) {
        	h=spalten[k];
            for(i=h;i<zl.getZahlen().size(); i++) {/** Vergleich von h bis Size-1 **/
            	j=i;
                int t=zl.getZahlen().get(j);
                while(j>=h && zl.getZahlen().get(j-h)>t) {
                    zl.getZahlen().set(j, zl.getZahlen().get(j-h));
                    j -= h;
                }
                zl.getZahlen().set(j,t);
            }
        }
	}

}