package Porta;

import java.util.Scanner;

public class Porta {

	boolean estaAberta;
	String cor;
	int X, Y, Z;
	
	Scanner scan = new Scanner (System.in);
	
	
	public void redimensionar() {
		
		System.out.println("Insira a dimensão X: ");
		X = scan.nextInt();
			
		System.out.println("Insira a dimensão Y: ");
		Y = scan.nextInt();
	
		System.out.println("Insira a dimensão Z: ");
		Z = scan.nextInt();
	
		
	}
	
	public void abre() {
		if (estaAberta ==false) {
			System.out.println("Pronto, agora a porta está aberta");
			estaAberta = true;
		} else {
			System.out.println("A porta já está aberta");
		}
		
	}
	
	public void fechar() 	{
	if (estaAberta ==true) {
		System.out.println("Pronto, agora a porta está fechada");
		estaAberta = false;
	} else {
		System.out.println("A porta já está fechada");
	}
	}
	
	public void pintar(String cor) {
		
		this.cor = cor;
		System.out.println("Pronto, agora a porta é " + cor);
	}
	
	public void estaAberta() {
		if (estaAberta == true) {
		System.out.println("A porta está aberta");
	} else {
		System.out.println("A porta está fechada");
	}
	}
}
