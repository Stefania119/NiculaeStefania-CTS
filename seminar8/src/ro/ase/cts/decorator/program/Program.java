package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		NotaAbstracta notaAbstracta=new NotaDePlata(100);
		notaAbstracta.printeaza();
		DecoratorAbstract decorator=new DecoratorNotaLaMultiAni(notaAbstracta);
		decorator.printeazaFelicitare();
		decorator.printeaza();
		

	}

}
