package exMétodos;

import java.util.Scanner;

public class ex05Lista02 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

			
			//CHAMADA FUNÇÃO
			int [] num=numRetorno();
			int [] a=resultado(num);
			
			for(int i=0;i<3;i++) {
			System.out.println("numeros "+a[i]);
			}
			
		}//MAIN
		
		public static int[] numRetorno() {
			int[] num = new int [3];
			
			for(int i=0;i<3;i++) {
			System.out.println("Digite o "+(i+1)+"° número: ");
			num[i]=entrada.nextInt();
			}
			
			return num;
		}
		
		public static int[] resultado(int [] num) {
			int [] a = new int [4];
			int aux=0;
			
			 for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                if (a[i] > a[j]) {
		                    aux = a[i];
		                    a[i] = a[j];
		                    a[j] = aux;
		                }
		            }
		        }
			
			return a;
		}

	}
