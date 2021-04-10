package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorConcret;
import ro.ase.cts.decorator.DecoratorContactleessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card1 = new Card("Gigel", 500);
		card1.platesteNormal(10);
		card1.platesteOnline(20);
		
		DecoratorConcret cardNou = new DecoratorConcret(card1);
		cardNou.platesteContactless(50);
		cardNou.platesteNormal(5);
		cardNou.platesteOnline(67);
		
		DecoratorContactleessTelefon decoratorTelefon = new DecoratorContactleessTelefon(card1);
		decoratorTelefon.platesteContactless(97);
	}

}
