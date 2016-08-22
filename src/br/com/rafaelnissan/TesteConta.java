package br.com.rafaelnissan;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Rafael Nissan", "111.111.111-11", "Rua fidencio ramos");
		Cliente cliente2 = new Cliente("Fulano da esquina", "222.111.333-11", "Rua fidencio ramos");
		
		Conta bradsesco = new Conta(1, cliente, 1000, 2000, 999); 
		Conta Itau = new Conta(1, cliente2, 500, 1000, 888); 
	
	    bradsesco.imprimiExtrato();
	    
	}

}
