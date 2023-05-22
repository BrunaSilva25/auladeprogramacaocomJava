package estruturacondicionalaninhada;

public class estruturacondicionalaninhada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int nota= 2;
         
          if (nota>=5) {
        	  System.out.println("Aprovado");
        	  // ||retorna verdadeiro se apenas uma das expressoes e verdadeira
        	  // && retorna verdadeiro apenas se ambas as expressoes sao verdadeiras
          }else if(nota >= 3 || nota <5) {
        	  
        	  System.out.println("Faca um  Exame");
        	  
          }else {
        	  System.out.println("Reprovado");
          }
		
	}

}
