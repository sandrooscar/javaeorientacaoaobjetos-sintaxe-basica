package sintaxe.variaveis.fluxo;

public class TesteWhile {
	
	public static void main(String[] args) {
		
		int contador = 1;
		int total = 0;
		while (contador <= 10) {
			System.out.println("Contador: "+contador);
			total += contador;
			System.out.println("Total: "+total);
			contador++;
		}
	}
}
