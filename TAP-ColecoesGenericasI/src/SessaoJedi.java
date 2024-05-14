import java.util.*;

public class SessaoJedi {
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();
	
	SessaoJedi(String nome, TreinadorJedi treinador){
		this.nome = nome;
		this.treinador = treinador;
	}
	
	void addIniciado(IniciadoJedi iniciado) {
		if(getIniciado(iniciado.nome) == null) {
			iniciados.add(iniciado);
		}
	}
	
	IniciadoJedi getIniciado(String nome) {
		for(IniciadoJedi iniciado: iniciados) {
			if (iniciado.nome.equals(nome)) {
				return iniciado;
			}
		}
		return null;
	}
	double getMediaAnoNascimento() {
		int tamanho = iniciados.size();
		int i=0;
		double soma = 0;
		while(i<tamanho) {
			soma += iniciados.get(i).anoNascimento; 
			i++;
		}
		return soma/tamanho;
	}
	String getDescricao() {
		int j=1;
		String resultado = "--> SESSÃO " + nome + " (Treinador: " + treinador.getDescricao() + ")" + "\n";
		for(IniciadoJedi iniciadoAtual: iniciados) {
			resultado = resultado + "  - Iniciado " + j + ": "+ iniciadoAtual.getDescricao() + "\n";
			j++;
		}
		return resultado;
	}
}