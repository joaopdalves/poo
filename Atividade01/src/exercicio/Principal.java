package exercicio;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
				v1.modelo = "Fusca";
				v1.cor = "Azul";
				v1.ano = 1975;
				
		Veiculo v2 = new Veiculo();
				v2.modelo = "Ecosport";
				v2.cor = "Preto";
				v2.ano = 2020;
				
				System.out.println ("Veiculo 1");
				System.out.println ("Modelo: " + v1.modelo);
				System.out.println ("Cor: " + v1.cor);
				System.out.println ("Ano: " + v1.ano);
				System.out.println (" ");
				System.out.println (v1.modelo + " - " + v1.cor + " - " + v1.ano);
				System.out.println (" ");
				
				System.out.println ("Veiculo 2");
				System.out.println ("Modelo: " + v2.modelo);
				System.out.println ("Cor: " + v2.cor);
				System.out.println ("Ano: " + v2.ano);
				System.out.println (" ");
				System.out.println (v2.modelo + " - " + v2.cor + " - " + v2.ano);
				System.out.println (" ");
	}

}
