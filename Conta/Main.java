package Conta;

public class Main {

	public static void main(String[] args) {
		ContaEspecial ce = new ContaEspecial();
		ContaSimples  cs = new ContaSimples();
		
		ce.setSaldo(100);
		ce.deposito(50);
		ce.saqueespecial(250);
		
		
		System.out.println(ce);

	}

}
