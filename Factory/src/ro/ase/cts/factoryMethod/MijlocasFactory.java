package ro.ase.cts.factoryMethod;

public class MijlocasFactory implements Factory{

	@Override
	public Jucator creazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Mijlocas(numeJucator);
	}

}
