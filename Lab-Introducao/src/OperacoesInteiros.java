import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int cont;
		int contpar;
		int contimpar;
		int soma;
		float media;
		int maior;
		int menor;
		int vetor[] = new int[100];
		while (i!=-1) {
			cont = -1;
			contpar = 0;
			contimpar = 0;
			soma = 0;
			media = 0;
			while (i!=-1) {
				cont++;
				vetor[cont] = i;
				i = scan.nextInt();
			}
			cont = cont+1;
			System.out.printf("%d", cont);
			for(int k=0;k<cont;k++) {
				if((vetor[k]%2)==0) {
					contpar++;
				}
				else {
					contimpar++;
				}
			}
			System.out.println();
			System.out.printf("%d", contpar);
			System.out.println();
			System.out.printf("%d", contimpar);
			for(int k=0;k<cont;k++) {
				soma = soma + vetor[k];
			}
			System.out.println();
			System.out.printf("%d", soma);
			float summ = soma;
			media = summ/cont;
			System.out.println();
			System.out.printf("%.2f", media);
			maior = vetor[0];
			menor = vetor[0];
			for(int k=0;k<cont;k++) {
				if(vetor[k]>maior) {
					maior = vetor[k];
				}
				else if (vetor[k]<menor) {
					menor = vetor[k];
				}
			}
			System.out.println();
			System.out.printf("%d", maior);
			System.out.println();
			System.out.printf("%d", menor);
			System.out.println();
			i = scan.nextInt();
		}
		scan.close();
	}
}
