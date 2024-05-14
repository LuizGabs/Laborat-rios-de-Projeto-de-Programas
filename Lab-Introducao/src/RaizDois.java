import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double constante = 1.0;
        double termo;
        double semente = 1.0;
        double result = 0;
        int i=0;
        while(i<n) {
        	termo = 1.0/(2.0 + semente);
        	result = constante + termo;
        	semente = termo;
        	System.out.printf("%.14f\n", result);
        	i++;
        }
        scan.close();
    }
}
