package exMétodos;

import java.util.Scanner;

public class exemplo01 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//PROCEDIMENTO SEM RETORNO
		
		int opcao=0;
		
		while(opcao != 5) {
			
			System.out.println("");
			System.out.println("[1] - adição");
			System.out.println("[2] - subtração");
			System.out.println("[3] - multiplicação");
			System.out.println("[4] - divisão");
			System.out.println("[5] - sair");
			
			System.out.println("");
			System.out.println("Escolha uma opção: ");
			opcao=entrada.nextInt();
			
			switch (opcao) {
			case 1: adicao();
			break;
			case 2: subtracao();
			break;
			case 3: multiplicacao();
			break;
			case 4: divisao();
			break;
			default:
				System.out.println("Opção inválida - tente novamente");
			}//switch
		}//while		

	}//main
	
	public static void adicao() {
		int a1=0, b1=0, r1=0;
		
		System.out.println("Digite o primeiro número: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		b1=entrada.nextInt();
		
		r1=a1+b1;
		System.out.println("O resultado da operação é de: "+r1);
	}

	public static void subtracao() {
		int a1=0, b1=0, r1=0;
		
		System.out.println("Digite o primeiro número: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		b1=entrada.nextInt();
		
		r1=a1-b1;
		System.out.println("O resultado da operação é de: "+r1);
	}
	
	public static void multiplicacao() {
		int a1=0, b1=0, r1=0;
		
		System.out.println("Digite o primeiro número: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		b1=entrada.nextInt();
		
		r1=a1*b1;
		System.out.println("O resultado da operação é de: "+r1);
	}

	public static void divisao() {
		int a1=0, b1=0, r1=0;
		
		System.out.println("Digite o primeiro número: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		b1=entrada.nextInt();
		
		r1=a1/b1;
		System.out.println("O resultado da operação é de: "+r1);
	}

}
