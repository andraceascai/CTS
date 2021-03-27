package ro.ase.cts.factoryMethod;

public class AtacantFactory implements Factory{

	@Override
	public Jucator creazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Atacant(numeJucator);
	}

}
