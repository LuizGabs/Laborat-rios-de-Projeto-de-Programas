import java.util.Scanner;

public class CifraCesar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int desloc = scan.nextInt();
		String palavra = scan.nextLine();
		int tamanho = palavra.length();
		char caracOriginal;
		char cCifrado;
		String codificada = "";
		for (int i = 1; i<tamanho;i++) {
			caracOriginal = palavra.charAt(i);
			if ((caracOriginal<=90 && caracOriginal>=65) || (caracOriginal>=97 && caracOriginal <= 122)) {
				cCifrado = (char) (caracOriginal - 'a');
				cCifrado = (char) ((cCifrado + desloc) % 26);
				cCifrado += 'A';
				codificada += cCifrado;
			}
			else {
				codificada += caracOriginal;
			}
		}
		System.out.print(codificada);
	}
}
