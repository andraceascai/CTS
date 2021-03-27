package ro.ase.cts.factoryMethod;

public class FundasFactory implements Factory{

	@Override
	public Jucator creazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Fundas(numeJucator);
	}

}
