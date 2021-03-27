package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.Factory;
import ro.ase.cts.simpleFactory.Jucator;
import ro.ase.cts.simpleFactory.TipJucator;

public class Main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.Portar, "Dorel");
		Jucator fundas = factory.getJucator(TipJucator.Fundas, "Mircea");
		Jucator atacant = factory.getJucator(TipJucator.Atacant, "Ionel");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
		System.out.println(atacant.toString());
	}
}
