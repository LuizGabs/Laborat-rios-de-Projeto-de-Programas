import java.util.Scanner;

public class FaltasTrabalho {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int faltas[] = new int[100];
		int i = scan.nextInt();
		int k = 0;
		int faltasSeg = 0;
		int faltasTer = 0;
		int faltasQua = 0;
		int faltasQui = 0;
		int faltasSex = 0;
		int faltasSab = 0;
		while(i!=-1) {
			faltas[k] = i;
			i = scan.nextInt();
			k++;
		}
		for (int j=0;j<k;j++) {
			if (faltas[j] == 2) {
				faltasSeg++;
			}
			else if (faltas[j] == 3) {
				faltasTer++;
			}
			else if (faltas[j] == 4) {
				faltasQua++;
			}
			else if (faltas[j] == 5) {
				faltasQui++;
			}
			else if (faltas[j] == 6) {
				faltasSex++;
			}
			else {
				faltasSab++;
			}
		}
		double perSeg = (((double) faltasSeg)/((double) k))*100;
		double perTer = (((double) faltasTer)/((double) k))*100;
		double perQua = (((double) faltasQua)/((double) k))*100;
		double perQui = (((double) faltasQui)/((double) k))*100;
		double perSex = (((double) faltasSex)/((double) k))*100;
		double perSab = (((double) faltasSab)/((double) k))*100;
		System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f", perSeg, perTer, perQua, perQui, perSex, perSab);
		scan.close();
	}
}
