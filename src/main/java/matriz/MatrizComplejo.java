package main.java.matriz;

import java.util.Arrays;
import java.util.Objects;
import main.java.complejos.*;

public class MatrizComplejo {
	private int fila;
	private int columna;
	private int valor;
	private Complejo[][] matriz;
	private Complejo[] vector;
	
	
	public MatrizComplejo(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
		this.matriz = new Complejo[fila][columna];
	}
	
	public MatrizComplejo(int valor) {
		this.valor=valor;
		this.vector = new Complejo[valor];
	}

	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}


	public Complejo[][] getMatriz() {
		return matriz;
	}


	public void setMatriz(Complejo[][] matriz) {
		this.matriz = matriz;
	}
	
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Complejo[] getVector() {
		return vector;
	}

	public void setVector(Complejo[] vector) {
		this.vector = vector;
	}
	
	public void addVector(Complejo complejo, int valor) {
		this.vector[valor]=complejo;
	}
	
	public void addMatriz(Complejo complejo, int fila, int columna) {
		this.matriz[fila][columna]=complejo;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		MatrizComplejo that = (MatrizComplejo) o;
		Boolean equalmatrix=true;
		
		if(fila==that.fila && columna==that.columna) {
			for(int i=0; i<fila && fila==that.fila && columna==that.columna;i++) {
				for(int j=0; j<columna;j++) {
					equalmatrix=this.getMatriz()[i][j].equals(that.getMatriz()[i][j]);
				}
			}
		}
		return equalmatrix;
	}

	
	@Override
	public int hashCode() {
		int result = Objects.hash(fila,columna);
		result = 31*result+Arrays.hashCode(matriz);
		return result;
		
	}
}
