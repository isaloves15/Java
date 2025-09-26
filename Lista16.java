package lista2;

import java.util.Scanner;

public class Lista16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//Vetor de cores
		String [] cores = new String [6];
		for(int i=0; i<cores.length; i++) {
			System.out.println("cor "+i+":");
			cores[i] = sc.next();
		}
		System.out.println("------------------------");
		System.out.println("Mostrando as cores:");
		for(int i=0; i<6; i++) {
			System.out.println("cor "+i+":"+cores[i]);
		}
		System.out.println("------------------------");
		
		
		
		//Vetor de números decimais
		double [] num = new double [8];
		for(int i=0; i<num.length; i++) {
			System.out.println("número "+i+":");
			num[i] = sc.nextDouble();
		}
		System.out.println("------------------------");
		
		System.out.println("Mostrando os números:");
		for(int i=0; i<8; i++) {
			System.out.println("número "+i+":"+num[i]);
		}
		System.out.println("------------------------");
		
		
		
		//Números pares
		 int[] numeros = new int[10];
	     for (int i = 0; i < numeros.length; i++) {
	          System.out.print("Digite o número inteiro " + (i + 1) + ": ");
	          numeros[i] = sc.nextInt();
	     }
	     System.out.println("------------------------");
	     System.out.println("\nNúmeros pares digitados:");
	     for (int nu : numeros) {
	          if (nu % 2 == 0) {
	              System.out.println(nu);
	         }
	     }
	     System.out.println("------------------------");

	        
	        
		//Menores que 50
	     for (int i = 1; i <= 12; i++) {
	          System.out.print("Digite o número " + i + ": ");
	          int valor = sc.nextInt();
	          if (valor < 50) {
	              System.out.println("Menor que 50");
	          }
	    }
	    System.out.println("------------------------");
	    
	    
	    
	    //Procurando nome de vetor
	    String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome " + (i + 1) + ": ");
            nomes[i] = sc.next();
        }
        System.out.println("------------------------");
        System.out.print("Digite o nome que deseja procurar: ");
        String busca = sc.next();

        boolean enc = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) {
                enc = true;
                break;
            }
        }
        if (enc) {
            System.out.println("Nome existente!");
        } else {
            System.out.println("Nome inexistente...");
        }
        System.out.println("------------------------");
        
        
        
        
        //Produto e preço
        String[] prod = new String[4];
        double[] pre = new double[4];
        for (int i = 0; i < prod.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            prod[i] = sc.next();
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            pre[i] = sc.nextDouble();
        }System.out.println("------------------------");
        System.out.println("\nLista de produtos:");
        for (int i = 0; i < prod.length; i++) {
            System.out.println("O produto " + prod[i] + " custa R$" + pre[i]);
        }
        System.out.println("------------------------");
        
        
        
        //Verificação de nota
        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        System.out.println("\nResultado das notas:");
        for (double nota : notas) {
            if (nota < 6) {
                System.out.println(nota + " - Aluno reprovado");
            } else if (nota < 7) {
                System.out.println(nota + " - Aluno em recuperação");
            } else {
                System.out.println(nota + " - Aluno aprovado");
            }
        }

      
        //Promoção de ingressos
       
        double[] ingressos = new double[5];
        for (int i = 0; i < ingressos.length; i++) {
            System.out.print("Digite o preço do ingresso " + (i + 1) + ": ");
            ingressos[i] = sc.nextDouble();
        }
        System.out.println("\nVerificação de promoção:");
        for (double preco : ingressos) {
            if (preco > 100) {
                System.out.println("Ingresso com promoção disponível! (R$" + preco + ")");
            } 
        }
		

		
		
		
          
        

	}

}
