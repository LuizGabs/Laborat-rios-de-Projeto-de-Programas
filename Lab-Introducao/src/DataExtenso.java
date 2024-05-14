import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		int ano = data%10000;
		data = data/10000;
		int mes = data%100;
		int dia = data/100;
		if (mes == 1) {
			System.out.printf("%d de janeiro de %d", dia, ano);
		}
		else if (mes == 2) {
			System.out.printf("%d de fevereiro de %d", dia, ano);
		}
		else if (mes == 3) {
			System.out.printf("%d de março de %d", dia, ano);
		}
		else if (mes == 4) {
			System.out.printf("%d de abril de %d", dia, ano);
		}
		else if (mes == 5) {
			System.out.printf("%d de maio de %d", dia, ano);
		}
		else if (mes == 6) {
			System.out.printf("%d de junho de %d", dia, ano);
		}
		else if (mes == 7) {
			System.out.printf("%d de julho de %d", dia, ano);
		}
		else if (mes == 8) {
			System.out.printf("%d de agosto de %d", dia, ano);
		}
		else if (mes == 9) {
			System.out.printf("%d de setembro de %d", dia, ano);
		}
		else if (mes == 10) {
			System.out.printf("%d de outubro de %d", dia, ano);
		}
		else if (mes == 11) {
			System.out.printf("%d de novembro de %d", dia, ano);
		}
		else {
			System.out.printf("%d de dezembro de %d", dia, ano);
		}
		scan.close();
	}
}
