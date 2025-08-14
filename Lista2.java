package lista2;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		//resultado de dois números
		
		Scanner scanner = new Scanner (System.in);
		
		int nume;
		System.out.println("Informe um número: ");
		nume = scanner.nextInt();
		int numer;
		System.out.println("Informe outro número: ");
		numer = scanner.nextInt();
		int soma = nume + numer;
		int sub = nume - numer;
		int mult = nume * numer;
		int div = nume / numer;
		System.out.println("A soma desses números é: " + soma);
		System.out.println("A subtração desses números é: " + sub);
		System.out.println("A multiplicação desses números é: " + mult);
		System.out.println("A divisão desses números é: " + div);
		
		
		//Cálculo de temperatura 
		
		int cel;
		System.out.println("\n\nMe fale uma temperatura em graus Celsius: ");
		cel = scanner.nextInt();
		double fah = cel * 1.8;
		double fahr = fah + 32;
		System.out.println("A temperatura em graus Fahrenheit é: " + fahr);
		System.out.println("A temperatura em graus Celsius é: " + cel);
		
		
		//Conversor de valor
		
		double real;
		System.out.println("\n\nMe fale um valor em real: ");
		real = scanner.nextInt();
		double USA = real / 5.70;
		System.out.println("Este valor convertido em dólar é: " + USA);
		
		
		//Área do retângulo
		
		double alt;
		System.out.println("Informe o valor da altura de um retângulo: ");
		alt = scanner.nextInt();
		double base;
		System.out.println("Informe o valor da base de um retângulo: ");
		base = scanner.nextInt();
		double area = alt * base;
		System.out.println("A área desse retângulo é: " + area);
		
		
		//Conversor de idade
		
		int idad;
		System.out.println("Informe sua idade em anos: ");
		idad = scanner.nextInt();
		int meses = idad * 12;
		System.out.println("Você já viveu " + meses + " meses!");
		
		
		//Conversor de minutos para segundo
		
		double min;
		System.out.println("Fale um determinado tempo em minutos: ");
		min = scanner.nextDouble();
		double seg = min * 60;
		System.out.println("Isso da um total de " + seg + "segundos!");
		
		
		//Custo da compra
		
		double product;
		System.out.println("Informe o preço de um produto: ");
		product = scanner.nextDouble();
		int quant;
		System.out.println("Agora, informe quantos produtos foram comprados: ");
		quant = scanner.nextInt();
		double custo = product * quant;
		System.out.println("O custo total foi: " + custo);
		
		
		//Divisão de uma conta de restaurante
		
		double check;
		System.out.println("Informe o valor da conta do restaurante: ");
		check = scanner.nextDouble();
		System.out.println("Quantas pessoas estão dividindo está conta: ");
		int pessoas;
		pessoas = scanner.nextInt();
		double pagar = check / pessoas;
		System.out.println("cada pessoa deve pagar R$: " + pagar);
		
		
		//Cálculo de troco
		
		double compra;
		System.out.println("Informe o valor da sua compra: ");
		compra = scanner.nextDouble();
		System.out.println("Qual foi o valor pago por ela: ");
		double pago;
		pago = scanner.nextDouble();
		double troco = pago - compra;
		System.out.println("O troco é R$: " + troco);
		
	}

}
