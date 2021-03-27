package ro.ase.cts.factoryMethod.main;

import ro.ase.cts.factoryMethod.Factory;
import ro.ase.cts.factoryMethod.FundasFactory;
import ro.ase.cts.factoryMethod.Jucator;
import ro.ase.cts.factoryMethod.MijlocasFactory;
import ro.ase.cts.factoryMethod.PortarFactory;

public class Main {
	private static void afiseazaJucator(Factory factory, String numeJucator) {
		Jucator jucator = factory.creazaJucator(numeJucator);
		System.out.println(jucator.toString());
	}
	
	public static void main(String[] args) {
		afiseazaJucator(new PortarFactory(), "Mihai");
		afiseazaJucator(new FundasFactory(), "Alexandru");
		afiseazaJucator(new MijlocasFactory(), "Radu");
	}
}
