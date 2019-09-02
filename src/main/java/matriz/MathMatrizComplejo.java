package main.java.matriz;

import main.java.complejos.Complejo;
import main.java.complejos.MathComplejo;

public class MathMatrizComplejo {
	
	private MathComplejo operaciones = new MathComplejo();
	
	/**
	 * 
	 */
	public static Complejo[] sumaVector(Complejo[] vector1, Complejo[] vector2) {
		
		if(vector1.length == vector2.length) {
			Complejo[] suma = new Complejo[vector1.length];
			for (int i=0; i<vector1.length;i++) {
				Complejo valor = MathComplejo.suma(vector1[i], vector2[i]);
				suma[i] = valor;
			}
			return suma;
			
		}else {
			return null;
		}
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
	
}