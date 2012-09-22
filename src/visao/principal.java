package visao;

import modelo.Clientes;

import org.junit.Test;

import controle.ClienteDao;

public class principal {


     ClienteDao c ;
     Clientes cl;
     
     public  principal() throws Exception{
          start();
     }
     
     @Test    
     public void start(){
     	 c = new ClienteDao();
     	 cl = new Clientes();
     	 cl.setN1(8.00);
     	 cl.setN2(8.00);
     	 cl.setN3(8.00);
     	 cl.setN4(8.00);
     	 
     	 
    	 c.mediamaior80(cl);
    	 
    	 cl.setN1(6.00);
     	 cl.setN2(6.00);
     	 cl.setN3(6.00);
     	 cl.setN4(6.00);
     	 
    	 
    	 c.namedia(cl);
    	  
     }

	
	}