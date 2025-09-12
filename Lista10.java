package lista2;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		//Contador
		int num = 1;
		while (num <= 30) {
			System.out.println(num);
			num++; 
		}
		System.out.println("--------------------");
		
		
		
		//Soma de números digitados
		int c1 = 1;
		int som = 0;
		
		while (c1 <= 3) {
			System.out.println("Digite um número da sua escolha " +c1+ ":" );
			int numero = sc.nextInt();
			som = som + numero;
			c1++;
		}
		System.out.println("A soma desses números é: "+som);
		System.out.println("--------------------");
		
		
		
		//Multiplicação de números digitados
		int co = 1;
		int mult = 1;
		
		while (co <= 5) {
			System.out.println("Digite o número " +co+ ":" );
			int numero = sc.nextInt();
			mult = mult * numero;
			co++;
		}
		System.out.println("A multiplicação é: "+mult);
		System.out.println("--------------------");
		
		
		
		//Contar até o número informado
		System.out.println("Digite um número para contar até ele: ");
		int numero4 = sc.nextInt();
		int cont4 = 1;
		while (cont4 <= numero4) {
		    System.out.println(cont4);
		    cont4++;
		}
		System.out.println("--------------------");
		
		
		
		//Somar os números de 1 a 5
		int cont5 = 1;
		int soma5 = 0;
		while (cont5 <= 5) {
		    soma5 += cont5;
		    cont5++;
		}
		System.out.println("A soma dos números de 1 a 5 é: " + soma5);
		System.out.println("--------------------");


		
		//Tabuada
		System.out.println("Digite um número para ver a tabuada: ");
		int numero6 = sc.nextInt();
		int cont6 = 1;
		while (cont6 <= 10) {
		    System.out.println(numero6 + " x " + cont6 + " = " + (numero6 * cont6));
		    cont6++;
		}
		System.out.println("--------------------");
		
		
		

	}

}
