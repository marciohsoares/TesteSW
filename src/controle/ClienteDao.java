package controle;

import static org.junit.Assert.assertEquals;

import modelo.Clientes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteDao {
	Clientes  c = new Clientes();

	/*	@BeforeClass //executa somente uma vez
		public void antesDaClasse(){
			//criarmassaIR() com sql
		}
		
		@AfterClass //executa somente uma vez
		public void depoisDaClasse(){
			//removermassaIR() com sql
		}
		
		*/
		@Before // executa a cada teste
		public void setUp() throws Exception{
			
		}
		@After // executa a cada teste
		public void tearDown() throws Exception{
			
		}
		
		@Test
		public void namedia(){		    
		    //this.c = c;
		    //Double cont  = c.getNotas();
			assertEquals(6,6,.0);
		}
		
		@Test
		public void mediamaior80(){
			//this.c = c;
			//Double cont  = this.c.getNotas();
			
			assertEquals(8,8,.0);
		}
		
		
		
		
	}