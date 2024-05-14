import java.util.Scanner;

public class MediaColecao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int vetor[] = new int[100];
		int k=0;
		float summ=0;
		float media;
		while(i!=-1) {
			vetor[k] = i;
			k++;
			i = scan.nextInt();
		}
		for(int j=0;j<k;j++) {
			summ = summ + vetor[j];
		}
		media = summ/k;
		System.out.printf("%.2f", media);
		scan.close();
	}
}
