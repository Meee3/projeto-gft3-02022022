package HospedagemVIP.model;

public class Hospedagem {

	/**
	 * Faça um programa onde tenha uma classe chamada Hospedagem, que possui um valor em
reais e um método printValor().

 Crie uma classe HospedagemVIP, que herda de
Hospedagem e possui um valor adicional. 

Crie um método que retorne
 o valor do HospedagemVIP (com o adicional incluído).
 
  Crie um programa para criar as instâncias de
Hospedagem e HospedagemVIP, mostrando a diferença de preços
	 */
	
	public Hospedagem (){}
	
	protected double valueReal;
	
	
	
	public double getValueReal() {
		return valueReal;
	}



	public void setValueReal(double valueReal) {
		this.valueReal = valueReal;
	}



	public double printValor() {
		return getValueReal();
	}
	
}
