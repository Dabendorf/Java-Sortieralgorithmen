package sortieren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Diese Klasse generiert eine Liste von Integern von a bis b. Die Parameter a und b werden vom User ueber die Konsole eingegeben.
 * @author Lukas
 * @version 1.0
 */
public class Zahlenliste {
	
	private int[] vonBis = new int[2];
	private ArrayList<Integer> zahlen = new ArrayList<Integer>();
	
	public Zahlenliste() {
		Scanner sc = new Scanner(System.in);
		vonBis[0] = sc.nextInt();
		vonBis[1] = sc.nextInt();
		if(vonBis[0]>vonBis[1]) {
			int temp = vonBis[0];
			vonBis[0] = vonBis[1];
			vonBis[1] = temp;
		}
		for(int i=vonBis[0];i<=vonBis[1];i++) {
			zahlen.add(i);
		}
		Collections.shuffle(zahlen);
		System.out.println(zahlen);
		sc.close();
	}

	public ArrayList<Integer> getZahlen() {
		return zahlen;
	}

}