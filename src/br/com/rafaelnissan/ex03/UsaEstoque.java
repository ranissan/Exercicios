package br.com.rafaelnissan.ex03;

public class UsaEstoque {

	public static void main(String[] args) {
	  System.out.println(" testetetjhbsajdsjv");
		
      Estoque e1 = new Estoque("Caderno",1,10);
      
      e1.mudarNome("Caderno1");      
      System.out.println("teste");
      String msg;
      msg = e1.mostra();
      System.out.println(msg);
      
	}

}
