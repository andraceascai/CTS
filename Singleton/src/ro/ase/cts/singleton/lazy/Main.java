package ro.ase.cts.singleton.lazy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carte carte1= Carte.getInstanta("Ion", 300, 6.5);
		Carte carte2= Carte.getInstanta("Moara cu noroc", 125, 7.2);

		System.out.println(carte1.toString());
		System.out.println(carte2.toString());
		
		carte1.setNumarPagini(600);
		carte2.setNumeCarte("Carte");
		
		System.out.println(carte1.toString());
		System.out.println(carte2.toString());
		
	}

}
