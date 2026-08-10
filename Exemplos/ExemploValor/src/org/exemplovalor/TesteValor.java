package org.exemplovalor;

import java.util.Scanner; 

public class TesteValor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Valor v1 = new Valor();

        System.out.print("Digite um número inteiro: ");
        v1.num1 = entrada.nextInt(); 

        System.out.print("Digite um número real: ");
        v1.num2 = entrada.nextDouble(); 

        System.out.println();
        v1.exibeResultado();

        entrada.close();
    }
}