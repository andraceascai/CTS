package ro.ase.cts.programe;


import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.ReaderAngajat;
import ro.ase.cts.clase.readers.ReaderAplicanti;
import ro.ase.cts.clase.readers.ReaderElev;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;

public class Program {

	public static List<Aplicant>citesteAplicanti(ReaderAplicanti reader) throws FileNotFoundException{
		List<Aplicant>listaAplicanti=reader.readAplicanti();
		return listaAplicanti;
		
	}
	
	public static void afisareAplicanti(List<Aplicant> listaAplicanti) {
		Proiect proiect = new Proiect(81);
		for(Aplicant aplicant:listaAplicanti){
			System.out.println(aplicant.toString());
			aplicant.afisareSumaFinantata();
			aplicant.afiseazaStatusPeProiect(proiect);
		}
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new ReaderAngajat("angajati.txt"));
			afisareAplicanti(listaAplicanti);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
