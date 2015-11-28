package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit HeapSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class HeapSort extends Sortieralgorithmus {

	private int n;
	
	public static void main(String[] args) {
		new HeapSort();
	}
	
	/**
	 * Diese Methode fuert HeapSort aus. Sie legt n auf die Groesse der ArrayList fest und bildet einen Baum.
	 * Anschliessend nimmt sie in einer While-Schleife so lange Tauschungen und Zweiganpassungen vor, bis n auf 1 geschrumpft ist.
	 */
	public void sortieren() {
		n = zl.getZahlen().size();
		bildeHeap();
        while(n>1) {
            n--;
            tauschen(0,n);
            unterHeap(0);
        }
	}
	
	/**
	 * Diese Methode bildet "Heaps" fuer n/2-1 bis 1 in einer for-Schleife, die ihren Index jede Runde um 1 senkt.
	 */
	private void bildeHeap() {
        for(int v=n/2-1; v>=0; v--) {
        	unterHeap(v);
        }    
    }

	/**
	 * Hier wird solange w, der Nachfolger von v kleiner als n ist ueberprueft, ob w+1 groesser als w ist und bei Richtigkeit w um eins erhoeht.
	 * Wenn v groesser gleich w ist, wird der Zweig abgebrochen, wenn nicht, findet eine Vertauschung und eine Fortsetzung der Methode statt.
	 * @param v Wurzelknotenindex
	 */
    private void unterHeap(int v) {
    	int w=2*v+1;/** Nachfolger von v bestimmen **/
    	while(w<n) {
            if(w+1<n) {
            	if(zl.getZahlen().get(w+1)>zl.getZahlen().get(w)) {
            		w++;
            	}
            }
            if(zl.getZahlen().get(v)>=zl.getZahlen().get(w)) {
            	return;
            }
            tauschen(v,w);/** Tausche v und w **/
            v=w;/** Weiterfuehrung mit v = w **/
            w=2*v+1;/** Nachfolger von v bestimmen **/
        }
    }
    
    /**
     * Diese Methode fuert eine Vertauschung der Variablen i und j durch.
     * @param i Erster zu tauschender Wert
     * @param j Zweiter zu tauschender Wert
     */
    private void tauschen(int i, int j) {
    	int temp = zl.getZahlen().get(i);
		zl.getZahlen().set(i,zl.getZahlen().get(j));
		zl.getZahlen().set(j,temp); 
    }

}