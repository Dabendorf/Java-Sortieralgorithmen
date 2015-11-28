package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit ShakerSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class ShakerSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new ShakerSort();
	}
	
	/**
	 * Diese Methode fuert ShakerSort aus. Hier existieren die beiden ausseren Begrenzungen a und b. Eine while-Schleife wird so lange ausgefuehrt, bis a nicht mehr kleiner als b ist.
	 * In jedem Durchgang werden die Zahlen nach BubbleSort-Prinzip von a nach b nach oben durchgereicht und anschliessend von b nach a nach unten durchgereicht.
	 * Nach jedem Sortiervorgang wird b um eins vermindert bzw. a um eins erhoeht.
	 */
	public void sortieren() {
		int a = 0, b=zl.getZahlen().size();
		while(a<b) {
			for(int i=a;i<b-1;i++) {
				if(zl.getZahlen().get(i) > zl.getZahlen().get(i+1)) {
					int temp = zl.getZahlen().get(i);
					zl.getZahlen().set(i,zl.getZahlen().get(i+1));
					zl.getZahlen().set(i+1,temp);
				}
			}
			b--;
			System.out.println(zl.getZahlen());
			for(int i=b-1;i>=a;i--) {
				if(zl.getZahlen().get(i) > zl.getZahlen().get(i+1)) {
					int temp = zl.getZahlen().get(i);
					zl.getZahlen().set(i,zl.getZahlen().get(i+1));
					zl.getZahlen().set(i+1,temp);
				}
			}
			a++;
			System.out.println(zl.getZahlen());
		}
	}

}