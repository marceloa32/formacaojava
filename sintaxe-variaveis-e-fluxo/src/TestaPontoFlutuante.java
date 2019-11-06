
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario = 1250.70;
		
		System.out.println("meu salário é " + salario);
		
//		int valor = 12.5; //nao compila
//		int valor2 = 0.0; //nao compila
		double teste = 125.50;
//		int valor3 = teste; //nao compila
		
		int divisao = 5 / 2; //divisao entre inteiros para inteiro e' truncada		
		System.out.println(divisao);
		
//		double divisao2 = 5 / 2; //divisao entre inteiros para double e' truncada		
//		System.out.println(divisao2);
		
		double divisao2 = 5.0 / 2; //como um deles e double, agora da certo
		System.out.println(divisao2);
	}
}
