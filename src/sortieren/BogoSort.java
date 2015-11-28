package sortieren;

/**
 * Diese Klasse nutzt eine ueber Zahlenliste generierte Liste an Integern und sortiert sie mit BogoSort. Es gibt ausserdem die Laufzeit zum Sortieren aus.
 * @author Lukas
 * @version 1.0
 */
public class BogoSort extends Sortieralgorithmus {

	public static void main(String[] args) {
		new BogoSort();
	}
	
	/**
	 * Diese Methode fuert BogoSort aus. Hierbei werden zwei zufaellig ausgesuchte Zahlen miteinander vertauscht und anschliessend durch Vergleiche geprueft, ob die Sortierung korrekt ist.
	 * Die Laufzeit ist zufaellig und tendiert bei groesseren Zahlenlisten gegen unendlich.
	 */
	public void sortieren() {
		while(!istSortiert()) {
			int randomindex1 = (int)(Math.random()*zl.getZahlen().size());
		    int randomindex2 = (int)(Math.random()*zl.getZahlen().size());
		    int temp1 = zl.getZahlen().get(randomindex1);
		    int temp2 = zl.getZahlen().get(randomindex2);
		    zl.getZahlen().set(randomindex1, temp2);
		    zl.getZahlen().set(randomindex2, temp1);
			System.out.println(zl.getZahlen());
		}
	}
	
	private boolean istSortiert() {
		for(int i=1;i<zl.getZahlen().size();i++) {
			if(zl.getZahlen().get(i-1)>zl.getZahlen().get(i)) {
				return false;
			}
		}
		return true;
	}

}