package exMétodos;

import java.util.Scanner;

public class ex04Lista01 {
	
	static   Scanner entrada = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	           
	        //CHAMADA FUNÇÃO
	        int [][] cod=validacao();
	        int [] qtdCrit = criterio(cod);
	        String [] tiposCriterios = new String [] {"Sistema Parado","Grave", "Não Grave", "Dúvidas"};

	        //CHAMADA PARAMÊTRO
	        relatorio(cod);
	        
	        System.out.println("");
			System.out.println("RELATÓRIO DE CRITÉRIOS");
			for(int i=0;i<4;i++) {
				System.out.println("Critério "+tiposCriterios[i]+" - "+qtdCrit[i]);
			}	
			
			entrada.close();
	        
	    }//MAIN
	    
	    public static int [][] validacao () {

	    	int [][] cod = new int [5][3];
	    	
	    	for(int i=0;i<5;i++) {
	    		System.out.println("Informe a identificação do funcionário: ");
		    	cod[i][0]=entrada.nextInt();
		    	
		    	System.out.println("Informe qual o código do erro:");
		    	cod[i][1]=entrada.nextInt();
		    	while(cod[i][1]<1 || cod[i][1]>3) {
		    		System.out.println("Digite o código corretamente 1/2/3: ");
		    		cod[i][1]=entrada.nextInt();
		    	}
		    	
		    	System.out.println("Infome o critério do chamado: ");
		    	cod[i][2]=entrada.nextInt();
		    	while(cod[i][2]<1 || cod[i][2]>4) {
		    		System.out.println("Digite o código corretamente 1/2/3: ");
		    		cod[i][2]=entrada.nextInt();
		    	}
	    	}
	    	
	    	return cod;
	    }

	    public static void relatorio(int [][] cod) {
	    	int [] contErro = new int [3];
	    	
	    	for(int i=0; i<5; i++) {
	    	if(cod[i][1]==1) {
	    		contErro[0]++;
	    	}else {
	    		if(cod[i][1]==2) {
	    			contErro[1]++;
	    		}else {
	    			if(cod[i][1]==3) {
		    			contErro[2]++;
	    			}
	    		}
	    	}
	    }
	    	
	    	System.out.println("Número de chamados com o erro do cod 1: "+contErro[0]);
	    	System.out.println("Número de chamados com o erro do cod 2: "+contErro[1]);
	    	System.out.println("Número de chamados com o erro do cod 3: "+contErro[2]);
	    }

	    public static int [] criterio(int [][] cod) {
	    	int [] qtdCrit = new int [4];
	    	
	    	for(int i=0;i<4;i++) {
	    		if(cod[i][2]==1) {
	    			qtdCrit[0]++;
	    		}else {
	    			if(cod[i][2]==2) {
	    				qtdCrit[1]++;
	    			}else {
	    				if(cod[i][2]==3) {
	    					qtdCrit[2]++;
	    				}else {
	    					qtdCrit[3]++;
	    				}
	    			}
	    		}
	    	}
	    	
	    	return qtdCrit;
	    }
	}
