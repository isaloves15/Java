package lista2;

import java.util.Scanner;

public class Lista_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		 //Criando um vetor
        String[] frutas = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("fruta[" + i + "]: ");
            frutas[i] = sc.next();
        }
        System.out.println("------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(frutas[i]);
        }
        System.out.println("------------------------");
        
        
        

        //Vetor de números inteiros
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("numero[" + i + "]: ");
            num[i] = sc.nextInt();
        }
        System.out.println("-------------------------");
        
        System.out.println("Mostrando os valores armazenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
        System.out.println("-------------------------");
        
        
        

        //Mostrando os valores na ordem inversa
        num = new int[7];
        System.out.println("Digite 7 números:");
        for (int i = 0; i < 7; i++) {
            System.out.print("n[" + i + "]: ");
            num[i] = sc.nextInt();
        }
        System.out.println("Ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.println(num[i]);
        }
        System.out.println("-------------------------");
        
        
        

        //Maiores que 100
        num = new int[10];
        System.out.println("Digite 10 números (verificando > 100):");
        for (int i = 0; i < 10; i++) {
            System.out.print("n[" + i + "]: ");
            num[i] = sc.nextInt();
            if (num[i] > 100) {
                System.out.println(num[i] + " -> maior do que 100");
            }
        }
        System.out.println("-------------------------");
        
        
        

        //Procurando um valor no vetor
        num = new int[8];
        System.out.println("Digite 8 números para o vetor de busca:");
        for (int i = 0; i < 8; i++) {
            System.out.print("n[" + i + "]: ");
            num[i] = sc.nextInt();
        }
        System.out.print("Digite o número a ser procurado: ");
        int busca = sc.nextInt();
        int enc = 0;
        for (int i = 0; i < 8; i++) {
            if (num[i] == busca) {
                enc = 1;
            }
        }
        if (enc == 1) {
            System.out.println(busca + " existe no vetor.");
        } else {
            System.out.println(busca + " não existe no vetor.");
        }
        System.out.println("-------------------------");
        
        
        

        //Nome e idade de 5 pessoas
        frutas = new String[5];
        num = new int[5];
        System.out.println("Digite nome e idade de 5 pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome[" + i + "]: ");
            frutas[i] = sc.next();
            System.out.print("Idade[" + i + "]: ");
            num[i] = sc.nextInt();
        }
        System.out.println("Mostrando nomes e idades:");
        for (int i = 0; i < 5; i++) {
            System.out.println(frutas[i] + " tem " + num[i] + " anos.");
        }
        System.out.println("-------------------------");
        
        

        
        //Identificação de idade
        num = new int[10];
        System.out.println("Digite 10 idades:");
        for (int i = 0; i < 10; i++) {
            System.out.print("idade[" + i + "]: ");
            num[i] = sc.nextInt();
            if (num[i] < 18) {
                System.out.println("Você é menor de idade (idade: " + num[i] + ").");
            }
        }
        System.out.println("-------------------------");
        
        

        
        //Aumento em massa
        num = new int[7];
        System.out.println("Digite 7 salários (inteiros) para verificar aumento:");
        for (int i = 0; i < 7; i++) {
            System.out.print("salario[" + i + "]: ");
            num[i] = sc.nextInt();
            if (num[i] <= 2500) {
                System.out.println("Você receberá um aumento.");
            }
        }
        System.out.println("-------------------------");

    

		
		
		
		
		

	}

}
