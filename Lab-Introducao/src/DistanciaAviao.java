import java.util.Scanner;

public class DistanciaAviao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] posicao = new int[100];
		int i = scan.nextInt();
		int k=0;
		while (i!=-1) {
			posicao[k] = i;
			k++;
			i = scan.nextInt();
		}
		int[] vet1 = {0,2,11,6,15,11,1};
		int[] vet2 = {2,0,7,12,4,2,15};
		int[] vet3 = {11,7,0,11,8,3,13};
		int[] vet4 = {6,12,11,0,10,2,1};
		int[] vet5 = {15,4,8,10,0,5,13};
		int[] vet6 = {11,2,3,2,5,0,14};
		int[] vet7 = {1,15,13,1,13,14,0};
		int dist = 0;
		int cont = 0;
		int j;
		while(cont<k) {
			if(cont < k - 1) {
				j=((posicao[cont+1]/111)-1);
				if (posicao[cont] == 111) {
					dist += vet1[j];
					cont++;
				}
				else if (posicao[cont] == 222) {
					dist += vet2[j];
					cont++;
				}
				else if (posicao[cont] == 333) {
					dist += vet3[j];
					cont++;
				}	
				else if (posicao[cont] == 444) {
					dist += vet4[j];
					cont++;
				}
				else if (posicao[cont] == 555) {
					dist += vet5[j];
					cont++;
				}
				else if (posicao[cont] == 666) {
					dist += vet6[j];
					cont++;
				}
				else if (posicao[cont] == 777){
					dist += vet7[j];
					cont++;
				}
			}
			else if (cont == k-1) {
				cont++;
			}
		}
		System.out.println(dist);
		scan.close();
	}
}
