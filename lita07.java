package lista2;

import java.util.Scanner;

public class lita07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		//Classificação de Filme
		int movie;
		System.out.println("Informe a sua idade: ");
		movie = scanner.nextInt();
		if (movie > 70 || movie < 16) {
			System.out.println("Classificação especial! ");
		}else {
			System.out.println("Classificação regular");
		}
		
		
		
		//Promoção de Produto
		double prod;
		System.out.println("Qual o valor do produto? ");
		prod = scanner.nextDouble();
		System.out.println("Quantos exemplares do mesmo produto você pegou? ");
		int quant ;
		quant = scanner.nextInt();
		double val = prod * quant;
		double desc = val * 0.15;
		
		if (val > 200 && quant < 5) {
			System.out.println("Você irá pagar R$" + desc + " com o desconto de 15%!!");
		}else {
			System.out.println("Você irá pagar R$" + val + " sem o desconto...");
		}
		
		
		
		//Alerta de Saúde
		System.out.println("Qual a sua frequência cardíaca? ");
	     int frequencia = scanner.nextInt();
	     System.out.println("Você sente tontura? (sim/nao) ");
	     String tontura = scanner.next();

	     if (frequencia >= 100 || tontura.equalsIgnoreCase("sim")) {
	         System.out.println("Procure atendimento médico!");
	     } else {
	         System.out.println(" Sem sinais de alerta.");
	     }
	     
	     
	     
		//Participação em Concurso
	     System.out.println("Qual sua idade? ");
		 int idade = scanner.nextInt();
		 System.out.println("Você é residente do estado? (sim/nao) ");
		 String residente = scanner.next();

	     if (idade >= 18 && idade <= 30 && residente.equalsIgnoreCase("sim")) {
		     System.out.println("Elegível para o concurso!");
		 } else {
		     System.out.println("Não elegível para o concurso.");
	     }
	     
	     
	     
		//Recompensa por Desempenho
	     System.out.println("Quantos projetos você já concluiu? ");
		 int proj = scanner.nextInt();
		 System.out.println("E quantos erros você já cometeu? ");
	     int er = scanner.nextInt();
	     
	     if( proj > 10 && er < 3) {
	    	 System.out.println("Recompensa concedida!!");
	     } else { 
	    	 System.out.println("Sem recompensa...");
	     }
	     
	     
		//Autorização para Viagem
	     System.out.println("Qual a sua idade? ");
	     int idd = scanner.nextInt();
	     System.out.println("Você tem passaporte? ");
	     String passa = scanner.next();
	     
	     if (idd >= 18 && passa.equalsIgnoreCase("sim")) {
	    	 System.out.println("Viagem autorizada!");
	     }else {
	    	 System.out.println("Viagem não autorizada!");
	     }
	     
	     
	     
		//Aprovação em Curso Online
	     System.out.println("Digite a nota final (0 a 100): ");
	     int nota = scanner.nextInt();
         System.out.println("Digite o número de aulas assistidas (0 a 50): ");
         int aulasAssistidas = scanner.nextInt();

	     if (nota >= 70 && aulasAssistidas >= 40) {
	         System.out.println("Você foi aprovado!!");
	     } else {
	         System.out.println("Você foi reprovado...");
	     }
	        
	        
	        
		//Controle de Irrigação
	     System.out.println("Informe a umidade do solo: ");
	     int umi = scanner.nextInt();
         System.out.println("Informe a temperatura: ");
	     int temp = scanner.nextInt();

	     if (umi < 30 || temp > 30) {
	         System.out.println("Irrigação necessária!!");
	     } else {
	         System.out.println("Irrigação não necessária....");
	     }
	     
	     
	     
		//Inscrição em Feira Profissional
	     System.out.println("Qual a sua idade? ");
	     int id = scanner.nextInt();
	     System.out.println("Você possui experiência prévia? (sim/nao) ");
	     String pre = scanner.next();

	     if (id >= 20 && id <= 40 && pre.equalsIgnoreCase("sim")) {
	         System.out.println(" Inscrição aceita!");
	     } else {
	         System.out.println(" Inscrição não permitida.");
	     }
	        
	     

	}

}
