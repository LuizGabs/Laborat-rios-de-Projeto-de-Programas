import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int golP[] = new int[100];
		int golS[] = new int[100];
		int gol = scan.nextInt();
		int vit = 0;
		int emp = 0;
		int der = 0;
		int k = 0;
		while (gol!=-1) {
			golP[k] = gol;
			k++;
			gol = scan.nextInt();
		}
		k = 0;
		gol = scan.nextInt();
		while(gol!=-1) {
			golS[k] = gol;
			k++;
			gol = scan.nextInt();
		}
		for (int j=0;j<k;j++) {
			if(golP[j]>golS[j]) {
				vit++;
			}
			else if (golP[j] == golS[j]) {
				emp++;
			}
			else {
				der++;
			}
		}
		scan.close();
		System.out.printf("%d %d %d", vit, emp, der);
	}
}
