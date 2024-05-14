import java.util.Scanner;
import java.lang.Math;

public class AproximacaoPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 2;
		double prim = 3.0;
		int k=1;
		double vetor[] = new double[100];
		double termo = 0;
		vetor[0] = 3.0;
		if (n>1) {
			for (int j=2;j<=n;j++) {
				termo = (4*(Math.pow(-1, j)))/(x*(x+1)*(x+2));
				prim = prim + termo;
				vetor[k] = prim;
				k++;
				x = x + 2;
			}
		}
		else {
			vetor[0] = prim;
		}
		for (int l=0;l<k;l++) {
			System.out.printf("%.6f\n", vetor[l]);
		}
		scan.close();
	}
}
