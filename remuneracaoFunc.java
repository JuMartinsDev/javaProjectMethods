package exMétodos;

import java.util.Scanner;

public class ex03Lista01 {

	static Scanner entrada = new Scanner(System.in);
	static String [] nomes = new String [4];
	static int [] sal = new int [4];
	static int [] tempServ = new int [4];
	
	public static void main(String[] args) {
		
		for(int i=0;i<4  ;i++) {
		System.out.println("Digite o nome dos funcionários: ");
		nomes[i]=entrada.next();
		System.out.println("Digite o salário de cada funcionário: ");
		sal[i]=entrada.nextInt();
		System.out.println("Digite o tempo de serviço de cada funcionário: ");
		tempServ[i]=entrada.nextInt();
		}
		
		//CHAMADA FUNCÃO
		String[] aumento=direito(nomes,sal,tempServ);
		
		//CHAMADA PARÂMETRO
		relatorio(nomes,aumento);
		
	}//MAIN

	public static String [] direito(String [] nomes, int [] sal, int [] tempServ ) {
		String []  aumento = new String [4];
		
		
		for(int i=0;i<4;i++) {
		if(tempServ[i]>3 && sal[i]<700) {
			aumento[i]="Tem direito ao aumento";
			} else {
				aumento[i]="Não tem direito ao aumento";
			}
		}
		
		return aumento;
	}

	public static void relatorio(String [] nomes, String [] aumento ) {
		
		for(int i=0;i<4;i++) {
		System.out.println("O funcionário "+nomes[i]+" "+aumento[i]);
		}
	}
}
