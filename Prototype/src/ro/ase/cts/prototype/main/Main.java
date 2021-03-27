package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.Bilet;
import ro.ase.cts.prototype.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client("Marcel", 23);
		Client client2 = (Client) client1.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);

		Bilet b1 = new Bilet(23, "echipa1", "Echipa2", "12:00");
		Bilet b2 = (Bilet) b1.copiaza();
		b2.setCod(1);
		Bilet b3 = (Bilet) b1.copiaza();
		b3.setCod(2);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
;	}

}
