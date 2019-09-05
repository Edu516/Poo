package Conta;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if(valor > 0) {
			saldoPoupanca = saldoPoupanca + valor;
			return true;
		}else
			return false;
	}
	public boolean saquePoupanca(double valor) {
		if(saldoPoupanca >= valor) {
			saldoPoupanca = saldoPoupanca - valor;
			return true;
		}else {
			return false;
		}
	}
}
