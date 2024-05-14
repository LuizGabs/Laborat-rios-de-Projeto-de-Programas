import java.util.Scanner;

public class AsciiArt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = i;
		int n=0;
		while (j!=0) {
			for (int k=0; k<j;k++) {
				System.out.print('*');
			}
			for (int k=0;k<n;k++) {
				System.out.print("  ");
			}
			for (int k=0;k<j;k++) {
				System.out.print('*');
			}
			System.out.println();
			j--;
			n++;
		}
	}
}
