public class Sala {
	int bloco, sala, capacidade;
	boolean acessivel;
	
	Sala(){
		this(0,0,0,false);
	}
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	String getDescricao() {
		if (acessivel == true) {
			return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, acessível)";
		}
		else {
			return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, não acessível)";
		}
	}
}
