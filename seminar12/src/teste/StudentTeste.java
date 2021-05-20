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
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie=(nota1+nota2+nota3)/3.0f;
		assertEquals(medie, student.calculeazaMedie(),0.01);
	}
	@Test
	public void testCalculeazaMedieONota() {
		Student student=new Student();
		int nota1=10;
		student.adaugaNota(nota1);
		assertEquals(nota1, student.calculeazaMedie(),0.01);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCalculeazaMediaFaraNota(){
		Student student=new Student();
		student.calculeazaMedie();
		
	}
	@Test
	public void testAreRestante() {
		Student student=new Student();
		int nota1=8;
		int nota2=3;
		int nota3=4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante());
	}
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		int nota1=8;
		int nota2=5;
		int nota3=7;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertFalse(student.areRestante());
	}
	@Test
	public void testGetNota() {
		Student student=new Student();
		int nota1=8;
		int nota2=5;
		int nota3=7;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		//1
		try {
			//2
			student.getNota(3);
			//3
			fail("metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException exception) {
			//4
		}
		//5
	}
	@Test
	public void testAdaugaNotaIncorecta() {
		Student student=new Student();
		int nota=11;
		
	}

}