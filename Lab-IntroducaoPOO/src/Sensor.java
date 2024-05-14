public class Sensor {
	String cor;
	double resolucao;
	int framesPorSegundo;
	
	Sensor(){
		this("Azul", 512.0, 240);
	}
	
	Sensor(String cor, double resolucao, int framesPorSegundo){
		this.cor = cor;
		this.resolucao = resolucao;
		this.framesPorSegundo = framesPorSegundo;
	}
	
	double getMPixelsPorSegundo() {
		return resolucao*framesPorSegundo;
	}
	String getDescricao() {
		return "Sensor: cor=" + cor + ", resolucao=" + resolucao + "Mp, framesPorSegundo=" + framesPorSegundo + "fps, mPixelsPorSegundo=" + getMPixelsPorSegundo() + "Mpps.";
	}
}
