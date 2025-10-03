package lista2;

public class Lista18 {

	public static void main(String[] args) {
		apresentacao();
		apresentacao();
		separador();
		frase();
		separador();
		valores();
		separador();
		vogais();
		separador();
		desenho();
		separador();
		pares();
		separador();
		regre();
		separador();
		triangulo();
		separador();
		semana();
	}
	
	
	public static void separador ( ) {
		System.out.println("-------------------------");
	}
	
	
	
	
	
	//Apresentação
	public static void apresentacao ( ) {
		System.out.println("Isadora Bonifácio");
	}
	
	
	
	//Exibindo uma frase 
	public static void frase ( ) {
		System.out.println("O futuro depende do que você faz hoje");
	}
	
	
	//Imprimindo os valores
	public static void valores () {
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	
	//Mostrando as vogais
	public static void vogais() {
        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
        for (char v : vogais) {
            System.out.println(v);
        }
    }
	
	
	//Desenhando um quadrado
	public static void desenho () {
		for (int i = 0; i<3; i++ ) {
			System.out.println("******");
		}
	}
	
	//Imprimindo números pares 
	public static void pares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
	
	
	//Exibindo uma contagem regressiva
	public static void regre () {
		for (int i = 5; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	//Desenhando um triângulo
	 public static void triangulo() {
	     for (int i = 1; i <= 5; i++) {
	          for (int j = 1; j <= i; j++) {
	              System.out.print("* ");
	          }
	          System.out.println();
	      }
	  }
	
	
	//Mostrando os dias da semana 
	public static void semana () {
		System.out.println("Domingo");
		System.out.println("Segunda");
		System.out.println("Terça");
		System.out.println("Quarta");
		System.out.println("Quinta");
		System.out.println("Sexta");
		System.out.println("Sábado");
	}
	
	
	
	
	
	

}
