package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular implements Localizavel {

	private int codPais;
	private int codArea;
	private int numero;
	
	public Celular(int codPais, int codArea, int numero) {
		setCodPais(codPais);
		setCodArea(codArea);
		setNumero(numero);
	}
	
	public int getCodPais() {
		return codPais;
	}
	public final void setCodPais(int codPais) {
		if (codPais<=1999 && codPais>=1) {
			this.codPais = codPais;
		}
		else {
			this.codPais = -1;
		}
	}
	
	public int getCodArea() {
		return codArea;
	}
	
	public final void setCodArea(int codArea) {
		if(codArea>= 10 && codArea<=99) {
			this.codArea = codArea;
		}
		else {
			this.codArea = -1;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public final void setNumero(int numero) {
		if(numero >= 10000000 && numero <= 999999999) {
			this.numero = numero;
		}
		else {
			this.numero = -1;
		}
	}
	
	public Posicao getPosicao() {
		Random r = new Random();
		double latitude = -3.160000 + (-2.960000 - (-3.160000)) * r.nextDouble();
		double longitude = -60.120000 + (-59.820000 - (-60.120000)) * r.nextDouble();
		double altitude = 15.0 + (100.0 - 15.0) * r.nextDouble();
		Posicao pos = new Posicao(latitude,longitude,altitude);
		return pos;
	}

	public double getErroLocalizacao() {
		return 50.0;
	}
}
