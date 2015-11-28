package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit BubbleSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class BubbleSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new BubbleSort();
	}
	
	/**
	 * Diese Methode fuert BubbleSort aus. Hier werden zwei for-Schleifen ineinander geschachtelt. Die j-Schleife geht so viele Durchgaenge durch, wie es Zahlen-1 gibt.
	 * In der inneren Schleife werden die Indize der Zahlen, die noch nicht sortiert sind durchgegangen und muenden in einer ueberpruefenden if-Bedingung.
	 * Wenn die Zahl mit kleinerem Index groesser ist als ihr nachfolgender Index, dann werden die Zahlen mit Zuhilfenahme eines Zwischenspeichers ausgetauscht.
	 * Andernfalls wird der naechste Schleifendurchlauf gestartet.
	 */
	public void sortieren() {
		super.sortieren();
		for(int j=0;j<zl.getZahlen().size()-1;j++) {
			for(int i=0;i<zl.getZahlen().size()-1-j;i++) {
				if(zl.getZahlen().get(i)>zl.getZahlen().get(i+1)) {
					int temp = zl.getZahlen().get(i);
					zl.getZahlen().set(i,zl.getZahlen().get(i+1));
					zl.getZahlen().set(i+1,temp); 
				}
			}
		}
	}

}