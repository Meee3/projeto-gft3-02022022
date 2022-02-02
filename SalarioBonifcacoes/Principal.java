package SalarioBonifcacoes;

import SalarioBonifcacoes.model.Funcionario;
import SalarioBonifcacoes.model.Gerente;
import SalarioBonifcacoes.model.Supervisor;
import SalarioBonifcacoes.model.Vendedor;

public class Principal {

	public static void main(String[] args) {

		/*
		  Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de nome
		 
		Funcionário
		
		 com os seguintes atributos (nome, idade e salário) e mais três classes Filhas
		(Gerente, Supervisor e Vendedor). 
		Na classe Funcionário deve existir um método de nome
		bonificação que retorna o salário, nas classes filhas deve existir o mesmo método
		bonificação porem com as seguintes regras


		• Para Gerente, o método bonificação deve retornar o salário + 10000.00.
		
		• Para Supervisor, o método bonificação deve retornar o salário + 5000.00.
		
		• Para Vendedor, o método bonificação deve retornar o salário + 3000.00.
		
		Por fim, criar uma classe principal que instancie objetos de Gerente, Supervisor e Vendedor
		e adicione no mínimo um valor para cada atributo e imprima cada funcionário (Gerente,
		Supervisor e Vendedor) com suas devidas bonificações.
		
		/*
		 * 
		 * 
		 * 
		 */
		
		System.out.println("Pelo tempo escasso farei o XPTO ser um Funcionario e mostraremos o valor do salario nos diferentes níveis");
		
		Funcionario func = new Funcionario();
		func.setNome("XPTO");
		func.setIdade(31);
		func.setSalario(1000);
		
		System.out.print(" Nome: ");
		System.out.println(func.getNome());
	
		
		System.out.print("Idade: ");
		System.out.println(func.getIdade());
					
		
		System.out.print("Salário: ");
		System.out.println(func.getSalario());
		
		
		Gerente gerente = new Gerente();
		System.out.println("Salário do Gerente XPTO");
		System.out.println(gerente.bonificacao());
		
		Supervisor supervisor = new Supervisor();
		System.out.println("Salário do Supervisor XPTO");
		System.out.println(supervisor.bonificacao());
		
		Vendedor vendedor = new Vendedor();
		System.out.println("Salário do Vendedor XPTO");
		System.out.println(vendedor.bonificacao());
		
		// cometi o mesmo erro do anterior, Sorry team.
		
		
	}

}
