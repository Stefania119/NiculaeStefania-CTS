package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudent() {
		Grupa grupa=new Grupa(1083);
		IStudent student=new StudentDummy();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

}
