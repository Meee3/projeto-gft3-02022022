package FraseInvertida;


import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		
		String valorEntrada = in.nextLine();
		
		//Bora lá
		//Em uma frase existe a quantidade de caracteres

		Character[] resultadoOrdenado = new Character[valorEntrada.length()];
		
		//Preciso pegar e inserir cada posição dentro de um array.
		for(int i = 0; i < valorEntrada.length(); i++) {
			resultadoOrdenado[i] = valorEntrada.charAt(i);
		}
		
		
		//Criar outro array e pegar os valores inversos
		Character[] resultadoInvertido = new Character[valorEntrada.length()];
		
		for(int i = valorEntrada.length()-1; i >= 0; i-- ) {
			resultadoInvertido[i] = valorEntrada.charAt(i);
			
		}


		//Validar a quantidade de Caracteres com o Contador
		int count = 0;
		for(int i = 0; i< valorEntrada.length(); i++) {
			
			if(resultadoOrdenado[i] == resultadoInvertido[i]) {
				//validar a quantidade de caracteres
				count++;
			}
		}
			
		if(count > 0 && count == valorEntrada.length()) {
			System.out.println("true");
		}else if(valorEntrada.equals(' ') || count != valorEntrada.length()) {
			System.out.println("false");
		}
		
		
}}

