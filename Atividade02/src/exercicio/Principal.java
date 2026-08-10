package exercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Cliente meuCliente = new Cliente();

		System.out.println("Digite o nome do cliente: ");
		meuCliente.nome = entrada.nextLine();

		System.out.println("Digite o número da conta: ");
		meuCliente.numconta = entrada.nextInt();

		System.out.println("Digite o valor do depósito: ");
		double deposito = entrada.nextDouble();

		System.out.println();
		meuCliente.exibeSaldo(deposito);

		entrada.close();
	}
}