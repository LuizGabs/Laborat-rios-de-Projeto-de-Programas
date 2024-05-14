import java.util.Scanner;
import java.lang.Math;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pi = Math.PI;
		double raio = scan.nextDouble();
		double altura = scan.nextDouble();
		double volesf, volcomb, volalt;
		int opcao = scan.nextInt();
		if (opcao == 1) {
			volalt = (pi/3.0)*(Math.pow(altura, 2))*((3*raio) - altura);
			System.out.printf("%.4f", volalt);
		}
		else if (opcao == 2) {
			volalt = (pi/3.0)*(Math.pow(altura, 2))*((3*raio) - altura);
			volesf = (4.0/3.0)*pi*Math.pow(raio, 3);
			volcomb = volesf - volalt;
			System.out.printf("%.4f", volcomb);
		}
		scan.close();
	}
}