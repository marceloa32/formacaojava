
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		
		//valor = valor + 1; //nao compila pq e' transformado para o maior tipo, que e' int
		valor = (char) (valor + 1); //nao compila pq e' transformado para o maior tipo, que e' int
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
