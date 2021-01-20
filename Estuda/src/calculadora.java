import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		operadores op = new operadores();
		Scanner ler = new Scanner(System.in);

		double n1, n2, soma,simbolo;
		

		System.out.println("Digite o Primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = ler.nextDouble();
		System.out.println(" 1 - Soma / 2 - Subtração / 3 - Multiplicação / 4 - Divisão");
		simbolo = ler.nextDouble();

		if (simbolo == 1) {
			System.out.println(soma = n1 + n2);
		} else if (simbolo == 2) {
			System.out.println(soma = n1 - n2);
		} else if (simbolo == 3) {
			System.out.println(soma = n1 * n2);
		} else if (simbolo == 4) {
			System.out.println(soma = n1 / n2);
		} else {
			System.out.println("Numero invalido");
		}
	}
}
