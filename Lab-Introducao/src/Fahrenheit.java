import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float celsius = scan.nextFloat();
		float fahrenheit = ((9*celsius)/5) + 32;
		System.out.printf("%.1f", fahrenheit);
		scan.close();
	}
}
