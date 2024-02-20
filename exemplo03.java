package exMétodos;

import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao=0, num1=0, num2=0;
		
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
			
			if(opcao>0 && opcao<5) {
				System.out.println("Informe o primeiro número: ");
				num1=entrada.nextInt();
				System.out.println("Informe o segundo número: ");
				num2=entrada.nextInt();
			}
			
			switch (opcao) {
			case 1: adicao(num1,num2);
			break;
			case 2: subtracao(num1,num2);
			break;
			case 3: multiplicacao(num1,num2);
			break;
			case 4: divisao(num1,num2);
			break;
			default:
				System.out.println("Opção inválida - tente novamente");
			}//switch
		}//while		

	}
	
	public static void adicao(int num1, int num2) {
		int r1=0;
		
		r1=num1+num2;
		
		System.out.println("O resultado da operação é de: "+r1);
	}

	public static void subtracao(int num1, int num2) {
		int r1=0;
		
		r1=num1-num2;
		System.out.println("O resultado da operação é de: "+r1);
	}
	
	public static void multiplicacao(int num1, int num2) {
		int r1=0;
		
		r1=num1*num2;
		System.out.println("O resultado da operação é de: "+r1);
	}

	public static void divisao(int num1, int num2) {
		int r1=0;
		
		r1=num1/num2;
		System.out.println("O resultado da operação é de: "+r1);
	}
		
}
