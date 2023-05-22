package estruturawhile;

import java.util.Scanner;

public class estruturawhile {

	public static void main(String[] args) {
		int opcao=0;
		//enquanto opcao for diferente de 99 executar conteudo
		while(opcao != 99) {
			System.out.println("Digite um valor qualquer ou 99 para sair");
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();
		}
	}

}
