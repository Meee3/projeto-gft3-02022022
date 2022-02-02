package HospedagemVIP.model;

public class HospedagemVIP extends Hospedagem {

	private double valorAdicional;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	
	public double valorTotal() {
		return valorAdicional + getValueReal();
	}
	
}
