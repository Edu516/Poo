package Conta;

public class ContaEspecial extends Conta {
	private int diaSemJuro;
	private double limite = 100;
	
	public int getDiaSemJuro() {
		return diaSemJuro;
	}
	public void setDiaSemJuro(int diaSemJuro) {
		this.diaSemJuro = diaSemJuro;
	}
	
	public boolean saqueespecial(double valor) {
		if((valor <= getSaldo()) ||(valor <= getSaldo()+limite)) {
			setSaldo(getSaldo()-valor);
			return true;
	}else {
		return false;
	}
	
	}

	public String mostrarsaldo() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		return builder.toString();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diaSemJuro=");
		builder.append(diaSemJuro);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
