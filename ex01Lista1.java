package exMétodos;

import java.util.Scanner;

public class ex01Lista1 {

	static Scanner entrada = new Scanner(System.in);
	static int acomodacao=0, qtdDias=0;
	static String nome;
	
	public static void main(String[] args) {
	
		int valor=0;
		double preco=0;
		char formPag;
		
		System.out.println("Informe seu nome: ");
		nome=entrada.next();
		
		System.out.println("");
		System.out.println("TIPOS DE ACOMODAÇÔES");
		System.out.println("[1] - standard");
		System.out.println("[2] - luxo");
		System.out.println("[3] - super luxo");
		System.out.println("");
		System.out.println("Escolha um tipo de acomodação: ");
		acomodacao=entrada.nextInt();
		
		System.out.println("");
		System.out.println("Informe a quantidade de diárias: ");
		qtdDias=entrada.nextInt();
		
		System.out.println("Digite a forma de pagamento (V/P): ");
		formPag=entrada.next().charAt(0);
		formPag=Character.toUpperCase(formPag);
		
		
		//CHAMADA FUNÇÃO
		valor=tipoAcomodacao(valor);
		preco=valorFinal(formPag, preco);
		
		System.out.println("O valor final é de: "+valor);
		
		entrada.close();
	}//MAIN
	
	public static int tipoAcomodacao(int valor) {
		
		switch(acomodacao) {
		case 1: valor=380*qtdDias;
		break;
		case 2: valor=450*qtdDias;
		break;
		case 3: valor=560*qtdDias;
		break;
		default:
            System.out.println("Tipo de acomodação inválido.");
            System.exit(0);
		}
		return valor;
	}

	public static double valorFinal(char formPag, double valor) {
		double preco=0;
		
		if(formPag=='V') {
			preco=valor;
		}else if(formPag=='P') {
			preco=valor-(valor*0.10);
		}else {
            System.out.println("Forma de pagamento inválida.");
            System.exit(0);
		}
		
		return preco;
	}

   
}
