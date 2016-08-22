package br.com.rafaelnissan;

public class Conta {
   private int number;
   private double saldo;
   private double limite;
   private int agencia;
   Cliente cliente;
 
   
   public Conta(int number,Cliente cliente, double saldo, double limite, int agencia) {
	super();
	this.number = number;
	this.saldo = saldo;
	this.limite = limite;
	this.agencia = agencia;
	this.cliente = cliente;
   } 
   
   public boolean sacar(double valor) {
   	boolean sacou = false;
   	 if (valor + this.limite > this.saldo){
   		sacou = false; 
   	 }else{
   		 sacou = true;
   	 }
   		 
   	return sacou;
   	
   }  
   
   public void depositar(double valor) {
	 
	   this.saldo += valor;
	 
}
   
   
   public void imprimiExtrato(){
	   System.out.println("ญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญญ");
	   System.out.println("BANCO CAZALBษ");
	   System.out.println("ญญญญญญญ-------------------------------------");
	   System.out.println("AGสNCIA: "+ this.agencia);
	   System.out.println("CONTA: "+ this.number);
	   System.out.println("TITULAR: "+cliente.getNome());
	   System.out.println("CPF: "+cliente.getCpf());
	   System.out.println("ญญญญญญญ-------------------------------------");
	   System.out.println("Saldo da Conta: "+this.saldo);
	   System.out.println("ญญญญญญญ-------------------------------------");
	   
	   
	   
   }
   
   
   
   
	
}
