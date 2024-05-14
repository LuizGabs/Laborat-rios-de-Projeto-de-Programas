import java.lang.Math;
public class IniciadoJedi {
	String nome;
	String especie;
	int anoNascimento;
	
	IniciadoJedi(){
		this("", "", 0);
	}
	IniciadoJedi(String nome, String especie, int anoNascimento){
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	String getAnoNascimento() {
		if (anoNascimento>=0) {
			return anoNascimento + " DBY";
		}
		else {
			int anoNasc = Math.abs(anoNascimento);
			return anoNasc + " ABY";
		}
	}
	String getDescricao() {
		return nome + " (especie=" + especie + ", nascimento=" + getAnoNascimento() + ")";
	}
}