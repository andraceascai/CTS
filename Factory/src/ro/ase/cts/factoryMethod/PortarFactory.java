package ro.ase.cts.factoryMethod;

public class PortarFactory implements Factory{

	@Override
	public Jucator creazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Portar(numeJucator);
	}

}
