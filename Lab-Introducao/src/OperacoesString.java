import java.util.Scanner;

public class OperacoesString {
	public static int numVogais(String input) {
		String vogais = "";
		String minus = input.toLowerCase();
		for (int i = 0;i<input.length();i++) {
			char c = minus.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vogais = vogais + c;
			}
		}
		return vogais.length();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		int tamanho = palavra.length();
		System.out.println(tamanho);
		char prim = palavra.charAt(0);
		char ult = palavra.charAt(tamanho-1);
		System.out.println(prim);
		System.out.println(ult);
		String maius = palavra.toUpperCase();
		String minus = palavra.toLowerCase();
		System.out.println(maius);
		System.out.println(minus);
		String ae = palavra.replace('a', 'e');
		System.out.println(ae);
		for (int i = 0; i<tamanho;i++) {
			if (i%2 == 0) {
				System.out.print(palavra.charAt(i));
			}
		}
		System.out.println();
		int numvog = numVogais(palavra);
		System.out.println(numvog);
		scan.close();
	}
}
