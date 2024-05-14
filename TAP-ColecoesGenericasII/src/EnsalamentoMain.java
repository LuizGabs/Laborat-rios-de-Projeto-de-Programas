public class EnsalamentoMain {
	public static void main(String[] args) {
		/*Sala sala = new Sala(6, 101, 50, true);
		Sala sala2 = new Sala(6,102,100, true);
		// System.out.println(sala.getDescricao());
		Turma turma1 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, true);
		turma1.addHorario(1);
		turma1.addHorario(15);
		turma1.addHorario(29);
		//System.out.println(turma1.getDescricao());
		
		Ensalamento ensalamento = new Ensalamento();
		ensalamento.addSala(sala);
		ensalamento.addSala(sala2);
		//ensalamento.addTurma(turma1);
		Turma turma2 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
		turma2.addHorario(11);
		turma2.addHorario(25);
		turma2.addHorario(32);
		Turma turma3 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
		turma3.addHorario(1);
		turma3.addHorario(15);
		turma3.addHorario(29);
		ensalamento.addTurma(turma3);
		ensalamento.addTurma(turma2);
		ensalamento.addTurma(turma1);
		ensalamento.alocarTodas();
		//ensalamento.alocar(turma3, sala);
		//ensalamento.alocar(turma2, sala);
		//System.out.println(ensalamento.alocar(turma2, sala));
		//System.out.println(ensalamento.salaDisponivel(sala, 10));
		//System.out.println(ensalamento.relatorioResumoEnsalamento());
		//System.out.println(ensalamento.getSala(turma3).getDescricao());
		//System.out.println(ensalamento.relatorioTurmasPorSala());
		System.out.println(ensalamento.relatorioSalasPorTurma());
		*/
		Ensalamento e1 = new Ensalamento();
		Sala s1 = new Sala(2, 102, 80, true);
		e1.addSala(s1);
		Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true);
		t1.addHorario(7);
		t1.addHorario(21);
		t1.addHorario(35);
		e1.addTurma(t1);
		Sala s2 = new Sala(2, 202, 100, false);
		e1.addSala(s2);
		e1.alocar(t1, s2);
		Sala s3 = new Sala(2, 301, 50, true);
		e1.addSala(s3);
		e1.alocar(t1, s3);
		e1.alocar(t1, s1);
		System.out.println(e1.salaDisponivel(s1, 7));
	}
}
