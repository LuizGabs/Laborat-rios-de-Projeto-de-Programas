import java.util.*;
public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	Ensalamento(){
		
	}
	void addSala(Sala sala) {
		salas.add(sala);
	}
	
	void addTurma(Turma turma) {
		turmas.add(turma);
	}
	
	Sala getSala(Turma turma) {
		for(TurmaEmSala turmas : ensalamento) {
			if (turmas.turma.equals(turma)) {
				return turmas.sala;
			}
		}
		return null;
	}
	
	boolean salaDisponivel(Sala sala, int horario) {
		int flag=0;
		for (TurmaEmSala turmas : ensalamento) {
			if (turmas.sala.equals(sala)) {
				for (int i =0; i<turmas.turma.horarios.size();i++) {
					if (turmas.turma.horarios.get(i) == horario) {
						flag = 1;
					}
				}
			}
		}
		if (flag == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		int i=0;
		int flag=0;
		int tamanho = horarios.size();
		while(i<tamanho) {
			if ((salaDisponivel(sala, horarios.get(i))) == false) {
				flag = 1;
				i = tamanho;
			}
			else {
				i++;
			}
		}
		if (flag == 1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	boolean alocar(Turma turma, Sala sala) {
		if (turma.acessivel == true) {
			if (sala.acessivel == true) {
				if (turma.numAlunos <= sala.capacidade) {
					if ((salaDisponivel(sala, turma.horarios)) == true ) {
						TurmaEmSala turmclass = new TurmaEmSala(turma,sala);
						ensalamento.add(turmclass);
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			if(turma.numAlunos <= sala.capacidade) {
				if ((salaDisponivel(sala, turma.horarios)) == true) {
					TurmaEmSala turmclass = new TurmaEmSala(turma,sala);
					ensalamento.add(turmclass);
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
	}
	
	void alocarTodas() {
		int tamanho = salas.size();
		int i =0;
		for (Turma turm : turmas) {
			while(i<tamanho) {
				if(alocar(turm,salas.get(i))!=false) {
					i = tamanho;
				}
				else {
					i++;
				}
			}
			i=0;
		}
	}
	
	int getTotalTurmasAlocadas() {
		int cont = 0;
		for (TurmaEmSala contador : ensalamento) {
			if (contador.sala!=null) {
				cont++;
			}
		}
		return cont;
	}
	
	int getTotalEspacoLivre() {
		int acumul = 0;
		for (TurmaEmSala contador : ensalamento) {
			acumul += contador.sala.capacidade - contador.turma.numAlunos;
		}
		return acumul;
	}
	String relatorioResumoEnsalamento() {
		String relatorio = "Total de Salas: " + salas.size() + "\n";
		relatorio += "Total de Turmas: " + turmas.size() + "\n";
		relatorio += "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n";
		relatorio += "Espaços Livres: " + getTotalEspacoLivre() + "\n";
		return relatorio;
	}
	
	String relatorioTurmasPorSala() {
		String relatorio = relatorioResumoEnsalamento();
		relatorio += "\n";
		int i = 0;
		for (Sala classe : salas) {
			relatorio += "--- Bloco " + classe.bloco + ", Sala " + classe.sala + " (" + classe.capacidade + " lugares, ";
			if (classe.acessivel == true) {
				relatorio += "acessível) ---";
			}
			else {
				relatorio += "não acessível) ---";
			}
			relatorio += "\n\n";
			for (TurmaEmSala contador : ensalamento) {
				if (contador.sala!=null) {
					if(contador.sala.equals(classe)) {
						relatorio+="Turma: " + contador.turma.nome + "\n";
						relatorio +="Professor: " + contador.turma.professor + "\n";
						relatorio +="Número de Alunos: " + contador.turma.numAlunos + "\n";
						relatorio += "Horário: " + contador.turma.getHorariosString() + "\n";
						if (contador.turma.acessivel == true) {
							relatorio += "Acessível: sim\n";
						}
						else {
							relatorio += "Acessível: não\n";
						}
						relatorio += "\n";
					}
				}
			}
		}
		return relatorio;
	}
	
	String relatorioSalasPorTurma() {
		String relatorio = relatorioResumoEnsalamento();
		relatorio += "\n";
		for(Turma turmm : turmas) {
			relatorio += "Turma: " + turmm.nome + "\n";
			relatorio += "Professor: " + turmm.professor + "\n";
			relatorio += "Número de Alunos: " + turmm.numAlunos + "\n";
			relatorio += "Horário: " + turmm.getHorariosString() + "\n";
			if(turmm.acessivel == true) {
				relatorio += "Acessível: sim\n";
			}
			else {
				relatorio += "Acessível: não\n";
			}
			if(getSala(turmm) == null) {
				relatorio += "Sala: SEM SALA\n";
			}
			else {
				relatorio += "Sala: " + getSala(turmm).getDescricao() + "\n";
			}
			relatorio += "\n";
		}
		return relatorio;
	}
}
