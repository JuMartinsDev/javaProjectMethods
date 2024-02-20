package exMétodos;

import java.util.Scanner;

public class exemplo02 {
	
	public static void main(String[] args) {
		//PARÂMETRO
		
		Scanner entrada = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.println("Informe o primeiro número: ");
		num1=entrada.nextInt();
		System.out.println("Informe o segundo número:");
		num2=entrada.nextInt();
		
		//chamada do procedimento com parâmetro
		adicao(num1,num2);
		
		entrada.close();
		
	}//main
	
	public static void adicao(int num1, int num2 ) {
		
		int soma = 0;
		soma=num1+num2;
		System.out.println("O resultado dessa soma é de: "+soma);
	
	
	}
	

}

