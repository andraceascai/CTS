package ro.ase.cts.builder.main;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilderConcret;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1 = new Rezervare(12345, false, false, false, true, "rock");
		
		Rezervare r2 = new RezervareBuilderConcret().setCodRezervare(1610).setAreScaunErgonomic(true).build(); 
		Rezervare r3 = new RezervareBuilderConcret().setCodRezervare(1111).setGenMuzica("clasica").build();
	
		System.out.println(r2);
		System.out.println(r3);
	}

}
