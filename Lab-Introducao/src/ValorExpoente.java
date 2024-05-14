import java.util.Scanner;
import java.lang.Math;

public class ValorExpoente {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		int k = 0;
		double soma = 0;
		double termo = 0;
		while (soma<=valor) {
			k++;
			termo = Math.pow(2, k);
			soma = soma + termo;
		}
		System.out.print(k);
		scan.close();
	}
}
