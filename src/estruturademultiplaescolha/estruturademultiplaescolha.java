package estruturademultiplaescolha;
import java.util.Scanner;
public class estruturademultiplaescolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opcao:");
		System.out.println("1 - cadastrar aluno:");
		System.out.println("2 - cadastrar notas:");
		System.out.println("3 - Listar alunos e nota:");
		
		int numero = entrada.nextInt();
		
		switch(numero){
		case 1:
			System.out.println("Vamos cadastrar aluno");
		break;
		case 2:
			System.out.println("Vamos cadastrar nota");
		break;
		case 3:
			System.out.println("listar alunos");
		break;
		//caso digite outro numero
		 default:
			 System.out.println("o numero é invalido");
		}
		
	}

}
