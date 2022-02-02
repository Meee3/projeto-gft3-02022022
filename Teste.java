import java.util.Scanner;

import entities.Circulo;
import entities.Quadrado;
import entities.Retangulo;

public class Teste {

	public static void main(String[] args) {

		
		System.out.println("Adiantei e coloquei valores pré-definidos, visando a questão do tempo da prova");
		Quadrado quadrado = new Quadrado(50, 5);
		
		System.out.println("O valor da Area do Quadrado é:");
		
		System.out.println(quadrado.areaQuadrado(50, 5));
		
		
		System.out.println("Retangulo, Valores[100,5]");
		
		Retangulo retangulo = new Retangulo();
		System.out.println(retangulo.areaRetangulo(100, 5));
		
		
		System.out.println("Você define o valor");
		Scanner scan = new Scanner(System.in);
		
		double valueIn = scan.nextDouble();
		
		System.out.println(valueIn);
	
		
		
		Circulo circulo = new Circulo();
		
		
		
		System.out.println(circulo.areaCirculo(valueIn));
		
		//Falta refatorar e validar
		// pode colocar char ou string que vai quebrar o programa @.@'''
		
		
		
	}

}
