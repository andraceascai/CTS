package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract{
	
	private Card card;

	public Card getCard() {
		return card;
	}

	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void platesteOnline(int suma) {
		card.platesteOnline(suma);		
	}

	@Override
	public void platesteNormal(int suma) {
		card.platesteNormal(suma);
	}
	
	public abstract void platesteContactless(int suma);
	
}
