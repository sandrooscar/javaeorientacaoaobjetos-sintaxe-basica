package sintaxe.variaveis.fluxo;

public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 4000.0;
	
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println(" IR � de 15% e pode deduzir R$ 350");
		} else if (salario >= 3751.0 && salario <= 4664) {
			System.out.println("IR � de 22.5% e pode deduzir R$ 636");
		}
	}
}
