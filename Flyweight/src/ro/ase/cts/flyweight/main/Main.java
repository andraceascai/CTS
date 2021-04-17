package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.Client;
import ro.ase.cts.flyweight.FlyweightFactory;
import ro.ase.cts.flyweight.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Rezervare(1, 2, "12:00");
		Rezervare rezervare2 = new Rezervare(2, 3, "13:00");
		Rezervare rezervare3 = new Rezervare(3, 4, "14:00");
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Client client1 = flyweightFactory.getClient("1234567890");
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getClient("1111111111").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("1234567890").printeazaRezervare(rezervare3);
	}

}
