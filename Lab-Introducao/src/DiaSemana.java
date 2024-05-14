import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int[] horas = new int[100];
		int k = 0;
		int dom=0, seg=0, ter=0, qua=0, qui=0, sex=0, sab=0;
		while(i!=-1) {
			horas[k] = i;
			k++;
			if (k==7) {
				dom += horas[0];
				seg += horas[1];
				ter += horas[2];
				qua += horas[3];
				qui += horas[4];
				sex += horas[5];
				sab += horas[6];
				k = 0;
				i = scan.nextInt();
			}
			else {
				i = scan.nextInt();
			}
		}
		int[] dias = {dom, seg, ter, qua, qui, sex, sab};
		int maior=0;
		for (int j=0; j<7; j++) {
			if (dias[j]>=maior) {
				maior = dias[j];
			}
		}
		for(int j=0;j<7;j++) {
			if (dias[j] == maior) {
				System.out.println(j+1);
			}
		}
		scan.close();
	}
}
