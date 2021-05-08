package ro.ase.cts.chain.main;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;

public class Main {

	public static void main(String[] args) {
		
		Cont contEconomii = new ContEconomii(1000, "RO356287");
		Cont contCredit= new ContCredit(2000, "RO254453");
		Cont contCurent= new ContCurent(1200, "RO425377");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(400);
		contCurent.plateste(700);
		contCurent.plateste(2000);
		contCurent.plateste(700);
		contCurent.plateste(700);

	}

}
