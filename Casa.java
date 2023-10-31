package Porta;
import java.util.Scanner;

public class Casa {

	String cor;
	int porta, qntdPortas;

	Scanner scan = new Scanner(System.in);
	
	public void pintar(String cor) {
		
		this.cor = cor;
		System.out.println("Pronto, agora a casa é " + cor);
	}
	
	public void abrir() {
		System.out.println("Que porta deseja abrir?");
		porta = scan.nextInt();
		if(porta ==1) {
			System.out.println("A porta 1 foi aberta");
		}
		else if(porta==2) {
			System.out.println("A porta 2 foi aberta");
		} else if(porta==3) {
			System.out.println("A porta 3 foi aberta");
		}else {
			System.out.println("Valor inválido");
		}
	}
	
	public void fechar() {
		System.out.println("Que porta deseja fechar?");
		porta = scan.nextInt();
		if(porta ==1) {
			System.out.println("A porta 1 foi fechada");
		}
		else if(porta==2) {
			System.out.println("A porta 2 foi fechada");
		} else if(porta==3) {
			System.out.println("A porta 3 foi fechada");
		}else {
			System.out.println("Valor inválido");
		}
	}
	
	public void imprimirPortas() {
		System.out.println("Existem 3 portas.");
	}
	
}
