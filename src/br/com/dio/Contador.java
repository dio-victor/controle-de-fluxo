package br.com.dio;

import java.util.Scanner;

import br.com.dio.exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = scanner.nextInt();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException ex) {
			//imprimir mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(ex.getMessage());	
		}

		scanner.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é maior que paramtroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;

		for(int i = 1; i <= contagem; i++) {
			System.out.printf("Imprimindo o número %s!\n", i);
		}
	}
	
}
