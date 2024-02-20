package exMétodos;

import java.util.Scanner;

public class ex02Lista01 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		double imposto =0;
		 int codEstado=0, codCarga=0, codCaminhao=0, carga=0;
		
		System.out.println("Informe o código do caminhão: ");
		codCaminhao=entrada.nextInt();
		System.out.println("Informe a carga do caminhão: ");
		carga=entrada.nextInt() * 1000;
		System.out.println("Informe o código do estado: ");
		codEstado=entrada.nextInt();
		System.out.println("Informe o código da carga: ");
		codCarga=entrada.nextInt();
		
	//CHAMADA DA FUNÇÃO
	double preco=codiCarga(codCarga);
	imposto=codEstado(preco, codCaminhao);
	
	
	//SAÍDA
	for(int i=0;i<1;i++) {
	System.out.println("o preço final é de: "+(imposto));
	}

	entrada.close();
	}//MAIN
	
	public static double codiCarga(int codCarga) {
		double preco=0;
		
		if(codCarga>=1 && codCarga<=10) {
			preco=120;
		}else if (codCarga >= 11 && codCarga <= 20) {
            preco = 200;
        } else if (codCarga >= 21 && codCarga <= 30) {
            preco = 280;
        } else {
            System.out.println("Código da carga inválido!");
            return -1;
        }
		
		return preco;
	}

	public static double codEstado(double preco, int codCaminhao) {
		double imposto = 0;
		
		if(codCaminhao==1) {
			imposto=preco*0.25;
		}else if(codCaminhao==2) {
			imposto=preco*0.20;
		}else if(codCaminhao==3) {
			imposto=preco*0.15;
		}else if(codCaminhao==4) {
			imposto=preco;
		}else {
			System.out.println("Código inválido");
			System.exit(0);
		}
		
		return imposto;
	}
}
