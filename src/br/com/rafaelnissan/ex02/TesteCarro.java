package br.com.rafaelnissan.ex02;

public class TesteCarro {

	public static void main(String[] args) {
        
		int velocidadeMaximo;
		
		Carro c1 = new Carro("AZUL", "Corsa", 60, "2.0");
		Carro c2 = new Carro("VERDE", "Astra", 90, "1.0");

		c1.ligar();
        c2.ligar();
        
        for (int i = 0; (i <= c1.getVelocidadeMaxima() || i <= c2.getVelocidadeMaxima()); i++) {
			 
			c1.acelerar(i);
			c2.acelerar(i);
			
		}
						

		System.out.println("A velocidade maxima do carro "+ c1.getModelo() +" é: " + c1.getVelocidadeMaxima());
		System.out.println("A velocidade maxima do carro "+ c2.getModelo() +" é: "+ c2.getVelocidadeMaxima());
		c1.desligar();

		System.out.println("A velocidade do carro é: " + c1.getVelocidadeAtual());
	}

}
