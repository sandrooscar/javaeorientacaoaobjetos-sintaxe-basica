package sintaxe.variaveis.fluxo;

public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		}else {
				
				if (quantidadePessoas >= 2) {
					System.out.println("Voc� � menor de 18 anos, por�m est� acompanhado, ent�o pode entrar");
	
				} else {
					System.out.println("Infelizmente voc� n�o pode entrar");
				}
		}
	}
}
