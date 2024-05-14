import java.util.Scanner;

public class MediaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int vetor[] = new int[100];
		int k=0;
		float summ=0;
		float media;
		while(i!=-1) {
			while(i!=-1) {
				vetor[k] = i;
				k++;
				i = scan.nextInt();
			}
			for(int j = 0; j<k;j++) {
				summ = summ + vetor[j];
			}
			media = summ/k;
			System.out.printf("%.2f\n", media);
			k=0;
			summ = 0;
			i = scan.nextInt();
		}
		scan.close();
	}
}
