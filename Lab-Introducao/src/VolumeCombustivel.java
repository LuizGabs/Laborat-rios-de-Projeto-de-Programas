import java.util.Scanner;
import java.lang.Math;

public class VolumeCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double alturaH = scan.nextDouble();
		double nivelh = scan.nextDouble();
		double raio = scan.nextDouble();
		double pi = Math.PI;
		double volume = 0;
		double altCal;
		if (nivelh<=0 || alturaH<=0 || raio <=0) {
			System.out.println("-1.000");
		}
		else {
			if(nivelh<raio) {
				volume = (pi/3.0)*(Math.pow(nivelh, 2))*((3*raio)-nivelh);
				System.out.printf("%.3f", volume);
			}
			else if (nivelh == raio) {
				volume = ((4.0/3.0)*pi*Math.pow(raio,3))/2;
				System.out.printf("%.3f", volume);
			}
			else if (nivelh>raio && nivelh<(alturaH-raio)) {
				volume = ((4.0/3.0)*pi*Math.pow(raio,3))/2;
				double volC = pi*Math.pow(raio, 2)*(nivelh-raio);
				volume += volC;
				System.out.printf("%.3f", volume);
			}
			else if (nivelh>raio && nivelh == (alturaH-raio)) {
				volume = ((4.0/3.0)*pi*Math.pow(raio,3))/2;
				double volC = pi*Math.pow(raio, 2)*(alturaH-(2*raio));
				volume += volC;
				System.out.printf("%.3f", volume);
			}
			else if (nivelh>(alturaH-raio) && nivelh<(alturaH)) {
				volume = ((4.0/3.0)*pi*Math.pow(raio,3))/2;
				double volC = pi*Math.pow(raio, 2)*(alturaH-(2*raio));
				volume += volC;
				altCal = nivelh - (alturaH - raio);
				volume += (pi/3.0)*(Math.pow(altCal, 2))*((3*raio)-altCal);
				System.out.printf("%.3f", volume);
			}
			else if (nivelh == alturaH) {
				volume = (4.0/3.0)*pi*Math.pow(raio,3);
				double volC = pi*Math.pow(raio, 2)*(alturaH-(2*raio));
				volume += volC;
				System.out.printf("%.3f", volume);
			}
			else {
				System.out.println("-1.000");
			}
		}
		scan.close();
	}
}
