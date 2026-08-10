package org.exemplocurso;

import java.util.Scanner;


public class TesteCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Scanner leia = new Scanner(System.in);
		String nomec;
		double valorc;
		
		System.out.println("Digite o nome do curso: ");
		nomec = leia.nextLine();
		
		curso1.exibeMensagem(nomec);
		
		System.out.println("Digite o valor da mensalidade: ");
		valorc = leia.nextDouble();
		
		curso1.exibeMensalidade(valorc);
		
		

	}

}
