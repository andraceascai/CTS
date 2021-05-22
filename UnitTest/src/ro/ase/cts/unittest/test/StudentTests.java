package ro.ase.cts.unittest.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.unittest.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametrii() {
		String nume = "Gigel";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student = new Student();
		//assertNotEquals(null, student.getNume());
		assertNotNull("Numele este null", student.getNume());
		assertNotNull("Lista nu este initializata", student.getNote());
	}
	
	@Test
	public void testAdaugareNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiunelista() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculMedie() {
		Student student = new Student();
		int nota1 = 5;
		int nota2 = 10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		float medie = student.calculeazaMedie();
		float medieCalc = (float) ((nota1 + nota2) / 2.0);
		assertEquals(medieCalc, medie, 0.001);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(6);
		student.adaugaNota(10);
		assertFalse(student.areRestante());
	}

}
