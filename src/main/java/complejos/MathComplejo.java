package main.java.complejos;

public class MathComplejo {
	
	//Suma de dos numeros Complejos
	public static Complejo suma(Complejo a, Complejo b) {
		double res = a.entera + b.entera;
		double ans = a.compleja + b.compleja;
		return new Complejo(res,ans);
	}
	
	//Resta de dos numeros Complejos
	public static Complejo resta(Complejo a, Complejo b) {
		double res = a.entera - b.entera;
		double ans = a.compleja - b.compleja;
		return new Complejo(res,ans);
	}
	
	//Producto de dos numeros Complejos
	public static Complejo producto(Complejo a, Complejo b) {
		double res = (((a.entera)*(b.entera)) - ((a.compleja)*(b.compleja))); 
		double ans = (((a.entera)*(b.compleja)) + ((a.compleja)*(b.entera)));
		return new Complejo(res,ans);
	}
		
	//Division de Numeros Complejos
	public static Complejo division(Complejo a, Complejo b) {
		double res, ans, div;
		div = ((b.entera*b.entera) + (b.compleja*b.compleja));
		if (div == 0.0){
			return null;
		}else {
			res = (((a.entera*b.entera) + (a.compleja*b.compleja))/(div));
			ans = (((a.compleja*b.entera) - (a.entera*b.compleja))/(div));
			
		}
		return new Complejo(res,ans);
	}
}
