package exMétodos;

import java.util.Scanner;

public class ex06Lista02 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		//CHAMADA FUNÇÃO
		char [] sexo = habSexo();
		char [] corOlhos = preencheOlhos();
		char [] corCabelo = preencheCabelo();
		int [] idade = preencheIdade();
		double mediaIdade = calculaMediaIdade(idade,corOlhos,corCabelo);
		int maiorIdade = calculaMaiorIdade(idade);
		int qtdFem = calculaQtdFem(idade,corOlhos,corCabelo,sexo);
		
		System.out.println("A média das idades é de: "+mediaIdade);
		System.out.println("A maior idade é de: "+maiorIdade);
		System.out.println("A quantidade de mulheres com especificações é de: "+qtdFem);
		
	}//MAIN
	
	public static char [] habSexo() {
		char [] sexo = new char [5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Informe o sexo (F ou M): ");
		sexo[i]=entrada.next().charAt(0);
		sexo[i]=(char) Character.toUpperCase(sexo[i]);
		
		while((sexo[i] != 'F' && sexo[i] != 'M')) {
			System.out.println("Informe o sexo corretamente (F ou M): ");
			sexo[i]=entrada.next().charAt(0);
			sexo[i]=Character.toUpperCase(sexo[i]);
			}//WHILE
		}//IF
		return sexo;
	}
	
	public static char [] preencheOlhos() {
		char [] corOlhos = new char [5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Informe a cor dos olhos (A/C): ");
		corOlhos[i]=entrada.next().charAt(0);
		corOlhos[i]=Character.toUpperCase(corOlhos[i]);
		
		while((corOlhos[i] != 'A' && corOlhos[i] != 'C')) {
			System.out.println("Informe a cor dos olhos (A/C: ");
			corOlhos[i]=entrada.next().charAt(0);
			corOlhos[i]=Character.toUpperCase(corOlhos[i]);
			}//WHILE
		}//IF
		
		return corOlhos;
	}

	public static char [] preencheCabelo() {
		char [] corCabelo = new char [5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Informe a cor do cabelo L/P/C: ");
		corCabelo[i]=entrada.next().charAt(0);
		corCabelo[i]=Character.toUpperCase(corCabelo[i]);
		
		while(corCabelo[i] != 'L' && corCabelo[i] != 'P' && corCabelo[i] != 'C') {
			System.out.println("Informe a cor do cabelo corretamente L/P/C: ");
			corCabelo[i]=entrada.next().charAt(0);
			corCabelo[i]=Character.toUpperCase(corCabelo[i]);
		}//WHILE
	}//FOR
		
		return corCabelo; 
	}

	public static int [] preencheIdade() {
		int [] idade = new int [5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Informe a idade: ");
		idade[i]=entrada.nextInt();
		}//FOR
		
		return idade;
	}

	public static double calculaMediaIdade(int[] idade, char[] corOlhos, char[] corCabelo) {
		double mediaIdade=0;
		int somaIdade=0;
		
		for(int i=0;i<5;i++) {
		if(corOlhos[i] == 'C' && corCabelo[i] =='P') {
			idade[i]++;
		}//IF
		somaIdade+=idade[i];
		
		if(idade[i]==0) {
			mediaIdade=0;
		}else {
			mediaIdade=somaIdade/idade[i];
		}
		
		}//FOR
		
		
		return mediaIdade;
	}
	
	public static int calculaMaiorIdade(int[] idade) {
		int maiorIdade=0;
		
		for(int i=0;i<5;i++) {
		if(idade[i]>maiorIdade) {
			maiorIdade=idade[i];
		}	
		}
		
		return maiorIdade;
	}
	
	public static int calculaQtdFem(int[] idade, char[] corOlhos, char[] corCabelo, char[] sexo) {
		int qtdFem = 0;
		
		for (int i = 0; i < 5; i++) {
	        if (sexo[i] == 'F' && idade[i] >= 18 && idade[i] <= 35 && corOlhos[i] == 'A' && corCabelo[i] == 'L') {
	            qtdFem++;
	        }
	    }
		
		return qtdFem;
	}
	
}
