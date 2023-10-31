package Porta;
import java.util.Scanner;

public class Casa {

	String cor;
	int porta, qntdPortas, portasAbertas;
	boolean porta1, porta2, porta3;

	
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
			porta1=true;
			portasAbertas = portasAbertas + 1;
		}
		else if(porta==2) {
			System.out.println("A porta 2 foi aberta");
			porta2=true;			
			portasAbertas = portasAbertas + 1;

		} else if(porta==3) {
			System.out.println("A porta 3 foi aberta");
			porta3=true;			
			portasAbertas = portasAbertas + 1;

		}else {
			System.out.println("Valor inválido");
		}
	}
	
	public void fechar() {
		System.out.println("Que porta deseja fechar?");
		porta = scan.nextInt();
		if(porta ==1) {
			System.out.println("A porta 1 foi fechada");
			porta1=false;
			portasAbertas = portasAbertas - 1;
		}
		else if(porta==2) {
			System.out.println("A porta 2 foi fechada");
			porta2=false;
			portasAbertas = portasAbertas - 1;

		} else if(porta==3) {
			System.out.println("A porta 3 foi fechada");
			porta3=false;
			portasAbertas = portasAbertas - 1;

		}else {
			System.out.println("Valor inválido");
		}
	}
	
	public void imprimirPortas() {
		
		System.out.println("Existem " + portasAbertas + " portas.");
	}
	
}
