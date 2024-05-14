import java.util.*;

public class Turma {
	String nome, professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	Turma(){
		this("", "", 0, false);
	}
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}
	
	void addHorario(int horario) {
		horarios.add(horario);
	}
	String getHorariosString() {
		String hor = "";
		String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta"};
		int[] h = {8,10,12,14,16,18,20};
		for (int horario : horarios) {
			if (hor.length() == 0) {
				String day = dia[(horario-1)/7];
				int hour = h[(horario-1)%7];
				hor = day + " " + hour + "hs";
			}
			else {
				String day = dia[(horario-1)/7];
				int hour = h[(horario-1)%7];
				hor += ", " + day + " " + hour + "hs";
			}
		}
		return hor;
	}
	String getDescricao() {
		String desc = "Turma: " + nome + "\n";
		desc += "Professor: " + professor + "\n";
		desc += "Número de Alunos: " + numAlunos + "\n";
		desc += "Horário: " + getHorariosString() + "\n";
		if (acessivel == true) {
			desc += "Acessível: sim";
		}
		else {
			desc += "Acessível: não";
		}
		return desc;
	}
}
