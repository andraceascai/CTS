package ro.ase.cts.chain;

public class ContCurent extends Cont{

	public ContCurent(float sold, String iban) {
		super(sold, iban);
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() >= suma) {
			super.setSold(super.getSold() - suma);
			System.out.println("S-a realizat plata din contul curent cu duma de " + suma);
		}else {
			if(super.getSuccesor() != null) {
				super.getSuccesor().plateste(suma);
			}else {
				System.out.println("Plata nu se poate realiza!");
			}
		}
	}

}
