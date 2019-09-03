package test.java;
import main.java.complejos.*;
import main.java.matriz.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void restaVector() {
		
		MatrizComplejo vector1 = new MatrizComplejo(2);
		vector1.addVector(new Complejo(5,3), 0);

		MatrizComplejo vector2 = new MatrizComplejo(2);
		vector2.addVector(new Complejo(4,1), 0);
		
		MatrizComplejo valor = new MatrizComplejo(2);
		valor.addVector(new Complejo(1,2), 0);
		
		valor.equals(MathMatrizComplejo.restaVector(vector1, vector2));
	}
	
	@Test
	public void multiplicacionEscalarMatriz() {
		
		MatrizComplejo matriz = new MatrizComplejo(4,1);
		matriz.addMatriz(new Complejo(16,2.3), 0, 0);
		matriz.addMatriz(new Complejo(0,-7), 1, 0);
		matriz.addMatriz(new Complejo(6,0), 2, 0);
		matriz.addMatriz(new Complejo(5,4), 3, 0);
		
		MatrizComplejo matrizEscalar = new MatrizComplejo(4,1);
		matrizEscalar.addMatriz(new Complejo(132.6,-13.6), 0, 0);
		matrizEscalar.addMatriz(new Complejo(-14,-56), 1, 0);
		matrizEscalar.addMatriz(new Complejo(48,-12), 2, 0);
		matrizEscalar.addMatriz(new Complejo(32,-42), 3, 0);
		
		Complejo complejo = new Complejo(3,2);
		
		matrizEscalar.equals(MathMatrizComplejo.multiplicacionEscalarMatriz(matriz, complejo));
	}
	
	
	@Test
	public void productoMatrices() {
		
		MatrizComplejo matriz1 = new MatrizComplejo(2,1);
		matriz1.addMatriz(new Complejo(2,-1), 0, 0);
		matriz1.addMatriz(new Complejo(10,5), 1, 0);
		
		MatrizComplejo matriz2 = new MatrizComplejo(1,2);
		matriz2.addMatriz(new Complejo(2,1), 0, 0);
		matriz2.addMatriz(new Complejo(9,11), 0, 1);
		
		MatrizComplejo resp = new MatrizComplejo(2,2);
		resp.addMatriz(new Complejo(5,0), 0, 0);
		resp.addMatriz(new Complejo(15,20), 1, 0);
		resp.addMatriz(new Complejo(29,13), 0, 1);
		resp.addMatriz(new Complejo(35,155), 1, 1);
		resp.equals(MathMatrizComplejo.productoMatrices(matriz1, matriz2));
	
	}
	
	@Test
	public void matrizTranspuesta() {
		
		MatrizComplejo matriz = new MatrizComplejo(3,1);
		matriz.addMatriz(new Complejo(6,6), 0, 0);
		matriz.addMatriz(new Complejo(20,-2), 1, 0);
		matriz.addMatriz(new Complejo(-5,21), 2, 0);

		
		MatrizComplejo transpuesta = new MatrizComplejo(1,3);
		transpuesta.addMatriz(new Complejo(6,6), 0, 0);
		transpuesta.addMatriz(new Complejo(20,-2), 0, 1);
		transpuesta.addMatriz(new Complejo(-5,21), 0, 2);
		
		transpuesta.equals(MathMatrizComplejo.MatrizTranspuesta(matriz));
		
	}
	
	@Test
	public void matrizConjugada() {
		
		MatrizComplejo matriz = new MatrizComplejo(2,2);
		matriz.addMatriz(new Complejo(6,-9), 0, 0);
		matriz.addMatriz(new Complejo(-4,-5), 1, 0);
		matriz.addMatriz(new Complejo(10,-11), 1, 1);
		matriz.addMatriz(new Complejo(50,21), 0, 1);
		
		MatrizComplejo conjugado = new MatrizComplejo(2,2);
		conjugado.addMatriz(new Complejo(6,9), 0, 0);
		conjugado.addMatriz(new Complejo(-4,5), 1, 0);
		conjugado.addMatriz(new Complejo(10,11), 1, 1);
		conjugado.addMatriz(new Complejo(50,-21), 0, 1);
		
		conjugado.equals(MathMatrizComplejo.MatrizConjugada(matriz));
		
	}
	
	@Test
	public void matrizAdjunta() {
		
		MatrizComplejo matriz = new MatrizComplejo(3,2);
		matriz.addMatriz(new Complejo(-1,-1), 0, 0);
		matriz.addMatriz(new Complejo(5,-5), 1, 0);
		matriz.addMatriz(new Complejo(0.2,0.3), 2, 0);
		matriz.addMatriz(new Complejo(9,8), 0, 1);
		matriz.addMatriz(new Complejo(4.88,-9.66), 1, 1);
		matriz.addMatriz(new Complejo(10.10,0), 2, 1);
		
		MatrizComplejo adjunta = new MatrizComplejo(2,3);
		adjunta.addMatriz(new Complejo(-1,1), 0, 0);
		adjunta.addMatriz(new Complejo(9,-8), 1, 0);
		adjunta.addMatriz(new Complejo(5,5), 0, 1);
		adjunta.addMatriz(new Complejo(4.88,9.66), 1, 1);
		adjunta.addMatriz(new Complejo(0.2,-0.3), 0, 2);
		adjunta.addMatriz(new Complejo(10.10,0), 1, 2);

		adjunta.equals(MathMatrizComplejo.matrizAdjunta(matriz));
	}
	
	@Test 
	public void normaMatriz() {
		
		MatrizComplejo matriz = new MatrizComplejo(2,1);
		matriz.addMatriz(new Complejo(3,0), 0, 0);
		matriz.addMatriz(new Complejo(4,0), 1, 0);
		
		//Complejo complejo = new Complejo(5,0);
		//complejo.modulo(complejo);
		
		//complejo.equals(MathMatrizComplejo.matrizNorma(matriz));
		assertEquals(5,MathMatrizComplejo.matrizNorma(matriz),2.0);
	}
	
	@Test 
	public void distanciaEntreMatrices() {
		
		MatrizComplejo matriz1 = new MatrizComplejo(3,1);
		matriz1.addMatriz(new Complejo(3,0), 0, 0);
		matriz1.addMatriz(new Complejo(1,0), 1, 0);
		matriz1.addMatriz(new Complejo(2,0), 2, 0);
		
		MatrizComplejo matriz2 = new MatrizComplejo(3,1);
		matriz2.addMatriz(new Complejo(2,0), 0, 0);
		matriz2.addMatriz(new Complejo(2,0), 1, 0);
		matriz2.addMatriz(new Complejo(-1,0), 2, 0);

		assertEquals(3.31662479,MathMatrizComplejo.matrizDistancia(matriz1, matriz2),1.0);

	}
	
	@Test
	public void matrizUnitaria() {
		
		MatrizComplejo matriz = new MatrizComplejo(2,2);
		matriz.addMatriz(new Complejo(1,1), 0, 0);
		matriz.addMatriz(new Complejo(1,-1), 1, 0);
		matriz.addMatriz(new Complejo(1,-1), 0, 1);
		matriz.addMatriz(new Complejo(1,1), 1, 1);

		
		assertEquals(false,MathMatrizComplejo.Unitaria(matriz));
	}
	
	@Test
	public void matrizHermitiana() {

		MatrizComplejo matriz = new MatrizComplejo(2,2);
		matriz.addMatriz(new Complejo(7,0), 0, 0);
		matriz.addMatriz(new Complejo(6,5), 1, 0);
		matriz.addMatriz(new Complejo(6,-5), 0, 1);
		matriz.addMatriz(new Complejo(-3,0), 1, 1);
		
		assertTrue(MathMatrizComplejo.matrizHermitiana(matriz));
	}
	
	@Test
	public void productoTensor() {

		MatrizComplejo matriz1 = new MatrizComplejo(1,2);
		matriz1.addMatriz(new Complejo(2,0), 0, 0);
		matriz1.addMatriz(new Complejo(3,0), 0, 1);
		
		MatrizComplejo matriz2 = new MatrizComplejo(2,2);
		matriz2.addMatriz(new Complejo(1,0), 0, 0);
		matriz2.addMatriz(new Complejo(3,0), 1, 0);
		matriz2.addMatriz(new Complejo(2,0), 0, 1);
		matriz2.addMatriz(new Complejo(4,0), 1, 1);
		
		MatrizComplejo tensor = new MatrizComplejo(2,4);
		tensor.addMatriz(new Complejo(2,0), 0, 0);
		tensor.addMatriz(new Complejo(6,0), 1, 0);
		tensor.addMatriz(new Complejo(4,0), 0, 1);
		tensor.addMatriz(new Complejo(8,0), 1, 1);
		tensor.addMatriz(new Complejo(3,0), 0, 2);
		tensor.addMatriz(new Complejo(9,0), 1, 2);
		tensor.addMatriz(new Complejo(6,0), 0, 3);
		tensor.addMatriz(new Complejo(12,0), 1, 3);
		tensor.equals(MathMatrizComplejo.productoTensor(matriz1, matriz2));
		

	}
	
	
}
