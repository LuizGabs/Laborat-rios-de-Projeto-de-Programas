package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args){
		Caminho c = new Caminho(6);
		try {
		Coordenada r1 = new Coordenada(23, 55, 8);
		c.addCoordenada(r1);
		Coordenada r2 = new Coordenada(27, 65, 2);
		c.addCoordenada(r2);
		Coordenada r3 = new Coordenada(37, 70, 7);
		c.addCoordenada(r3);
		Coordenada r4 = new Coordenada(48, 74, 2);
		c.addCoordenada(r4);
		Coordenada r5 = new Coordenada(62, 74, 6);
		c.addCoordenada(r5);
		Coordenada re = new Coordenada(78, 74, 2);
		c.addCoordenada(re);
		}
		catch (CoordenadaNegativaException e) {
			System.out.println(e);
		}
		catch (CoordenadaForaDosLimitesException e) {
			System.out.println(e);
		}
		catch (DigitoInvalidoException e) {
			System.out.println(e);
		}
		catch (TamanhoMaximoExcedidoException e) {
			System.out.println(e);
		}
		catch (DistanciaEntrePontosExcedidaException e) {
			System.out.println(e);
		}
	}
}
