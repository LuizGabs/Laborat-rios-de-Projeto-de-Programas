import java.util.Scanner;

public class AprovacaoDisciplina {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double notas[] = new double[100];
		double freq[] = new double[100];
		double cargaH;
		double i = scan.nextDouble();
		int k=0;
		int ap = 0;
		int repN = 0;
		int repF = 0;
		while (i!=-1) {
			notas[k] = i;
			k++;
			i = scan.nextDouble();
		}
		double j = scan.nextDouble();
		k=0;
		while(j!=-1) {
			freq[k] = j;
			k++;
			j = scan.nextDouble();
		}
		cargaH = scan.nextDouble();
		cargaH = cargaH*0.75;
		for (int cont=0;cont<k;cont++) {
			if (freq[cont] >= cargaH) {
				if (notas[cont] >= 5.0){
					ap++;
				}
				else {
					repN++;
				}
			}
			else {
				repF++;
			}
		}
		System.out.printf("%d %d %d", ap, repN, repF);
		scan.close();
	}
}
