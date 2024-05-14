import java.util.Scanner;

public class PinturaMuro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float valor = scan.nextFloat();
		float custo = (valor*36) + 100;
		System.out.printf("%.1f", custo);
		scan.close();
	}
}
