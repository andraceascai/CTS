package ro.ase.cts.strategy;

public class PlataCard implements ModPlata{

	@Override
	public void realizeazaPlata(double suma) {
		System.out.println("S-a realizat plata cu cardul pentru suma de " + suma);
	}

}
