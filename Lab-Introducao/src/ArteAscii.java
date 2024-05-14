import java.util.Scanner;

public class ArteAscii {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int j = n;
		while(j!=1) {
			for(int k=0;k<j;k++) {
				System.out.print('*');
			}
			System.out.println();
			j--;
		}
		System.out.print('*');
		System.out.println();
		while(j<=n) {
			for(int k=0;k<j;k++) {
				System.out.print('*');
			}
			System.out.println();
			j++;
		}
		a.close();
	}
}
