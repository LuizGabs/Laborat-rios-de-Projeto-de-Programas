import java.util.Scanner;
import java.lang.Math;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double vel = scan.nextDouble();
		double ang = scan.nextDouble();
		double dist = scan.nextDouble();
		double radianos = Math.toRadians(ang);
		double distR = ((Math.pow(Math.abs(vel), 2))*Math.sin(2*radianos))/9.8;
		if (Math.abs((distR-dist))<=0.1) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
		scan.close();
	}
}
