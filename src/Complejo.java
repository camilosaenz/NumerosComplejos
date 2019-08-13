package numerosComplejos;

import java.lang.Math;
import java.util.ArrayList;;

public class Complejo {
	
	public double entera;
	public double compleja;
	
	public Complejo (double entera, double compleja) {
		this.compleja = compleja;
		this.entera = entera;
	}
	
	//Modulo de numeros Complejos
	public double modulo(Complejo a) {
		double resultado = Math.sqrt((a.entera*a.entera) + (a.compleja*a.compleja));
		return resultado;
	}
	
	//Conjugado de numeros Complejos
	public Complejo conjugado(Complejo a) {
		return new Complejo(a.entera, -a.compleja);
	}
	
	//Fase de Numeros Complejos
	public double fase(Complejo a) {
		double res = Math.atan((a.compleja)/(a.entera));
		res = (((res)*(180))/(Math.PI));
		return res;
	}
	
	//Conversion Polar de numeros Complejos
	public ArrayList<Double> conversion(){
		
		return null;
	}

	public double getEntera() {
		return entera;
	}

	public void setEntera(double entera) {
		this.entera = entera;
	}

	public double getCompleja() {
		return compleja;
	}

	public void setCompleja(double compleja) {
		this.compleja = compleja;
	}
	
	
}
