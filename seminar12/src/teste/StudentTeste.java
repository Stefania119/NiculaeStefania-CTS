package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTeste {

	@Test
	public void testConstructorCuParametru() {
		String nume="Gigel";
		Student student=new Student(nume);
		assertEquals("Numele nu a fost initializat",nume, student.getNume());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student=new Student();
		student.setNume(nume);
		assertEquals("Numele nu a fost initializat",nume, student.getNume());
	}
	@Test
	public void testConstructorFaraParametru() {
		Student student=new Student();
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	@Test
	public void testAdaugareNotainLista() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}

}
