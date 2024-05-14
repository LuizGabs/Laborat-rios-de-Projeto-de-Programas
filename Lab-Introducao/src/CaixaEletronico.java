import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;
		int sobra = 0;
		if (((valor%2) == 0) && (valor>0)) {
			x = valor/50;
			sobra = valor - (x*50);
			y = sobra/10;
			sobra = sobra - (y*10);
			z = sobra/2;
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", x, y, z);
		}
		else {
			System.out.println("Valor Invalido");
		}
		scan.close();
	}
}
