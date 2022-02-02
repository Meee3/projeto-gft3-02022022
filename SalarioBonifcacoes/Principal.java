package SalarioBonifcacoes;

import SalarioBonifcacoes.model.Funcionario;
import SalarioBonifcacoes.model.Gerente;
import SalarioBonifcacoes.model.Supervisor;
import SalarioBonifcacoes.model.Vendedor;

public class Principal {

	public static void main(String[] args) {

		/*
		  Considerando os conceitos de Orienta��o a Objetos, crie uma classe Pai de nome
		 
		Funcion�rio
		
		 com os seguintes atributos (nome, idade e sal�rio) e mais tr�s classes Filhas
		(Gerente, Supervisor e Vendedor). 
		Na classe Funcion�rio deve existir um m�todo de nome
		bonifica��o que retorna o sal�rio, nas classes filhas deve existir o mesmo m�todo
		bonifica��o porem com as seguintes regras


		� Para Gerente, o m�todo bonifica��o deve retornar o sal�rio + 10000.00.
		
		� Para Supervisor, o m�todo bonifica��o deve retornar o sal�rio + 5000.00.
		
		� Para Vendedor, o m�todo bonifica��o deve retornar o sal�rio + 3000.00.
		
		Por fim, criar uma classe principal que instancie objetos de Gerente, Supervisor e Vendedor
		e adicione no m�nimo um valor para cada atributo e imprima cada funcion�rio (Gerente,
		Supervisor e Vendedor) com suas devidas bonifica��es.
		
		/*
		 * 
		 * 
		 * 
		 */
		
		System.out.println("Pelo tempo escasso farei o XPTO ser um Funcionario e mostraremos o valor do salario nos diferentes n�veis");
		
		Funcionario func = new Funcionario();
		func.setNome("XPTO");
		func.setIdade(31);
		func.setSalario(1000);
		
		System.out.print(" Nome: ");
		System.out.println(func.getNome());
	
		
		System.out.print("Idade: ");
		System.out.println(func.getIdade());
					
		
		System.out.print("Sal�rio: ");
		System.out.println(func.getSalario());
		
		
		Gerente gerente = new Gerente();
		System.out.println("Sal�rio do Gerente XPTO");
		System.out.println(gerente.bonificacao());
		
		Supervisor supervisor = new Supervisor();
		System.out.println("Sal�rio do Supervisor XPTO");
		System.out.println(supervisor.bonificacao());
		
		Vendedor vendedor = new Vendedor();
		System.out.println("Sal�rio do Vendedor XPTO");
		System.out.println(vendedor.bonificacao());
		
		// cometi o mesmo erro do anterior, Sorry team.
		
		
	}

}
