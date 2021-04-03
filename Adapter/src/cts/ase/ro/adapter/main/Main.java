package cts.ase.ro.adapter.main;

import cts.ase.ro.adapter.AdapterObiecteBilet;
import cts.ase.ro.adapter.BIletOnline;
import cts.ase.ro.adapter.Bilet;
import cts.ase.ro.adapter.BiletAdapter;

public class Main {
	
	public static void rezervaSiVindeBiletLaasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletPePlatforma(BIletOnline biletOnline) {
		biletOnline.vindeBiletOnline();
		biletOnline.rezervaBiletOnline();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet = new Bilet(20);
		rezervaSiVindeBiletLaasa(bilet);
		
		BiletAdapter biletAdapter = new BiletAdapter(25);
		rezervaSiVindeBiletPePlatforma(biletAdapter);
		
		BIletOnline biletOnline = new AdapterObiecteBilet(bilet);
		rezervaSiVindeBiletPePlatforma(biletOnline);
	}

}
