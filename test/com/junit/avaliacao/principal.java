package com.junit.avaliacao;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junit.avaliacao.Alunos;




public class principal {
	
	
	

	@Before // executa a cada teste
	public void setUp() throws Exception{
		
	}

	@After // executa a cada teste
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void aprovado(){
		Alunos a = new Alunos(3.0,4.0,5.0,9.0);
		Calculadora c = new Calculadora();
			
		double result = c.media(a);
		System.out.println(result);
		assertEquals(6.0,result,.0);	
		
	}
	

	
	}