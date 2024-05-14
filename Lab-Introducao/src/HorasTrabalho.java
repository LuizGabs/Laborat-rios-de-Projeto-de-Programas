import java.util.Scanner;

public class HorasTrabalho {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horas = scan.nextInt();
		int k = 0;
		int summ = 0;
		int[] vetor = new int[100];
		while (horas!=-1) {
			vetor[k] = horas;
			k++;
			if(k == 7) {
				for (int j = 0;j<k;j++) {
					summ = summ + vetor[j];
				}
				System.out.println(summ);
				k=0;
				summ=0;
				horas = scan.nextInt();
			}
			else {
				horas = scan.nextInt();
			}
		}
		scan.close();
	}
}
