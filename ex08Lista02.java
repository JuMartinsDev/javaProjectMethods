package exMétodos;

import java.util.Scanner;

public class ex08Lista02 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String [] produtos = {"Notebook","Computadores","Tablet","Servidores"};
		int [] metaVenda = {100,150,200,250};
		
		//CHAMADA FUNÇÃO
		int [][] vendas=leiaDados(produtos);
		int [] vendasLinha=verificarLinha(vendas);
		int [] vendasTri=verificarColuna(vendas);
		String[] resultMeta=meta(vendasLinha,vendas,metaVenda);
		
		//SAÍDA
		for(int i=0;i<4;i++) {
			System.out.println("produto  "+produtos[i]+" - "+metaVenda[i]+" - "+resultMeta[i]);
		}
		
	}//MAIN
	public static int[][] leiaDados(String[] produtos) {
		int[][] vendas = new int [4][3];
		
		for(int i=0;i<4;i++) {
			System.out.println("------------"+produtos[i]+"-------------");
			for(int j=0;j<3;j++) {
				System.out.println("Informe a qtd de "+produtos[i]+" vendidos: ");
				vendas[i][j]=entrada.nextInt();
			}
		}
		
		return vendas;
	}

	public static int[] verificarLinha(int[][] vendas){
		int[] vendasLinha = new int [4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				vendasLinha[i]+=vendas[i][j];
			}
		}
		
		
		return vendasLinha;
	}

	public static int[] verificarColuna(int[][] vendas) {
		int [] vendasTri = new int [3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				vendasTri[i]+=vendas[j][i];
			}
		}
		
		return vendasTri;
	}

	public static String[] meta(int[] vendasLinha,int[][] vendas,int[] metaVenda) {
		String [] resultMeta = new String[4];
		
		for(int i=0;i<4;i++) {
			if(vendasLinha[i]>=metaVenda[i]) {
				resultMeta[i]="Atingiu a meta";
			}else {
				resultMeta[i]="Não atingiu a meta";
			}
		}
		return resultMeta;
	}
	
}
