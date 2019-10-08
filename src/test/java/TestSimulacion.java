package test.java;

import main.java.complejos.*;
import main.java.matriz.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestSimulacion {
	
	@Test
	public void ejercicio311() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		MatrizComplejo m1 = new MatrizComplejo(6,6);
		m1.addMatriz(new Complejo(0,0), 0, 0);
		m1.addMatriz(new Complejo(0,0), 1, 0);
		m1.addMatriz(new Complejo(0,0), 2, 0);
		m1.addMatriz(new Complejo(0,0), 3, 0);
		m1.addMatriz(new Complejo(0,0), 4, 0);
		m1.addMatriz(new Complejo(1,0), 5, 0);
		
		m1.addMatriz(new Complejo(0,0), 0, 1);
		m1.addMatriz(new Complejo(0,0), 1, 1);
		m1.addMatriz(new Complejo(1,0), 2, 1);
		m1.addMatriz(new Complejo(0,0), 3, 1);
		m1.addMatriz(new Complejo(0,0), 4, 1);
		m1.addMatriz(new Complejo(0,0), 5, 1);
		
		m1.addMatriz(new Complejo(0,0), 0, 2);
		m1.addMatriz(new Complejo(0,0), 1, 2);
		m1.addMatriz(new Complejo(0,0), 2, 2);
		m1.addMatriz(new Complejo(0,0), 3, 2);
		m1.addMatriz(new Complejo(1,0), 4, 2);
		m1.addMatriz(new Complejo(0,0), 5, 2);
		
		m1.addMatriz(new Complejo(0,0), 0, 3);
		m1.addMatriz(new Complejo(0,0), 1, 3);
		m1.addMatriz(new Complejo(0,0), 2, 3);
		m1.addMatriz(new Complejo(1,0), 3, 3);
		m1.addMatriz(new Complejo(0,0), 4, 3);
		m1.addMatriz(new Complejo(0,0), 5, 3);
		
		m1.addMatriz(new Complejo(0,0), 0, 4);
		m1.addMatriz(new Complejo(0,0), 1, 4);
		m1.addMatriz(new Complejo(0,0), 2, 4);
		m1.addMatriz(new Complejo(0,0), 3, 4);
		m1.addMatriz(new Complejo(0,0), 4, 4);
		m1.addMatriz(new Complejo(1,0), 5, 4);
		
		m1.addMatriz(new Complejo(0,0), 0, 5);
		m1.addMatriz(new Complejo(0,0), 1, 5);
		m1.addMatriz(new Complejo(1,0), 2, 5);
		m1.addMatriz(new Complejo(0,0), 3, 5);
		m1.addMatriz(new Complejo(0,0), 4, 5);
		m1.addMatriz(new Complejo(0,0), 5, 5);
		
		MatrizComplejo m2 = new MatrizComplejo(6,1);
		m2.addMatriz(new Complejo(6,0),0,0);
		m2.addMatriz(new Complejo(2,0),1,0);
		m2.addMatriz(new Complejo(1,0),2,0);
		m2.addMatriz(new Complejo(5,0),3,0);
		m2.addMatriz(new Complejo(3,0),4,0);
		m2.addMatriz(new Complejo(10,0),5,0);
		
		MatrizComplejo mresp = new MatrizComplejo(6,1);
		mresp.addMatriz(new Complejo(0,0),0 ,0 );
		mresp.addMatriz(new Complejo(0,0),1 ,0 );
		mresp.addMatriz(new Complejo(12,0),2 ,0 );
		mresp.addMatriz(new Complejo(5,0),3 ,0 );
		mresp.addMatriz(new Complejo(1,0),4 ,0 );
		mresp.addMatriz(new Complejo(9,0),5 ,0 );
		
		assertEquals(mresp,s.ejercicio311(m1, m2, 1));
		
		MatrizComplejo mresp2 = new MatrizComplejo(6,1);
		mresp2.addMatriz(new Complejo(0,0),0 ,0 );
		mresp2.addMatriz(new Complejo(0,0),1 ,0 );
		mresp2.addMatriz(new Complejo(9,0),2 ,0 );
		mresp2.addMatriz(new Complejo(5,0),3 ,0 );
		mresp2.addMatriz(new Complejo(12,0),4 ,0 );
		mresp2.addMatriz(new Complejo(1,0),5 ,0 );
		
		assertEquals(mresp2,s.ejercicio311(m1, m2, 2));
		
		MatrizComplejo mresp3 = new MatrizComplejo(6,1);
		mresp3.addMatriz(new Complejo(0,0),0 ,0 );
		mresp3.addMatriz(new Complejo(0,0),1 ,0 );
		mresp3.addMatriz(new Complejo(1,0),2 ,0 );
		mresp3.addMatriz(new Complejo(5,0),3 ,0 );
		mresp3.addMatriz(new Complejo(9,0),4 ,0 );
		mresp3.addMatriz(new Complejo(12,0),5 ,0 );
		
		assertEquals(mresp3,s.ejercicio311(m1, m2, 3));
		
	}
	
	@Test
	public void ejercicio321() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		MatrizComplejo m1 = new MatrizComplejo(4,4);
		
		m1.addMatriz(new Complejo(0,0), 0, 0);
		m1.addMatriz(new Complejo(0.5,0), 1, 0);
		m1.addMatriz(new Complejo(0.5,0), 2, 0);
		m1.addMatriz(new Complejo(0,0), 3, 0);
		
		m1.addMatriz(new Complejo(0.5,0), 0, 1);
		m1.addMatriz(new Complejo(0,0), 1, 1);
		m1.addMatriz(new Complejo(0,0), 2, 1);
		m1.addMatriz(new Complejo(0.5,0), 3, 1);
		
		
		m1.addMatriz(new Complejo(0.5,0), 0, 2);
		m1.addMatriz(new Complejo(0,0), 1, 2);
		m1.addMatriz(new Complejo(0,0), 2, 2);
		m1.addMatriz(new Complejo(0.5,0), 3, 2);
		
		
		m1.addMatriz(new Complejo(0,0), 0, 3);
		m1.addMatriz(new Complejo(0.5,0), 1, 3);
		m1.addMatriz(new Complejo(0.5,0), 2, 3);
		m1.addMatriz(new Complejo(0,0), 3, 3);
		
		MatrizComplejo m2 = new MatrizComplejo(4,1);
		m2.addMatriz(new Complejo(1,0),0,0);
		m2.addMatriz(new Complejo(0,0),1,0);
		m2.addMatriz(new Complejo(0,0),2,0);
		m2.addMatriz(new Complejo(0,0),3,0);

		MatrizComplejo mresp = new MatrizComplejo(4,1);
		mresp.addMatriz(new Complejo(0,0),0 ,0 );
		mresp.addMatriz(new Complejo(0.5,0),1 ,0 );
		mresp.addMatriz(new Complejo(0.5,0),2 ,0 );
		mresp.addMatriz(new Complejo(0,0),3 ,0 );
	
		assertEquals(mresp,s.ejercicio311(m1, m2, 1));
		
		MatrizComplejo mresp2 = new MatrizComplejo(4,1);
		mresp2.addMatriz(new Complejo(0.5,0),0 ,0 );
		mresp2.addMatriz(new Complejo(0,0),1 ,0 );
		mresp2.addMatriz(new Complejo(0,0),2 ,0 );
		mresp2.addMatriz(new Complejo(0.5,0),3 ,0 );
		
		assertEquals(mresp2,s.ejercicio311(m1, m2, 2));
	
	}
	
	@Test
	public void ejercicio322() {
		int r=2;
		int b=5;
		
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		//MatrizComplejo probabilidad = s.ejercicio321(r, b);
		MatrizComplejo m1 = new MatrizComplejo(8,1);
		m1.addMatriz(new Complejo(1,0), 0, 0);
		m1.addMatriz(new Complejo(0,0), 1, 0);
		m1.addMatriz(new Complejo(0,0), 2, 0);
		m1.addMatriz(new Complejo(0,0), 3, 0);
		m1.addMatriz(new Complejo(0,0), 4, 0);
		m1.addMatriz(new Complejo(0,0), 5, 0);
		m1.addMatriz(new Complejo(0,0), 6, 0);
		m1.addMatriz(new Complejo(0,0), 7, 0);
	
	}
	
	@Test
	public void probabilidadParticulaPorPosicion() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		MatrizComplejo m = new MatrizComplejo(4,1);
		m.addMatriz(new Complejo(-3,-1), 0, 0);
		m.addMatriz(new Complejo(0,-2), 1, 0);
		m.addMatriz(new Complejo(0,1), 2, 0);
		m.addMatriz(new Complejo(2,0), 3, 0);
		
		MatrizComplejo m1 = new MatrizComplejo(4,1);
		m1.addMatriz(new Complejo(0.5263157894736842,0), 0, 0);
		m1.addMatriz(new Complejo(0.21052631578947364,0), 1, 0);
		m1.addMatriz(new Complejo(0.05263157894736841,0), 2, 0);
		m1.addMatriz(new Complejo(0.21052631578947364,0), 3, 0);
		
		int p = 2;
		assertEquals(m1.getMatriz()[p][0].getEntera(),s.particulaPorPosicion(p, m),1);
		
	}
	
	@Test 
	public void probabilidadTransitarKetAKet() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		MatrizComplejo m = new MatrizComplejo(2,1);
		m.addMatriz(new Complejo(Math.sqrt(2)/2,0),0 ,0);
		m.addMatriz(new Complejo(0,Math.sqrt(2)/2),1 ,0);
		
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addMatriz(new Complejo(0,Math.sqrt(2)/2),0 ,0);
		m1.addMatriz(new Complejo(-Math.sqrt(2)/2,0),1 ,0);
		
		Complejo resp = new Complejo(0,-1);
		resp.equals(s.probabilidadKet(m, m1));
	}
	
	@Test
	public void calculandoValorMedio() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		
		MatrizComplejo m = new MatrizComplejo(2,1);
		m.addMatriz(new Complejo(Math.sqrt(2)/2,0),0 ,0);
		m.addMatriz(new Complejo(0,Math.sqrt(2)/2),1 ,0);
		
		MatrizComplejo m1 = new MatrizComplejo(2,2);
		m1.addMatriz(new Complejo(1,0),0 ,0);
		m1.addMatriz(new Complejo(0,1),1 ,0);
		m1.addMatriz(new Complejo(0,-1),0 ,1);
		m1.addMatriz(new Complejo(2,0),1 ,1);
		
		Complejo resp = new Complejo(2.5000000000000004, 0);
		System.out.println(resp.getEntera());
		System.out.println(s.valorMedio(m1, m));
		assertEquals(resp, s.valorMedio(m1, m));
	}
	
	@Test
	public void calculandoVarianza() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		
		MatrizComplejo m = new MatrizComplejo(2,1);
		m.addMatriz(new Complejo(Math.sqrt(2)/2,0),0 ,0);
		m.addMatriz(new Complejo(0,Math.sqrt(2)/2),1 ,0);

		MatrizComplejo m1 = new MatrizComplejo(2,2);
		m1.addMatriz(new Complejo(1,0),0 ,0);
		m1.addMatriz(new Complejo(0,1),1 ,0);
		m1.addMatriz(new Complejo(0,-1),0 ,1);
		m1.addMatriz(new Complejo(2,0),1 ,1);

		Complejo resp = new Complejo(0.25,0);
		assertEquals(resp,s.varianza(m1, m));
	
		
	}	
	
	@Test
	public void calculaDinamicaSistema() {
		SimulacionClasicoACuantico s = new SimulacionClasicoACuantico();
		MathMatrizComplejo m = new MathMatrizComplejo();
		
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addMatriz(new Complejo(1,0),0,0);
		m1.addMatriz(new Complejo(0,0),1,0);
		
		MatrizComplejo m2 = new MatrizComplejo(2,2);
		m2.addMatriz(new Complejo(0,0),0,0);
		m2.addMatriz(new Complejo(1,0),1,0);
		m2.addMatriz(new Complejo(1,0),0,1);
		m2.addMatriz(new Complejo(0,0),1,1);
		
		MatrizComplejo m3 = new MatrizComplejo(2,2);
		m3.addMatriz(new Complejo(0,0),0,0);
		m3.addMatriz(new Complejo(1,0),1,0);
		m3.addMatriz(new Complejo(1,0),0,1);
		m3.addMatriz(new Complejo(0,0),1,1);
		
		ArrayList<MatrizComplejo>  resp = new ArrayList<MatrizComplejo>();
		resp.add(m2);
		resp.add(m3);

		MatrizComplejo m4 = MathMatrizComplejo.productoMatrices(m2, m1);
		MatrizComplejo m5 = MathMatrizComplejo.productoMatrices(m3, m4);
		assertEquals(m5, s.dinamica(2, m1, resp));
		
		
		
		
	}
	
}
