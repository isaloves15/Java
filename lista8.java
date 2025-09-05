package lista2;

import java.util.Scanner;

public class lista8 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	//dia da semana
	int dia;
	System.out.println("Digite um número de 1 até 7 para cada dia da semana:");
	dia = scanner.nextInt();
	
	switch (dia) {
	case 2: 
		System.out.println("Dia útil!");
		break;
	case 3: 
		System.out.println("Dia útil!");
		break;
	case 4: 
		System.out.println("Dia útil!");
		break;
	case 5: 
		System.out.println("Dia útil!");
		break;
	case 6: 
		System.out.println("Dia útil!");
		break;
	case 1:
		System.out.println("Final de semana!");
	    break;
	case 7:
		System.out.println("Final de semana!");
	    break;
	default:
		System.out.println("Dia inválido...");
	}
	
	
	
	//Menu de bebidas
	System.out.println("Qual a bebida que deseja? ");
	System.out.println("1 - Café");
	System.out.println("2 - Chá");
	System.out.println("3 - Suco");
	System.out.println("4 - Refrigerante");
	int beb = scanner.nextInt();
	switch(beb) {
	case 1:
		System.out.println("Pague R$5.00");
		break;
	case 2: 
		System.out.println("Pague R$3.50");
		break;
	case 3: 
		System.out.println("Pague R$4.00");
		break;
	case 4: 
		System.out.println("Pague R$4.50");
		break;
	default:
		System.out.println("Código inváido...");
	}

	
	//Tipo de veículo
	System.out.println("Qual o código do veículo? ");
	System.out.println("1 - Carro");
	System.out.println("2 - Moto");
	System.out.println("3 - Caminhão");
	int vei = scanner.nextInt();
	switch(vei) {
	case 1:
		System.out.println("Leve");
		break;
	case 2: 
		System.out.println("Motocicleta");
		break;
	case 3: 
		System.out.println("Pesado");
		break;
	default:
		System.out.println("Veículo inválido...");
	}
	
	
	//Escolha do plano de asssinatura 
	System.out.println("Escolha o seu plano de assinatura");
	System.out.println("1 - Básico");
	System.out.println("2 - Intermediário");
	System.out.println("3 - Premium");
	int ass = scanner.nextInt();
	switch(ass) {
	case 1:
		System.out.println("Acesso limitado");
		break;
	case 2: 
		System.out.println("Acesso padrão + suporte");
		break;
	case 3: 
		System.out.println("Acesso total + suporte prioritário");
		break;
	default:
		System.out.println("Plano inválido");
	}
	
	
	//seleção de mês 
	int mes;
	System.out.println("Digite um número de 1 até 12 para cada mês do ano:");
	mes = scanner.nextInt();
	
	switch (mes) {
	case 12: 
		System.out.println("Verão!");
		break;
	case 1: 
		System.out.println("Verão!");
		break;
	case 2: 
		System.out.println("Verão!");
		break;
	case 3: 
		System.out.println("Outono!");
		break;
	case 4: 
		System.out.println("Outono!");
		break;
	case 5:
		System.out.println("Outono!");
	    break;
	case 6:
		System.out.println("Inverno!");
	    break;
	case 7:
		System.out.println("Inverno!");
	    break;
	case 8:
		System.out.println("Inverno!");
	    break;
	case 9:
		System.out.println("Primavera!");
	    break;
	case 10:
		System.out.println("Primavera!");
	    break;
	case 11:
		System.out.println("Primavera!");
	    break;
	default:
		System.out.println("Mês inválido...");
	}
	
	
	//Tipo de ingresso 
		System.out.println("Escolha o seu ingresso:");
		System.out.println("1 - Inteira");
		System.out.println("2 - Meia");
		System.out.println("3 - VIP");
		int in = scanner.nextInt();
		switch(in) {
		case 1:
			System.out.println("Inteira - R$50.00");
			break;
		case 2: 
			System.out.println("Meia - R$25.00");
			break;
		case 3: 
			System.out.println("VIP - R$100.00");
			break;
		default:
			System.out.println("Ingresso inválido");
		}

	
	    //Escolha de idioma
		System.out.print("Digite o código do idioma: ");
		System.out.println("1 - Português");
		System.out.println("2 - Inglês");
		System.out.println("3 - Espanhol");
        int codigo1 = scanner.nextInt();

        switch (codigo1) {
        case 1:
           System.out.println("Olá!");
           break;
        case 2:
           System.out.println("Hello!");
           break;
        case 3:
          System.out.println("Hola!");
          break;
        default:
          System.out.println("Idioma inválido...");
        }	
		
		
       //Nível de acesso
        System.out.print("Digite o código de nível: ");
        System.out.println("1 - Usuário");
		System.out.println("2 - Moderador");
		System.out.println("3 - Administrador");
        int codigo = scanner.nextInt();

        switch (codigo) {
        case 1:
           System.out.println("Acesso básico!");
           break;
        case 2:
           System.out.println("Acesso básico + edição!");
           break;
        case 3:
           System.out.println("Acesso total!");
           break;
        default:
           System.out.println("Nível inválido");
        }
        
        
        //Tipo de pagamento
        System.out.print("Digite o código de pagamento: ");
        System.out.println("1 - Dinheiro");
		System.out.println("2 - Crédito");
		System.out.println("3 - Pix");
        int codigo2 = scanner.nextInt();

        switch (codigo2) {
        case 1:
         System.out.println("Pagamento em dinheiro confirmado!");
         break;
        case 2:
         System.out.println("Pagamento com cartão processado!");
         break;
       case 3:
         System.out.println("Pagamento via Pix realizado!");
         break;
       default:
         System.out.println("Método inválido...");
        } 
		
	
	
  }
}