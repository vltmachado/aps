package br.ufpb.dcx.aps.factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FaturaSimplesTest {

	@Test
	void test() {
		
		FaturaSimples faturaSimples1 = new FaturaSimples();
		
		Produto arroz = new Produto("Arroz", 0.50);
		Produto batata = new Produto("Batata", 0.75);
		Produto sal = new Produto("Sal", 2.00);
		
		faturaSimples1.addItem(arroz, 2);
		faturaSimples1.addItem(batata, 3);
		faturaSimples1.addItem(sal, 1);
		
		String esperado = 
				"1. Arroz 0.50 x 2 : 1.00\n" +
				"2. Batata 0.75 x 3 : 2.25\n" +
				"3. Sal 2.00 x 1 : 2.00\n" +
				"Total : 5.25";
		
		assertEquals(esperado, faturaSimples1.toString());
	}

}
