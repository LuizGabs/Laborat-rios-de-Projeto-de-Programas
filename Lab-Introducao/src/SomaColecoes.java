import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int vetor[] = new int[100];
		int k=0;
		int summ=0;
		while(i!=-1) {
			while(i!=-1) {
				vetor[k] = i;
				k++;
				i = scan.nextInt();
			}
			for(int j=0; j<k; j++) {
				summ = summ + vetor[j];
			}
			System.out.println(summ);
			i = scan.nextInt();
			k=0;
			summ = 0;
		}
		scan.close();
	}
}
