package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
	public static void main(String[] args) {
		//Posicao pos = new Posicao(-3.089242, -59.964874, 88.374);
		//pos.setAltitude(2);
		//System.out.println(pos.toString());
		Celular cel = new Celular(50,11,99083110);
		//System.out.println(cel.getPosicao());
		Celular c = new Celular(55, 92, 930154926);
		//c = new Celular(-8, -4, -93857164);
		//System.out.println(c.getCodPais());
		
		Localizavel[] localizavel = new Localizavel[3];
		localizavel[0] = cel;
		localizavel[1] = c;
		CarroLuxuoso carro = new CarroLuxuoso("NHA9905");
		localizavel[2] = carro;
		for(Localizavel local : localizavel) {
			System.out.println(local.getPosicao());
		}
	}
}
