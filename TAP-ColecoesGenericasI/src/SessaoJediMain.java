public class SessaoJediMain {
	public static void main(String[] args) {
		/* IniciadoJedi iniciado = new IniciadoJedi("Teste", "test", -20);
		System.out.print(iniciado.getDescricao());
		System.out.println();
		
		TreinadorJedi treinador = new TreinadorJedi("Grão-Mestre", "Fae Coven");
		System.out.print(treinador.getDescricao());
		System.out.println();
		
		SessaoJedi sessao = new SessaoJedi("Instruções de Uso da Força", treinador);
		
		sessao.addIniciado(iniciado);
		IniciadoJedi iniciado1 = new IniciadoJedi("Ashla", "Togruta", -23);
		sessao.addIniciado(iniciado1);
		IniciadoJedi i2 = new IniciadoJedi("Jempa", "Whiphid", -22);
		sessao.addIniciado(i2);
		IniciadoJedi i3 = new IniciadoJedi("Liam", "Human", -21);
		sessao.addIniciado(i3);
		System.out.print(sessao.getDescricao());
		*/
		IniciadoJedi i1 = new IniciadoJedi("Ashla", "Togruta", -23);
		IniciadoJedi i2 = new IniciadoJedi("Jempa", "Whiphid", -22);
		IniciadoJedi i3 = new IniciadoJedi("Liam", "Human", -21);
		TreinadorJedi t1 = new TreinadorJedi("High Jedi General", "Mace Windu");
		SessaoJedi s1 = new SessaoJedi("Invisibilidade", t1);
		s1.addIniciado(i1);
		s1.addIniciado(i2);
		s1.addIniciado(i3);
		System.out.println(s1.getDescricao());
	}
}