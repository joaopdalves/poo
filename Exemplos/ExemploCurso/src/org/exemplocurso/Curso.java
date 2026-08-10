package org.exemplocurso;

public class Curso {
	public String nome;
	
	 //método = funcionalidade
	 public void exibeMensagem(String nome) {
	 System.out.println("Bem-vindo ao curso de: " + nome);
	
	}
	 
	 public void exibeMensalidade(double valor) {
		 System.out.printf("Mensalidade:  %.2f\n", valor);
		
		}

}
