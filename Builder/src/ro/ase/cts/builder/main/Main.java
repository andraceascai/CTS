package ro.ase.cts.builder.main;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilderConcret;
import ro.ase.cts.builder.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1 = new Rezervare(12345, false, false, false, true, "rock");
		
		Rezervare r2 = new RezervareBuilderConcret().setCodRezervare(1610).setAreScaunErgonomic(true).build(); 
		Rezervare r3 = new RezervareBuilderConcret().setCodRezervare(1111).setGenMuzica("clasica").build();
	
		System.out.println(r2);
		System.out.println(r3);
		
		RezervareBuilderV2 rezervareBuilder1 = new RezervareBuilderV2();
		rezervareBuilder1.setAreMancareInclusa(true).setAreBauturaInclusa(true);
		Rezervare rezervare4 = rezervareBuilder1.setCodRezervare(11111).build();	
		
		System.out.println(rezervareBuilder1);
		System.out.println(rezervare4);
		
	}
	
	    

}
