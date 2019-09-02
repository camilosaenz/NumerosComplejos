package test.java;
import main.java.complejos.*;
import main.java.matriz.*;


import org.junit.Test;


public class TestMatrizComplejo {
	
	@Test
	public void sumaMatriz() {
		
		MatrizComplejo matriz1 = new MatrizComplejo(2,1);
		
		matriz1.addMatriz(new Complejo(5,3), 0, 0);
		matriz1.addMatriz(new Complejo(6,-1), 1, 0);
		
		MatrizComplejo matriz2 = new MatrizComplejo(2,1);
		matriz2.addMatriz(new Complejo(-2,-9), 0, 0);
		matriz2.addMatriz(new Complejo(-5,-4), 1, 0);
		
		MatrizComplejo matriz3 = new MatrizComplejo(2,1);
		matriz3.addMatriz(new Complejo(3,-6), 0, 0);
		matriz3.addMatriz(new Complejo(1,-5), 1, 0);
		
		matriz3.equals(MathMatrizComplejo.sumaMatriz(matriz1, matriz2));
	}
	
	@Test
	public void restaMatriz() {
		
		MatrizComplejo matriz1 = new MatrizComplejo(2,1);
		
		matriz1.addMatriz(new Complejo(5,3), 0, 0);
		matriz1.addMatriz(new Complejo(6,-1), 1, 0);
		
		MatrizComplejo matriz2 = new MatrizComplejo(2,1);
		matriz2.addMatriz(new Complejo(-2,-9), 0, 0);
		matriz2.addMatriz(new Complejo(-5,-4), 1, 0);
		
		MatrizComplejo matriz3 = new MatrizComplejo(2,1);
		matriz3.addMatriz(new Complejo(7,12), 0, 0);
		matriz3.addMatriz(new Complejo(11,3), 1, 0);
		
		matriz3.equals(MathMatrizComplejo.sumaMatriz(matriz1, matriz2));
	}
	
	
	/**
	@Test
	public void sumaVector() {
		
		MatrizComplejo vector1 = new MatrizComplejo(2);
		vector1.addVector(new Complejo(5,3), 0);

		MatrizComplejo vector2 = new MatrizComplejo(2);
		vector2.addVector(new Complejo(4,1), 0);
		
		MatrizComplejo valor = new MatrizComplejo(2);
		valor.addVector(new Complejo(9,4), 0);
		
		valor.equals(MathMatrizComplejo.sumaVector(vector1, vector2));
	}
	*/
	
}
