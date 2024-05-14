public class AstromechMain {
	public static void main(String[] args) {
		Mestre mestre = new Mestre();
		mestre.nome = "Kassia";
		mestre.anoNascimento = 2001;
		mestre.afiliacao = "Trabalhadora";
		mestre.posto = "Jedi";
		
		String descricao = mestre.getDescricao();
		System.out.print(descricao);
		System.out.println();
		Mestre m = new Mestre("Kanan Jarrus", -33, "Jedi Order", "Jedi");
		String desc = m.getDescricao();
		System.out.print(desc);
		
		System.out.println();
		Sensor sens = new Sensor();
		System.out.print(sens.getDescricao());
		System.out.println();
		
		Conexao conex = new Conexao();
		System.out.print(conex.getDescricao());
		System.out.println();
		
		Astromech astromech = new Astromech("R2-D2", m, sens, conex);
		System.out.print(astromech.getDescricao());
	}
}
