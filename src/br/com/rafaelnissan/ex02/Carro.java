package br.com.rafaelnissan.ex02;

public class Carro {

	private String cor;
	private String modelo;

	private int velocidadeAtual = 0;
	private int velocidadeMaxima = 1;
	private String motor;
	private boolean carroLigado = false;
	private int marcha;

	public int getMarcha() {
		return marcha;
	}

	public Carro(String cor, String modelo, int velocidadeMaxima, String motor) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = motor;

	}

	public void ligar() {

		if (!this.carroLigado) {
			this.carroLigado = true;
			System.out.println("Carro ligado");
		}

	}

	public void desligar() {
		if (this.carroLigado) {
			this.carroLigado = false;
			this.setVelocidadeAtual(0);
			System.out.println("Carro desligado");

		}
	}

	public void acelerar(int valor) {
		if (this.carroLigado) {

			if (valor <= this.velocidadeMaxima) {
				this.velocidadeAtual = valor;

				if (trocaMarcha(valor)) {
					System.out.println("O " + this.modelo + " Trocou de marcha!! A marcha é: " + this.getMarcha());
				}
			}
		} else {
			System.out.println("Carro está desligado");
		}

	}

	public boolean trocaMarcha(int valor) {
		boolean trocou = false;
		if (valor > 0 && valor <= 20 && this.marcha != 1) {
			this.marcha = 1;
			trocou = true;
		} else if (valor > 20 && valor <= 40 && this.marcha != 2) {
			this.marcha = 2;
			trocou = true;
		} else if (valor > 40 && valor <= 60 && this.marcha != 3) {
			this.marcha = 3;
			trocou = true;
		} else if (valor > 60 && valor <= 80 && this.marcha != 4) {
			this.marcha = 4;
			trocou = true;
		} else if (valor > 80 && valor <= 100 && this.marcha != 5) {
			this.marcha = 5;
			trocou = true;
		}

		return trocou;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
