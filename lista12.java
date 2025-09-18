package lista2;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
	
		/*Contador*/
		System.out.println("--------------------");
		int co = 10;
		do {
			System.out.println(co);
			co++;
		}while (co <= 30);
		System.out.println("--------------------");
		
		
		/*Adivinhação de número*/
		System.out.println("--------------------");
		int  num;
		do {
			System.out.println("Digite um número da sua preferência: ");
			num = scanner.nextInt();
		}while(num != 5);
		System.out.println("--------------------");
		
		
		
		
		/*Verificação de peso na mala*/
		System.out.println("--------------------");
		int mala;
		do {
			System.out.println("Digite o peso da mala(kg)");
			mala = scanner.nextInt();
			if(mala > 23){
				System.out.println("Peso excedido");
			}else {
				System.out.println("Peso aceito");
			}
		}while(mala > 23);
		System.out.println("--------------------");
		
		
		
		
		/*Varificar págs lidas*/
		System.out.println("--------------------");
		int sem = 1;
		int totalPg = 0;
		do {
			System.out.println("Quantos páginas você leu hoje?");
			int livro = scanner.nextInt();
			totalPg = totalPg + livro;
			sem++;
		}while (sem <= 7);
		System.out.println("Você leu "+ totalPg + " páginas essa semana");
		System.out.println("--------------------");
		
		
		
		/*Testar código*/
		System.out.println("--------------------");
		int codigo;
        do {
            System.out.print("Digite o código de acesso (3 dígitos): ");
            codigo = scanner.nextInt();

            if (codigo != 789) {
                System.out.println("Código incorreto, tente novamente.");
            }
        } while (codigo != 789);
        System.out.println("Acesso liberado!");
        System.out.println("--------------------");
		
		
		
		/*Verificar combustível*/
        System.out.println("--------------------");
        int combustivel;
        do {
            System.out.print("Digite o nível de combustível em litros: ");
            combustivel = scanner.nextInt();

            if (combustivel <= 10) {
                System.out.println("Combustível baixo!");
            }
        } while (combustivel <= 10);
        System.out.println("Combustível suficiente para viagem!");
        System.out.println("--------------------");
        
        
        
		/*Km percorridos*/
        System.out.println("--------------------");
        int distancia;
        int totalKm = 0;
        do {
            System.out.print("Digite a distância percorrida neste trecho: ");
            distancia = scanner.nextInt();

            if (distancia > 0) {
                totalKm += distancia;
            }
        } while (distancia > 0);
        System.out.println("Total de quilômetros percorridos: " + totalKm);
        System.out.println("--------------------");
		
		

	}

}
