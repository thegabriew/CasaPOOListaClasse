package Porta;

public class Casa {

	String cor;
	int qntdPortas = 4;
	
	public void pintar(String cor) {
		
		this.cor = cor;
		System.out.println("Pronto, agora a casa é " + cor);
	}
	
	
}
