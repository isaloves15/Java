package lista2;

import java.util.Scanner;

public class lista9 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	//1 a 10
	int numero = 1;
	while (numero <=10) {
		System.out.println(numero);
		numero++;
	}
	
	//10 a 1 
	int num2 = 10;
	while (num2 >= 1) {
		System.out.println(num2);
		num2--;
	}
	
	
	//sequência numérica
	 int cont = 0;
     while (cont <= 100) {
         System.out.println(cont);
         cont += 5;
     }
     

     // Mostrando mensagem 5 vezes
     int msg = 1;
     while (msg <= 5) {
         System.out.println("Eu gosto de Java!");
         msg ++;
     }
     

     //Soma de 5 números digitados
     int soma = 0;
     int con = 1;
     while (con <= 5) {
         System.out.println("Digite o " + con + "º número: ");
         int num = scanner.nextInt();
         soma += num;
         con++;
     }
     System.out.println("A soma dos números é: " + soma);
     
     
     

     // Validação de senha
     System.out.println("Digite a senha: ");
     int pass = scanner.nextInt();
     while (pass != 1234) {
         System.out.println("Senha incorreta, tente novamente: ");
         pass = scanner.nextInt();
     }
     System.out.println("Senha correta! Acesso liberado!");
     
     
     

     // Contagem regressiva a partir de um número informado
     System.out.println("Digite um número inteiro positivo: ");
     int posi = scanner.nextInt();
     while (posi >= 1) {
         System.out.println(posi);
         posi--;
     }
	
	
	
	
	
	
	}

}
