package cts.ase.ro.adapter;

public class AdapterObiecteBilet implements BIletOnline{
	private Bilet bilet;
	
	public AdapterObiecteBilet(Bilet bilet) {
		this.bilet = bilet;
	}
	
	@Override
	public void vindeBiletOnline() {
		this.bilet.vinde();
		
	}

	@Override
	public void rezervaBiletOnline() {
		this.bilet.rezerva();
		
	}

}
