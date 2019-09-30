package main.java.complejos;

import main.java.matriz.MathMatrizComplejo;
import main.java.matriz.MatrizComplejo;


public class SimulacionClasicoACuantico {
	
	public MatrizComplejo ejercicio311(MatrizComplejo matriz1, MatrizComplejo matriz2, int clicks) {
		MatrizComplejo matriz3 = null;
		MatrizComplejo valor = matriz1;
		
		for(int i =1; i < clicks; i++) {
			valor = MathMatrizComplejo.productoMatrices(matriz1, valor);
		}
		matriz3 = MathMatrizComplejo.productoMatrices(valor, matriz2);
		return matriz3;
	}
	
	public MatrizComplejo ejercicio321(int valor, int change) {
		
		int resultado = 1 + valor + change;
		MatrizComplejo matriz = new MatrizComplejo(resultado, resultado);
		for(int i = 0; i < matriz.getFila(); i++) {
			for(int j = 0; j < matriz.getColumna(); j++) {
				matriz.addMatriz(new Complejo(0,0),i,j);
			}
		}
		float res = (float) 1 / valor;
		Complejo probabilidad = new Complejo(res, 0);
		for(int k = 1; k < valor; k++) {
			matriz.addMatriz(probabilidad, k , 0);
		}
		
		float num1 = (float) Math.ceil((float)change/valor);
		float num2 = (float) 1/num1;
		Complejo prob = new Complejo(num2, 0);
		for(int number1 = valor+1; number1 < resultado; number1++) {
			for(int number2 = 1; number2 < valor; number2++) {
				matriz.addMatriz(prob,number1,number2);
				if((change % valor) == 1) {
					
				}else if((change % valor) == 1) {
					
				}
			}
		}
		Complejo num3 = new Complejo(1, 0);
		for(int number3 = valor +1; number3 < resultado; number3++) {
			for(int number4 = valor+1; number4 < valor; number4++) {
				if(number3==0) {
					matriz.addMatriz(num3, number3, number4);
				}
			}
		}
		return matriz;
	}
	
}