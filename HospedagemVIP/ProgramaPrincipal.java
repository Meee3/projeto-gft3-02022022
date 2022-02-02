package HospedagemVIP;

import HospedagemVIP.model.Hospedagem;
import HospedagemVIP.model.HospedagemVIP;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		System.out.println("Bem vindo a Hospedagem Objeto");
		
		Hospedagem hospedagem = new Hospedagem();
		System.out.print("O valor da hospedagem é: ");
		hospedagem.setValueReal(120);
		
		System.out.println( hospedagem.printValor());
	
		HospedagemVIP hospedagemvip = new HospedagemVIP();
		
		System.out.print("Já a VIP é: ");		
		hospedagemvip.setValorAdicional(80);
		
		System.out.println(hospedagemvip.valorTotal() + hospedagem.getValueReal() );
		
		//System.out.println(hospedagemvip.valorTotal());
		//// falta debugar, dale pressão!!!
		
	}

}
