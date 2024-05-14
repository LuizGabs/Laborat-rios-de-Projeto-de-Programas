import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int[100];
		int i = scan.nextInt();
		int k=0;
		while (i!=-1) {
			vetor[k] = i;
			k++;
			i = scan.nextInt();
		}
		for (int j=0; j<k;j++) {
			if ((vetor[j]%2) == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
		}
	}
}
