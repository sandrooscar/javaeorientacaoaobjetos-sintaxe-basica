package sintaxe.variaveis.fluxo;

public class TesteFatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for(int n = 1; n <= 1; n++) {
			fatorial += fatorial * (n - 1);
			//fatorial *= n; //3628800
			System.out.println("n: "+ n * (n-1));
			System.out.println("fatorial "+fatorial);
		}
		System.out.println(fatorial);
	}

}
