package Modificadores;

import java.util.Scanner;

public class ObjetoPessoaAutomovel {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//cria o objeto pessoa
		Pessoa pessoa = new Pessoa();
		
		String cor, nome;
		int velocidade;
		
		System.out.println("Informe a cor do carro");
		cor = ler.next();
		
		System.out.println("Informe nome do carro");
		nome = ler.next();
		
		System.out.println("Informe a velocidade do carro");
		velocidade = ler.nextInt();
		
		//utiliza o método compracarro
		pessoa.compracarro(cor, nome, velocidade);
		
		//utilizando para mostrar o retorno do carro comprado
		Automovel carro = pessoa.getAutomovel();
		
		System.out.println("O carro comprado foi " + carro.getNome()+ "da cor "+ carro.getCor() + "que antinge a velocidade de " + carro.getVelocidade());
		
		ler.close();

	}

}
