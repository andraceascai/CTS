package ro.ase.cts.programe;


import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.ReaderAngajat;
import ro.ase.cts.clase.Angajat;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = ReaderAngajat.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}