package ro.ase.cts.decorator;

public class DecoratorContactleessTelefon extends DecoratorAbstract{

	public DecoratorContactleessTelefon(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless(int suma) {
		if(super.getCard().getSold()>suma) {
			System.out.println("A facut plata contactless cu telefonul: " + suma);
			super.getCard().setSold(super.getCard().getSold()-suma);
		}
		
		
	}
	
}
