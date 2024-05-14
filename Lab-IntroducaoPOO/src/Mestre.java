import java.lang.Math;

public class Mestre {
	String nome;
	int anoNascimento;
	String afiliacao;
	String posto;
	
	Mestre(){
		this("Luke Skywalker", 19, "Alianca para Restauracao da Republica", "Jedi");
	}
	Mestre(String nome, int anoNascimento, String afiliacao, String posto){
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	int getIdade(int anoReferencia){
		return anoReferencia - anoNascimento;
	}
	
	String getAnoNascimentoString() {
		if (anoNascimento>=0) {
			String num = "DBY";
			return anoNascimento + num;
		}
		else {
			String num = "ABY";
			int anonasc = Math.abs(anoNascimento);
			return anonasc + num;
		}
	}
	
	boolean possuiForca() {
		if (posto == "Jedi" || posto == "Sith") {
			return true;
		}
		else {
			return false;
		}
	}
	
	String getDescricao() {
		return "Mestre: nome=" + nome + ", anoNascimento=" + getAnoNascimentoString() + ", afiliacao=" + afiliacao + ", posto=" + posto + ", possuiForca=" + possuiForca() + ".";
	}
	
}
