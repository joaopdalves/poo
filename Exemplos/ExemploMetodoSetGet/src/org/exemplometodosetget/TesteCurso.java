package org.exemplometodosetget;

public class TesteCurso {

    public static void main(String[] args) {
        Curso c1 = new Curso();

        c1.setNomeCurso("ADS");
        System.out.println("Nome curso: " + c1.getNomeCurso());

        c1.setDuracao(80);
        System.out.println("Duração curso: " + c1.getDuracao());

        c1.setValor(300.00);
        System.out.printf("Valor curso: %.2f \n", c1.getValor());
    }

}