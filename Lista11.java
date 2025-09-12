package lista2;

import java.util.Scanner;

public class Lista11 {

	public static void main(String[] args) {
		Scanner sa = new Scanner (System.in);
		
		
		//Contador
		int num =1;
		do {
			System.out.println(num);
			num += 2; 
		}while (num<=31);
		System.out.println("--------------------");
		
		
		//Adivinhação de número
        int numero2;
        do {
            System.out.println("Digite um número: ");
            numero2 = sa.nextInt();
        } while (numero2 != 100);
        System.out.println("Você acertou, o número é 100!");
        System.out.println("---------------------");

        
        
        // Menu interativo
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.println("Escolha: ");
            opcao = sa.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu continuar!");
            } else if (opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);
        System.out.println("Programa encerrado!");
        System.out.println("---------------------");
        
        

        //Classificação de números (5 vezes)
        int cont4 = 1;
        do {
            System.out.print("Digite o número " + cont4 + ": ");
            int n = sa.nextInt();
            if (n < 10) {
                System.out.println("Tipo A");
            } else if (n < 20) {
                System.out.println("Tipo B");
            } else {
                System.out.println("Fora da Categoria");
            }
            cont4++;
        } while (cont4 <= 5);
        System.out.println("---------------------");
        
        

        //Temperatura do forno
        int temp;
        do {
            System.out.print("Digite a temperatura do forno: ");
            temp = sa.nextInt();
            if (temp >= 200) {
                System.out.println("⚠️ Temperatura muito alta! Digite novamente.");
            }
        } while (temp >= 200);
        System.out.println("✅ Temperatura segura!");
        System.out.println("---------------------");
        
        

        //Verificação de bateria
        int bateria;
        do {
            System.out.print("Digite o nível da bateria (%): ");
            bateria = sa.nextInt();
            if (bateria <= 20) {
                System.out.println("🔋 Bateria baixa! Digite novamente.");
            }
        } while (bateria <= 20);
        System.out.println("✅ Bateria suficiente!");
        System.out.println("---------------------");
        
        

        //Deseja fazer uma conta?
        String resposta;
        do {
            System.out.print("Deseja fazer uma conta? (sim/não): ");
            resposta = sa.next();
            if (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Digite o primeiro número: ");
                int n1 = sa.nextInt();
                System.out.print("Digite o segundo número: ");
                int n2 = sa.nextInt();
                System.out.println("Resultado da soma: " + (n1 + n2));
            }
        } while (resposta.equalsIgnoreCase("sim"));
        System.out.println("Encerrado.");
        
        sa.close();
 	
	
	}	

}


