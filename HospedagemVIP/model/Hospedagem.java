package HospedagemVIP.model;

public class Hospedagem {

	/**
	 * Fa�a um programa onde tenha uma classe chamada Hospedagem, que possui um valor em
reais e um m�todo printValor().

 Crie uma classe HospedagemVIP, que herda de
Hospedagem e possui um valor adicional. 

Crie um m�todo que retorne
 o valor do HospedagemVIP (com o adicional inclu�do).
 
  Crie um programa para criar as inst�ncias de
Hospedagem e HospedagemVIP, mostrando a diferen�a de pre�os
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
