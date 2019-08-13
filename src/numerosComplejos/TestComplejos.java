package numerosComplejos;

import static org.junit.Assert.assertEquals;

//import org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestComplejos {
	
	@Test
	public void Test() {
	}
	
	@Test
	public void Suma() {
		
		Complejo a = new Complejo(4,5);
		Complejo b = new Complejo(1,2);
		Complejo c = MathComplejo.suma(a,b);
		assertEquals(5,c.getEntera(),2.0);
		assertEquals(7,c.getCompleja(),2.0);
	}
	
	@Test
	public void Resta() {
		
		Complejo a = new Complejo(4,5);
		Complejo b = new Complejo(1,2);
		Complejo c = MathComplejo.resta(a,b);
		assertEquals(3,c.getEntera(),2.0);
		assertEquals(3,c.getCompleja(),2.0);
	}
	
	@Test
	public void Producto() {
		
		Complejo a = new Complejo(2,-5);
		Complejo b = new Complejo(3,4);
		Complejo c = MathComplejo.producto(a,b);
		assertEquals(26,c.getEntera(),2.0);
		assertEquals(-7,c.getCompleja(),2.0);
	}
	
	@Test
	public void Productoii() {
		
		Complejo a = new Complejo(0,1);
		Complejo b = new Complejo(0,1);
		Complejo c = MathComplejo.producto(a,b);
		assertEquals(-1,c.getEntera(),2.0);
		assertEquals(0,c.getCompleja(),2.0);
	}
	
	@Test
	public void Division() {
		
		Complejo a = new Complejo(3,2);
		Complejo b = new Complejo(-1,2);
		Complejo c = MathComplejo.division(a,b);
		assertEquals(0.2,c.getEntera(),2.0);
		assertEquals(-1.6,c.getCompleja(),2.0);
	}
	
	@Test
	public void Modulo() {
		
		Complejo a = new Complejo(4,-3);
		double b = a.modulo(a);
		assertEquals(5,b,2.0);
		
	}
	
	@Test
	public void Conjugado() {
		Complejo a = new Complejo(4,-3);
		Complejo b = a.conjugado(a);
		assertEquals(4,b.entera,2.0);
		assertEquals(3,b.compleja,2.0);
	}
	
	@Test
	public void Fase() {
		Complejo a = new Complejo(4,4*Math.sqrt(3));
		double b = a.fase(a);
		assertEquals(60,b,2.0);
	}
	
	@Test
	public void Fase2() {
		Complejo a = new Complejo(4,-3);
		double b = a.fase(a);
		assertEquals(-36.87,b,2.0);
	}
}
