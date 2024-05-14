package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main(String[] args) {
		FormaGeometrica[] vetor = new FormaGeometrica[3];
		Circulo circulo = new Circulo(32,87, 6);
		Quadrado quadrado = new Quadrado(45,39,6);
		Retangulo retangulo = new Retangulo(12,65,2,7);
		vetor[0] = circulo;
		vetor[1] = quadrado;
		vetor[2] = retangulo;
		for(FormaGeometrica objetos : vetor) {
			System.out.println(objetos);
		}
	}
}
