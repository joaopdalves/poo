package org.exemplovalor;

public class Valor {

    public int num1;
    public double num2;

    public void exibeResultado() {
        System.out.printf("Dobro de um inteiro: %d%n", (num1 * 2));
        System.out.printf("Dobro de um real: %.2f%n", (num2 * 2));
    }
}