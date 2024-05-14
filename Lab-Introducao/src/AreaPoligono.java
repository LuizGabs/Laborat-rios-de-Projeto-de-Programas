import java.util.Scanner;
import java.lang.Math;

public class AreaPoligono {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float vetX[] = new float[100];
		float vetY[] = new float[100];
		int n = 0;
		float i = scan.nextFloat();
		int k = 0;
		float summ = 0;
		float area;
		while(i!=-1) {
			n++;
			vetX[k] = i;
			k++;
			i = scan.nextInt();
		}
		i = scan.nextInt();
		k = 0;
		while(i!=-1) {
			vetY[k] = i;
			k++;
			i = scan.nextFloat();
		}
		for(int j=0;j<=(n-2);j++) {
			summ = summ + ((vetX[j+1] + vetX[j])*(vetY[j+1] - vetY[j])); 
		}
		summ = Math.abs(summ);
		area = summ/2;
		System.out.printf("%.4f", area);
		scan.close();
	}
}
