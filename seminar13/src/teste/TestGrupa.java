package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;
import junit.framework.Assert;

public class TestGrupa {
	private Grupa grupa;
	@Before
	public void setUp() {
		grupa=new Grupa(1083);
		for(int i=0;i<35;i++) {
			Student student=new Student("Stefi");
			for(int j=0;j<7;j++)
			{student.adaugaNota(10);}
			grupa.adaugaStudent(student);
		}
	}

	@Test
	public void testConstructorCorect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructortrebuieSaArunceExceptie() {
		Grupa grupa=new Grupa(988);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructortrebuieSaArunceExceptieinAfaraLimitei() {
		Grupa grupa=new Grupa(1200);
		
	}
	@Test(timeout = 500)
	public void testConstructorPerformanta() {
		Grupa grupa=new Grupa(1082);
	}
	@Test
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa=new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}
	@Test
	public void testPromovabilitateCorect() {
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<3;i++)
		{
			Student student=new Student("Steff");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<7;i++) {
			Student student=new Student("Stefi");
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	public void testPromovabilitateLimitaInferioara() {
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<3;i++)
		{
			Student student=new Student("Steff");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
			float promovabilitate=0f;
			assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
		}
	}
	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<7;i++) {
			Student student=new Student("Stefi");
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1.0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPromovabilitateConditieEroare() {
		
		
		Grupa grupa=new Grupa(1083);
		grupa.getPromovabilitate();
	}
	@Test(timeout=500)
	public void testPromovabilitatePerformance(){
		
		grupa.getPromovabilitate();
	}

}
