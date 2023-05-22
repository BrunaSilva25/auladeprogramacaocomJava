package estruturawhile;

import java.util.Scanner;

public class estruturawhiledois {

	public static void main(String[] args) {
		// criei variavel do tipo inteiro
		int opcao;
		// mesmo fluxo do outra classe  com while porem é feito la no final
		//no "do" diferente do while entra primeiro no codigo pra depois comparar
		do {
			System.out.println("Digite um valor qualquer ou 99 para sair");
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();
		}while(opcao != 99); 
			
			
		}
		/**
		 * NESSE EXEMPLO ELE VAI REPETIR SOZINHO MUITAS VEZES ATE 99
		 * int opcao =0;
		 * do {
			System.out.println("Digite um valor qualquer ou 99 para sair");
			opcao++;
			//OPCAO + 1 E ASSIM SUCESSIVAMENTE ATE 99
		}while(opcao != 99); 
			
			
		}
		 * 
		 * **/
	
	}


