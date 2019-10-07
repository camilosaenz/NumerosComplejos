package main.java.matriz;

import main.java.complejos.Complejo;
import main.java.complejos.MathComplejo;

public class MathMatrizComplejo {
	
	
	/**
	 * 
	 */
	public static MatrizComplejo sumaVector(MatrizComplejo vector1, MatrizComplejo vector2) {
		MatrizComplejo suma = new MatrizComplejo(vector1.getFila(), vector1.getColumna());
			for (int i=0; i < vector1.getFila(); i++) {
				suma.getVector()[i] = MathComplejo.suma(vector1.getVector()[i], vector2.getVector()[i]);
			}
			return suma;
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo restaVector(MatrizComplejo vector1, MatrizComplejo vector2) {
		MatrizComplejo suma = new MatrizComplejo(vector1.getFila(), vector1.getColumna());
			for (int i=0; i < vector1.getFila(); i++) {
				suma.getVector()[i] = MathComplejo.resta(vector1.getVector()[i], vector2.getVector()[i]);
			}
			return suma;
	}
	
	/**
	 * 
	 */
	public static Complejo[] multiplicacionEscalar(Complejo[] vector1, Complejo num1) {
		
		Complejo[] multiplicacion = new Complejo[vector1.length];
		for (int i=0; i<vector1.length; i++) {
			Complejo valor = MathComplejo.producto(vector1[i], num1);
			multiplicacion[i] = valor;
		}
		return multiplicacion;
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo multiplicacionEscalarMatriz(MatrizComplejo matriz, Complejo complejo) {
		
		MatrizComplejo multiplicacion = new MatrizComplejo(matriz.getFila(),matriz.getColumna());		
			for(int fila = 0; fila < matriz.getFila(); fila++) {
				for (int columna = 0; columna < matriz.getColumna(); columna++) {
					multiplicacion.getMatriz()[fila][columna] = MathComplejo.producto(complejo,matriz.getMatriz()[fila][columna]);
			}
		}
		return multiplicacion;
	}
	
	
	/**
	 * 
	 */
	public static MatrizComplejo sumaMatriz(MatrizComplejo matriz1, MatrizComplejo matriz2) {
		
		if((matriz1.getColumna() == matriz2.getColumna()) && (matriz1.getFila() == matriz2.getFila())) {
			MatrizComplejo sumaMatriz = new MatrizComplejo(matriz1.getFila(), matriz1.getColumna());
			for(int i = 0; i < matriz1.getFila(); i++) {
				for (int j = 0; j < matriz1.getColumna(); j++) {
					sumaMatriz.getMatriz()[i][j] = MathComplejo.suma(matriz1.getMatriz()[i][j], matriz2.getMatriz()[i][j]);
				}
			}
			return sumaMatriz;
		}else {
			return null;
		}
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo restaMatriz(MatrizComplejo matriz1, MatrizComplejo matriz2) {
		if((matriz1.getColumna() == matriz2.getColumna()) && (matriz1.getFila() == matriz2.getFila())) {
			MatrizComplejo restaMatriz = new MatrizComplejo(matriz1.getFila(), matriz1.getColumna());
			for(int i = 0; i < matriz1.getFila(); i++) {
				for (int j = 0; j < matriz1.getColumna(); j++) {
					restaMatriz.getMatriz()[i][j] = MathComplejo.resta(matriz1.getMatriz()[i][j], matriz2.getMatriz()[i][j]);
				}
			}
			
			return restaMatriz;
		}else {
			return null;
		}
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo productoMatrices(MatrizComplejo matriz1, MatrizComplejo matriz2) {
		
		MatrizComplejo multi = new MatrizComplejo(matriz1.getColumna(),matriz2.getFila());
		if(matriz1.getFila() == matriz2.getColumna()) {
		for(int fila = 0; fila < matriz1.getColumna(); fila++) {
			for(int columna = 0; columna < matriz2.getFila(); columna++) {
				Complejo complejo = new Complejo(0,0);
				complejo = MathComplejo.suma(complejo, MathComplejo.producto(matriz1.getMatriz()[fila][columna], matriz2.getMatriz()[columna][fila]));
				multi.getMatriz()[fila][columna] = complejo;
				}
			}
		}
		return multi;
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo MatrizTranspuesta(MatrizComplejo matriz) {
		MatrizComplejo matrizTranspuesta = new MatrizComplejo(matriz.getFila(),matriz.getColumna());
		for(int fila=0; fila < matrizTranspuesta.getFila(); fila++) {
			for(int columna=0; columna < matrizTranspuesta.getColumna(); columna++) {
				matrizTranspuesta.getMatriz()[fila][columna]=matriz.getMatriz()[fila][columna];
			}
		}
		return matrizTranspuesta;
	}
	
	
	/**
	 * 
	 */
	public static MatrizComplejo MatrizConjugada(MatrizComplejo matriz) {
		MatrizComplejo matrizConjugada = new MatrizComplejo(matriz.getFila(),matriz.getColumna());
		for(int fila=0; fila < matrizConjugada.getFila();fila++) {
			for(int columna=0; columna < matrizConjugada.getColumna();columna++) {
				matrizConjugada.getMatriz()[fila][columna] = matriz.getMatriz()[fila][columna].conjugado(matriz.getMatriz()[fila][columna]);
			}
		}
		return matrizConjugada;
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo matrizAdjunta(MatrizComplejo matriz) {
		return MatrizConjugada(MatrizTranspuesta(matriz));
	}
	
	/**
	 * 
	 */
	public static double matrizNorma(MatrizComplejo matriz) {
		
		double valor = 0.0;
		for(int fila = 0; fila < matriz.getFila(); fila++) {
			for(int columna = 0; columna < matriz.getColumna(); columna++) {
				valor += Math.pow(matriz.getMatriz()[fila][columna].modulo(matriz.getMatriz()[fila][columna]), valor);
			}
		}
		return valor;
		
	}
	
	/**
	 * 
	 */
	public static double matrizDistancia(MatrizComplejo matriz1, MatrizComplejo matriz2) {
		double distancia = MathMatrizComplejo.matrizNorma(MathMatrizComplejo.restaMatriz(matriz1, matriz2));
		double valor = Math.sqrt(distancia);
		return valor;
		
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo MatrizIdentidad(MatrizComplejo matriz1) {
		
		MatrizComplejo matrizIdentidad = new MatrizComplejo(matriz1.getFila(), matriz1.getColumna());
		for(int fila = 0; fila < matriz1.getFila(); fila++) {
			for(int columna = 0; columna < matriz1.getColumna(); columna++) {
				if(fila == columna) {
					matrizIdentidad.getMatriz()[fila][columna]=new Complejo(1,0);
				}
				else {
					matrizIdentidad.getMatriz()[fila][columna]=new Complejo(1,0);
				}
			}
		}
		return matrizIdentidad;
	}
	
	/**
	 * 
	 */
	public static Boolean Unitaria(MatrizComplejo matriz1) {
		
		Boolean bool = false;
		
		if(productoMatrices(matriz1,matrizAdjunta(matriz1)) == MatrizIdentidad(matriz1)){
			bool = true;
		}
		return bool;
	}
	
	/**
	 * 
	 */
	public static Boolean matrizHermitiana(MatrizComplejo matriz) {
		
		Boolean bool = false;
		if(matrizAdjunta(matriz).equals(matriz)) {
			bool = true;
			return bool;
		}else {
			bool = false;
			return bool;
		}
		
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo productoTensor(MatrizComplejo matriz1, MatrizComplejo matriz2) {
		MatrizComplejo tensor = new MatrizComplejo(matriz1.getFila()*matriz2.getFila(), matriz1.getColumna()*matriz2.getColumna());
		for(int i = 0; i < matriz1.getFila(); i++) {
			for(int j = 0; j < matriz1.getColumna(); j++) {
				for(int k = 0; k < matriz2.getFila(); k++) {
					for(int l = 0; l < matriz2.getColumna(); l++) {
						tensor.getMatriz()[i*matriz2.getFila()+k][j*matriz2.getFila()+l] = MathComplejo.producto(matriz1.getMatriz()[i][j],matriz2.getMatriz()[k][l]);
					}
				}
			}
		}
		return tensor;
	}
	
	/**
	 * 
	 */
	public static MatrizComplejo accionMatriz(MatrizComplejo matriz, MatrizComplejo vector) {
		MatrizComplejo accion = new MatrizComplejo(matriz.getColumna(),vector.getFila());
		if(matriz.getFila() == vector.getColumna()) {
			for(int i = 0; i < matriz.getColumna(); i++) {
				for(int j = 0; j < matriz.getFila(); j++) {
					Complejo complejo = new Complejo(0,0);
					complejo = MathComplejo.producto(matriz.getMatriz()[i][j], vector.getMatriz()[j][i]);
					accion.getMatriz()[i][j] = complejo;
				}
			}
		}
		return accion;
	}
	
	public static Complejo productoInterno(MatrizComplejo matriz1, MatrizComplejo matriz2) {
		Complejo valor = new Complejo(0,0);
		for(int fila = 0; fila < matriz1.getFila(); fila++) {
			for(int columna = 0; columna < matriz1.getColumna(); columna++) {
				valor = MathComplejo.suma(valor, MathComplejo.producto(matriz1.getMatriz()[fila][columna], matriz2.getMatriz()[fila][columna]));
			}
		}
		return valor;
	}
	
}