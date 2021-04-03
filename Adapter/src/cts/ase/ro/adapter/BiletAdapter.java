package cts.ase.ro.adapter;

public class BiletAdapter extends Bilet implements BIletOnline {

	public BiletAdapter(int pret) {
		super(pret);
	
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}

}
