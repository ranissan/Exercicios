package br.com.rafaelnissan.ex03;

public class Estoque {

	private String nome;
	private int quantidadeMinima;
	private int quantidadeAtual;

	public Estoque(String nome, int quantidadeMinima, int quantidadeAtual) {
		super();
		this.nome = nome;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeAtual = quantidadeAtual;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public void mudarQtdMinima(int valor) {
		this.quantidadeMinima = valor;

	}

	public void repor(int qtd) {
		this.quantidadeAtual += qtd;
	}

	public void darBaixa(int qtd) {

		if ((this.quantidadeAtual - qtd) >= this.quantidadeMinima) {
			this.quantidadeAtual -= qtd;
		} else {
			System.out.println("Voce nao tem esta quantidade no estoque para dar baixa");
		}

	}

	public String mostra() {
		String retorno;
		
		System.out.println("O estoque "+this.nome + " contem "+this.quantidadeAtual +" e seu estoque minimo é "+this.quantidadeMinima);
		retorno = "O estoque "+this.nome + " contem "+this.quantidadeAtual +" e seu estoque minimo é "+this.quantidadeMinima;
		
		return retorno;
	}

}
