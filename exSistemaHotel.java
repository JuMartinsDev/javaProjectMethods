package exMétodos;

import java.util.Scanner;

public class ex09Lista03 {

	static Scanner entrada = new Scanner(System.in);
	static String[] [] arrayHDados = new String[5][2];
	static int [] [] arrayHNumero=new int [5][2];
	
	public static void main(String[] args) {
		
		String [] arrayNomeProduto = new String [] {"Refrigerante Lata","Água sem gás","Água com gás","Suco de Laranja","Barra de Chocolate"};
		double [] arrayPrecoProduto = new double [] {2.80, 1.90, 2.10,2.30,4.90};
		String [] arrayNomeServico = new String [] {"Lavanderia","Sauna","Almoço","Café da Manhã","Jantar"};
		double[] arrayPrecoServico = new double[] {10.50,60.80,42.90,35.60,60.40};
		
		for(int i=0;i<2;i++) {
		System.out.println("");
		System.out.println("---------NOME---------");
		System.out.println("Digite o nome de cliente: ");
		arrayHDados[i][0]=entrada.next();
		
		System.out.println("");
		System.out.println("---------HOSPEDAGEM---------");
		System.out.println("[S] single - [D] double - [SL] suíte luxo - [SR] suíte presidencial");
		System.out.println("Informe o tipo de acomodação: ");
		arrayHDados[i][1]=entrada.next();
		while(!(arrayHDados[i][1].equalsIgnoreCase("S")) && !(arrayHDados[i][1].equalsIgnoreCase("D") && !(arrayHDados[i][1].equalsIgnoreCase("SL") && !(arrayHDados[i][1].equalsIgnoreCase("SR"))))) {
			System.out.println("Informe o tipo de acomodação corretamente: ");
			arrayHDados[i][1]=entrada.next();}
		
		System.out.println("");
		System.out.println("---------QUARTO---------");
		arrayHNumero[i][0] = i + 1;
		System.out.println("Quarto: "+arrayHNumero[i][0]);
		
		System.out.println("");
		System.out.println("---------DIÁRIA---------");
		System.out.println("Informe a qtd de diárias: ");
		arrayHNumero[i][1]=entrada.nextInt();
		}//FOR
		
		//CHAMADA FUNÇÃO
		int [][] dadosProduto = entradaDadosProduto(arrayNomeProduto);
		int [][] dadosServico = entradaDadosServico(arrayNomeServico);
		int [] estadia = entradaRelatorio(arrayHDados, arrayHNumero);
		
		//CHAMADA PROCEDIMENTO
		gerarRelatorioGerencial(arrayHNumero,arrayHDados,dadosProduto,dadosServico,arrayPrecoProduto,arrayPrecoServico, estadia);
		
	}//MAIN	
	
	public static int [][] entradaDadosProduto(String [] arrayNomeProduto){
		int [][] dadosProduto = new int [5][5];
		
		for(int i=0;i<5;i++) {
			System.out.println("----------HOSPEDAGEM "+(i+1));
			for(int j=0;j<5;j++) {
				System.out.println("Informe a qtd consumida do Produto "+arrayNomeProduto[i]);
				dadosProduto[i][j]=entrada.nextInt();
			}
		}
		
		return dadosProduto;
	}
	
	public static int [][] entradaDadosServico(String [] arrayNomeServico){
		int [][] dadosServico = new int [5][5];
		
		for(int i=0;i<5;i++) {
			System.out.println("----------HOSPEDAGEM "+(i+1));
			for(int j=0;j<5;j++) {
				System.out.println("Informe a qtd consumida do serviço: "+arrayNomeServico[i]);
				dadosServico[i][j]=entrada.nextInt();
			}
		}
		
		return dadosServico;
	}

	public static int [] entradaRelatorio(String[] [] arrayHDados, int [] [] arrayHNumero) {
		int [] estadia = new int [4];
		
		for(int i=0;i<5;i++) {
		if(arrayHDados[i][1].equals("S")) {
			estadia[i]=arrayHNumero[i][1]*245;
		} else if(arrayHDados[i][1].equals("D")) {
			estadia[i]=arrayHNumero[i][1]*280;
		} else if(arrayHDados[i][1].equals("SL")) {
			estadia[i]=arrayHNumero[i][1]*310;
		} else if(arrayHDados[i][1].equals("SP")) {
			estadia[i]=arrayHNumero[i][1]*400;}
			
		}//FOR
		return estadia;
	}
	
	public static void gerarRelatorioGerencial(int [][] arrayHNumero, String [][] arrayHDados, int [][] dadosProduto, int [][] dadosServico, double [] arrayPrecoProduto, double [] arrayPrecoServico, int [] estadia) {
		int totConsProd=0, totConsServ=0,totGeral=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
		totConsProd+=dadosProduto[i][j];
		totConsServ+=dadosServico[i][j];
		} 
			totGeral=totConsProd+totConsServ+estadia[i];
	}
		
		
		
		
	}
}
