package ro.ase.cts.strategy;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazaPlata(double suma) {
		System.out.println("S-a realizat plata cash pentru suma de " + suma);		
	}
	
}
