public class MyClass {
  public static void main(String args[]) {
    
    //Variáveis 
    int idade = 24; //números inteiros 
    double salario = 1.75; //números decimais
    char letra = 'J'; //letra ou siíbolo
    boolean estudante = true; //verdadeiro ou falso 
    String nome = "Juliana"; //texto 
    
    System.out.println(idade);
    System.out.println("Minha idade é " + idade);
    System.out.println("O salário é " + salario);
    System.out.println("Minha letra é " + letra);
    System.out.println("Você estuda? " + estudante);
    System.out.println("Meu nome é " + nome);
    
    //Operadores aritméticos 
    int num1 = 5;
    int num2 = 10; 
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2; 
    double div = num1/num2;
    
    System.out.println("Soma " + soma);
    System.out.println("Subtração " + sub);
    System.out.println("Multiplicação " + mult);
    System.out.println("Divisão " + div);
    
    /*Cálculo da área de um retângulo*/
    /*largura*comprimento*/
    
    double largura = 7.5;
    double compri = 3.0;
    double area = largura * compri;
    System.out.println("Área " + area);
    
    //Cálculo do desconto 
    double valor = 100;
    double desconto = 15; //%
    double vaDesc = valor * (desconto / 100);
    double valorFi = valor - vaDesc;
    System.out.println ("A pagar " + valorFi);
  }
}