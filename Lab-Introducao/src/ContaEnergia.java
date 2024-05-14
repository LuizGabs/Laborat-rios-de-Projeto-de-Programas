import java.util.Scanner;

public class ContaEnergia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		char tipo = scan.next().charAt(0);
		float pgto = 0;
		if(tipo == 'R') {
			if (valor>=0 && valor<=500) {
				pgto = valor*0.4f;
				System.out.printf("%.2f", pgto);
			}else if (valor>500) {
				pgto = valor*0.65f;
				System.out.printf("%.2f", pgto);
			}else {
				System.out.print("-1.00");
			}
		}
		else if (tipo == 'I') {
			if (valor >=0 && valor<=5000) {
				pgto = valor*0.55f;
				System.out.printf("%.2f", pgto);
			}else if (valor>5000) {
				pgto = valor*0.6f;
				System.out.printf("%.2f", pgto);
			}else {
				System.out.print("-1.00");
			}
		}
		else if (tipo == 'C') {
			if (valor>=0 && valor<=1000) {
				pgto = valor*0.55f;
				System.out.printf("%.2f", pgto);
			}else if (valor>1000) {
				pgto = valor*0.6f;
				System.out.printf("%.2f", pgto);
			}else {
				System.out.print("-1.00");
			}
		}else {
			System.out.print("-1.00");
		}
		scan.close();
	}
}
