import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n1, n2, n3, media;
		n1 = scan.nextFloat();
		n2 = scan.nextFloat();
		n3 = scan.nextFloat();
		media = (n1+n2+n3)/3;
		System.out.printf("%.2f", media);
		scan.close();
	}
}
