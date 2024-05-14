import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float valor = scan.nextFloat();
		if (valor>200) {
			float pgto = (valor-(valor*0.05f));
			System.out.printf("%.2f", pgto);
		}
		else {
			System.out.printf("%.2f", valor);
		}
		scan.close();
	}
}
