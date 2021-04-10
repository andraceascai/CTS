package ro.ase.cts.facade.main;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana = new Persoana("Gigi","1881234567599");
		if(persoana.getVarsta() > 18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou = new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					System.out.println("S-a creat contul");
				}
			}
		}
		
		Persoana  persoana2 = new Persoana("Marcel","1882222222579");
		if(VerificatorPersoana.verificaPersoana(persoana2)) {
			System.out.println("S-a creat contul");
		}else {
			System.out.println("Nu s-a creat contul");
		}
	}

}
