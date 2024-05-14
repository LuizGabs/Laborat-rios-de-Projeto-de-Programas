import java.util.Scanner;
import java.lang.Math;

public class AproximacaoSeno {
	double fat(int a) {
		if (a==0 || a==1) {
			return 1.0;
		}
		else {
			return a*fat(a-1);
		}
	}
	public static void main(String[] args) {
		AproximacaoSeno fatorial = new AproximacaoSeno();
		Scanner scan = new Scanner(System.in);
		double  ang = scan.nextDouble();
		int numK = scan.nextInt();
		double radians = Math.toRadians(ang);
		double rad = 0;
		int n = 0;
		double termo = 0;
		while(numK!=0) {
			termo = ((Math.pow(radians, 2*n+1))*Math.pow(-1, n))/(fatorial.fat((2*n)+1));
			rad = rad + termo;
			System.out.printf("%.10f\n", rad);
			n++;
			numK--;
		}
		scan.close();
	}
}
