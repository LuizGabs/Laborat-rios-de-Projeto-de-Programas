package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho;
	
	public Caminho(int maxTam) {
		this.tamanho = maxTam;
		caminho = new Coordenada[tamanho];
	}
	
	public int tamanho() {
		int tamanho = 0;
		try {
			while(caminho[tamanho]!=null) {
				tamanho++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
		}
		return tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
		if (tamanho() == this.tamanho || tamanho() > this.tamanho) throw new TamanhoMaximoExcedidoException();
		if (tamanho()!=0 && caminho[tamanho()-1].distancia(coordenada) > 15) throw new DistanciaEntrePontosExcedidaException();
		caminho[tamanho()] = coordenada;
	}
	
	public void reset() {
		int i = 0;
		while(i<=tamanho()) {
			caminho[i] = null;
			i++;
		}
	}
	
	public String toString() {
		String relatorio = "Dados do caminho:\n";
		relatorio += "  - Quantidade de pontos: " + tamanho() + "\n";
		relatorio += "  - Pontos:\n";
		int i=0;
		if (tamanho()!=0) {
			while (i<tamanho()) {
				relatorio += "    -> " + caminho[i].toString() + "\n";
				i++;
			}
		}
		return relatorio;
	}
}
