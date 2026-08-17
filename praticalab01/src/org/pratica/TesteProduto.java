package org.pratica;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setNomeProduto("tubaina vieira");
		System.out.println("o produto chama se: " + p1.getNomeProduto());
		
		p1.setDescrição("produzida em tatuí");
		System.out.println("descrição do produto: " + p1.getDescrição());
		
		p1.setQuantidade(100);
		System.out.println("quantidade no estoque: " + p1.getQuantidade());
		
		p1.setPreço(6.50);
		System.out.println("preço do produto: " + p1.getPreço());
		

	}

}
