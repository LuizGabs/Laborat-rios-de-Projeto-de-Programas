import java.util.Scanner;

public class Palindromos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		palavra = palavra.toUpperCase();
		palavra = palavra.replace(" ", "");
		int tamanho = palavra.length();
		tamanho--;
		int tamC = tamanho;
		int i = 0;
		while(i<tamanho) {
			if (palavra.charAt(i) != palavra.charAt(tamanho)) {
				System.out.print(palavra + " 0");
				i = tamanho;
			}
			else {
				i++;
				tamanho--;
				}
			}
		if ((tamC/2) == i || (tamC/2) == tamanho) {
			System.out.print(palavra + " 1");
		}
		scan.close();
	}
}
