package main.java.matriz;

import java.util.Arrays;
import java.util.Objects;
import main.java.complejos.*;

public class MatrizComplejo {
	private int fila;
	private int columna;
	private Complejo[][] matriz;
	
	
	public MatrizComplejo(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
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
