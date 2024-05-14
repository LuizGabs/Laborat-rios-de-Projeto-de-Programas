public class Conexao {
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	
	Conexao(){
		this("SCOMP Link", 1, 4096000);
	}
	Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao){
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaTransmissao;
	}
	
	double getTaxaMBps() {
		return ((double) taxaTransmissao)/1024;
	}
	
	String getProtocoloString() {
		if (idProtocolo == 1) {
			return "Rotoscope";
		}
		else if (idProtocolo == 2) {
			return "Acustico";
		}
		else if (idProtocolo == 3) {
			return "Radio";
		}
		else {
			return "Outros";
		}
	}
	
	String getDescricao() {
		return "Conexao: tipoPorta=" + tipoPorta + ", protocolo=" + getProtocoloString() + ", taxaTransmissao=" + getTaxaMBps() + "MBps.";
	}
}
