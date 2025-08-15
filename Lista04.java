package x;

import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Verificar maioridade
		
		System.out.println("Qual a sua idade? ");
		int idade = scanner.nextInt();
		if (idade >= 18) {
			System.out.println("Você tem " + idade + " anos e é maior de idade!");
		}else {
			System.out.println("Você tem " + idade + " anos e é menor de idade!");
		} System.out.println("\n");
		
		
		//Comparar dois números
		
	    System.out.println("Digite o primeiro numero: ");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scanner.nextDouble();
		if(num1>num2) {
	         System.out.println("o primeiro número é maior!");
		}else {
		     System.out.println("O segundo número é maior ou eles são iguais!");
			
		} System.out.println("\n");
		
		
		//Aprovação por nota
		
		double nota;
		System.out.println("Informe sua nota: ");
		nota = scanner.nextDouble();
	    if (nota >= 7) {
	         System.out.println("Aprovado! sua nota foi: " + nota);
    	} else {
	         System.out.println("Reprovado! sua nota foi: " + nota);
	    } System.out.println("\n");
	    
	    
		//Verificar número positivo
	    
	    System.out.println("Informe um numero: ");
		double numero = scanner.nextDouble();
		if (numero >0) {
			System.out.println("O numero é positivo!");
		}else {
			System.out.println("o numero é negativo!");
		} System.out.println("\n");
		
	    
		//Cálculo de frete
		
		System.out.print("Informe a distância em km: ");
        double distancia = scanner.nextDouble();
        double frete;
        if (distancia <= 50) {
            frete = 10.00;
        } else {
            frete = distancia * 0.5;
        }
        System.out.println("Valor do frete: R$ " + frete);
        System.out.println("\n");
        
	    
		//O Número é 10?
	    
        System.out.println("Informe o número: ");
		double num6 = scanner.nextDouble();
		
		if(num6 == 10) {
			System.out.println("o número é 10!");
		} else {
			System.out.println("o número não é 10...");
		} System.out.println("\n");
		
		
		//Desconto para Associados
	    
		String socio;
		System.out.println("Você é associado da loja?  ");
		socio = scanner.next();
		if(socio.equals("sim")) {
			System.out.println("Você tem um desconto! ");
		} else {
			System.out.println("Você não tem desconto... ");
		} System.out.println("\n");
			
		//Cálculo de bônus por horas extras
	    
		System.out.print("Informe o número de horas extras trabalhadas: ");
	     int horasExtras = scanner.nextInt();
	     double bonus;
	     if (horasExtras < 10) {
	            bonus = horasExtras * 20.0;
	     } else {
	            bonus = horasExtras * 15.0;
	        }
	      System.out.println("Bonus por hora extra: R$" + bonus);
		  System.out.println("\n");
		
	}

}
