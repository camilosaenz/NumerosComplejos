package test.java;

import main.java.complejos.*;
import main.java.matriz.*;
import static org.junit.Assert.*;
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
		
		//System.out.println("Boolean Matrix");
		//System.out.println(m1);
		
		
		MatrizComplejo m2 = new MatrizComplejo(6,1);
		m2.addMatriz(new Complejo(6,0),0,0);
		m2.addMatriz(new Complejo(2,0),1,0);
		m2.addMatriz(new Complejo(1,0),2,0);
		m2.addMatriz(new Complejo(5,0),3,0);
		m2.addMatriz(new Complejo(3,0),4,0);
		m2.addMatriz(new Complejo(10,0),5,0);
		
		//System.out.println("Canicas");
		//System.out.println(m2);
		
		
		//System.out.println("Resultado 1 Click: ");
		MatrizComplejo mresp = new MatrizComplejo(6,1);
		mresp.addMatriz(new Complejo(0,0),0 ,0 );
		mresp.addMatriz(new Complejo(0,0),1 ,0 );
		mresp.addMatriz(new Complejo(12,0),2 ,0 );
		mresp.addMatriz(new Complejo(5,0),3 ,0 );
		mresp.addMatriz(new Complejo(1,0),4 ,0 );
		mresp.addMatriz(new Complejo(9,0),5 ,0 );
		
		//System.out.println("Resultado Esperado ");
		//System.out.println(mresp);
		//System.out.println("Resultado Obtenido");
		//System.out.println(s.ejercicio311(m1, m2, 1));
		assertEquals(mresp,s.ejercicio311(m1, m2, 1));
		
		
		
		//System.out.println("Resultado 2 Clicks: ");
		MatrizComplejo mresp2 = new MatrizComplejo(6,1);
		mresp2.addMatriz(new Complejo(0,0),0 ,0 );
		mresp2.addMatriz(new Complejo(0,0),1 ,0 );
		mresp2.addMatriz(new Complejo(9,0),2 ,0 );
		mresp2.addMatriz(new Complejo(5,0),3 ,0 );
		mresp2.addMatriz(new Complejo(12,0),4 ,0 );
		mresp2.addMatriz(new Complejo(1,0),5 ,0 );
		
		
		//System.out.println("Resultado Esperado ");
		//System.out.println(mresp2);
		//System.out.println("Resultado Obtenido");
		//System.out.println(s.ejercicio311(m1, m2, 2));
		assertEquals(mresp2,s.ejercicio311(m1, m2, 2));
		
		
		
		
		//System.out.println("Resultado 2 Clicks: ");
		MatrizComplejo mresp3 = new MatrizComplejo(6,1);
		mresp3.addMatriz(new Complejo(0,0),0 ,0 );
		mresp3.addMatriz(new Complejo(0,0),1 ,0 );
		mresp3.addMatriz(new Complejo(1,0),2 ,0 );
		mresp3.addMatriz(new Complejo(5,0),3 ,0 );
		mresp3.addMatriz(new Complejo(9,0),4 ,0 );
		mresp3.addMatriz(new Complejo(12,0),5 ,0 );
		
		
		//System.out.println("Resultado Esperado ");
		//System.out.println(mresp3);
		//System.out.println("Resultado Obtenido");
		//System.out.println(s.ejercicio311(m1, m2, 3));
		assertEquals(mresp3,s.ejercicio311(m1, m2, 3));
		
	}
	
	@Test
	//Fracciones
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
		
		
		//System.out.println("Boolean Matrix");
		//System.out.println(m1);
		
		MatrizComplejo m2 = new MatrizComplejo(4,1);
		m2.addMatriz(new Complejo(1,0),0,0);
		m2.addMatriz(new Complejo(0,0),1,0);
		m2.addMatriz(new Complejo(0,0),2,0);
		m2.addMatriz(new Complejo(0,0),3,0);
	
		//System.out.println("Canicas");
		//System.out.println(m2);
		
		//System.out.println("Resultado 1 Click: ");
		MatrizComplejo mresp = new MatrizComplejo(4,1);
		mresp.addMatriz(new Complejo(0,0),0 ,0 );
		mresp.addMatriz(new Complejo(0.5,0),1 ,0 );
		mresp.addMatriz(new Complejo(0.5,0),2 ,0 );
		mresp.addMatriz(new Complejo(0,0),3 ,0 );
	
		
		//System.out.println("Resultado Esperado ");
		//System.out.println(mresp);
		//System.out.println("Resultado Obtenido");
		//System.out.println(s.ejercicio311(m1, m2, 1));
		assertEquals(mresp,s.ejercicio311(m1, m2, 1));
		
		
		
		//System.out.println("Resultado 2 Clicks: ");
		MatrizComplejo mresp2 = new MatrizComplejo(4,1);
		mresp2.addMatriz(new Complejo(0.5,0),0 ,0 );
		mresp2.addMatriz(new Complejo(0,0),1 ,0 );
		mresp2.addMatriz(new Complejo(0,0),2 ,0 );
		mresp2.addMatriz(new Complejo(0.5,0),3 ,0 );
		
		
		//System.out.println("Resultado Esperado ");
		//System.out.println(mresp2);
		//System.out.println("Resultado Obtenido");
		//System.out.println(s.ejercicio311(m1, m2, 2));
		assertEquals(mresp2,s.ejercicio311(m1, m2, 2));
	
	}
}
