package exercicio;

public class Cliente {
	
	public String nome;
    public int numconta;
    public double saldo = 100.00; 
 
    public void exibeSaldo(double deposito) {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Conta: %d%n", numconta);
        System.out.printf("Saldo atualizado: %.2f%n", (saldo + deposito));
    }
}