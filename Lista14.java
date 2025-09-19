package lista2;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		//Contador
		for(int con = 1; con <= 10; con++) {
			System.out.println(con);
		}
		System.out.println("------------------------");
		
		
		
		
		//Somando números de 1 a 100
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 100: " + soma);
        System.out.println("------------------------");
        
        
        

        //Imprimir números pares de 1 a 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        
        
        

        //Tabuada
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("------------------------");
        
        
        

        //Contar números divisíveis por 3 de 1 a 50
        int contador = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: " + contador);
        System.out.println("------------------------");

        
        
        
        //Imprimir números ímpares de 1 até N
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        
        
        

        //Multiplicação de 5 valores informados
        int mult = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = sc.nextInt();
            mult *= valor;
        }
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("------------------------");
        
        
        

        //Premiação da empresa (10 funcionários)
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite os anos de empresa do funcionário " + i + ": ");
            int anos = sc.nextInt();
            if (anos > 10) {
                System.out.println("Parabéns! Você irá receber um prêmio!!");
            } else {
                System.out.println("Quase lá...");
            }
         }
        
        
        
        
        
        
        
     }

   }


