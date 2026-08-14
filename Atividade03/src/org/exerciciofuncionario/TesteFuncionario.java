package org.exerciciofuncionario;

import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Digite o nome: ");
        func.setNome(leitor.nextLine());

        System.out.print("Digite a idade: ");
        func.setIdade(leitor.nextInt());
        leitor.nextLine(); 

        System.out.print("Digite o e-mail: ");
        func.setEmail(leitor.nextLine());

        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + func.getNome());
        System.out.println("Idade: " + func.getIdade());
        System.out.println("E-mail: " + func.getEmail());

        leitor.close();
    }
}