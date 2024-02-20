package exMétodos;

import java.util.Scanner;

public class ex06_2 {

	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
	
		//CHAMADA FUNÇÃO
		char [] sexo = eSexo();
		char [] corOlhos = eCorOlhos();
		char [] corCabelo = eCorCabelo();
		int [] idade = eIdade();
		int mediaIdade = cMediaIdade(corOlhos,corCabelo,idade);
		int maiorIdade = cMaioIdade(idade);
		int fem = cFem(sexo,idade,corOlhos,corCabelo);
		
		System.out.println("a a média de idade das pessoas com olhos\r\n"
				+ "castanhos e cabelos pretos é de: "+mediaIdade);
		System.out.println("a maior idade entre os habitantes é de: "+maiorIdade);
		System.out.println("a quantidade de"
				+ "indivíduos do sexo feminino com idade entre 18 e 35 anos e que tenham"
				+ "olhos azuis e cabelos louros é de: "+fem);
		
	}//MAIN
	
	public static char [] eSexo() {
		char [] sexo = new char [5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Informe seu sexo (F/M): ");
		sexo[i]=entrada.next().charAt(0);
		sexo[i]=Character.toUpperCase(sexo[i]);
		
		while(sexo[i] != 'F' && sexo[i] != 'M') {
			System.out.println("Informe seu sexo corretamente (F/M): ");
			sexo[i]=entrada.next().charAt(0);
			sexo[i]=Character.toUpperCase(sexo[i]);
		}
		}
		
		return sexo;
	}

	public static char [] eCorOlhos() {
		char [] corOlhos = new char [5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Informe a cor dos seu olhos (A/C): ");
			corOlhos[i]=entrada.next().charAt(0);
			corOlhos[i]=Character.toUpperCase(corOlhos[i]);
			
			while(corOlhos[i] != 'A' && corOlhos[i] != 'C') {
				System.out.println("Informe corretamente a cor dos seu olhos (A/C): ");
				corOlhos[i]=entrada.next().charAt(0);
				corOlhos[i]=Character.toUpperCase(corOlhos[i]);
			}
			}
			
		
		
		return corOlhos;
	}

	public static char [] eCorCabelo() {
		char [] corCabelo = new char [5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Informe a cor do seu cabelo (L/P/C): ");
			corCabelo[i]=entrada.next().charAt(0);
			corCabelo[i]=Character.toUpperCase(corCabelo[i]);
			
			while(corCabelo[i] != 'L' && corCabelo[i] != 'P' && corCabelo[i] != 'C' ) {
				System.out.println("Informe corretamente a cor do seu cabelo (L/P/C) : ");
				corCabelo[i]=entrada.next().charAt(0);
				corCabelo[i]=Character.toUpperCase(corCabelo[i]);
			}
			}
			
		
		
		return corCabelo;
	}

	public static int [] eIdade() {
		int [] idade = new int [5];
		
		for(int i=0;i<5;i++) {
		System.out.println("Informe a idade: ");
		idade[i]=entrada.nextInt();
		}//FOR
		
		return idade;
	}
	
	public static int cMediaIdade(char [] corOlhos,char [] corCabelo, int [] idade) {
		int mediaIdade =0;
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
	
	public static int cMaioIdade(int [] idade) {
		int maiorIdade=0;
		
		for(int i=0;i<5;i++) {
			if(idade[i]>maiorIdade) {
				maiorIdade=idade[i];
			}
			
		}
		
		return maiorIdade;
	}

	public static int cFem(char[]sexo, int[]idade, char[]corOlhos, char[]corCabelo) {
		int fem =0;
		
		for(int i=0;i<5;i++) {
			if(sexo[i]=='F') {
				if(idade[i]>=18 && idade[i]<=35) {
					if(corOlhos[i]=='A' && corCabelo[i]=='L') {
						fem++;
					}
					
				}
			}
			
		}
		
		return fem;
	}


}
	



