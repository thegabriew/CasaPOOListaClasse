package Porta;

public class Main {

	public static void main(String[] args) {
	
		Porta p1 = new Porta();
		
		//Questão porta 
		
		p1.abre();
		p1.estaAberta();
		p1.fechar();
		p1.estaAberta();
		p1.pintar("vermelho");
		
		//Questão casa

		Casa c1 = new Casa();
		c1.pintar("Azul");
		c1.abrir();
		c1.fechar();
		c1.abrir();
		c1.abrir();
		c1.imprimirPortas();
		
	}

}
