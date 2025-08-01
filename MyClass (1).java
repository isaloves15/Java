

public class MyClass {
  public static void main(String args[]) {
    //Cálculo para empresas
    int insta = 300;
    int limp = 150;
    double manu = 499.99;
    double calculo = insta + limp + manu;
    System.out.println("Cálculo para empresas: R$" + calculo);
    
    //Cálculo de salário 
    double hora = 35;
    int dia = 8;
    double finalDia = hora * dia;
    System.out.println("Ele ganhará por dia R$" + finalDia);
    
    //Caixa de bombons
    int caixa = 27;
    int bombom = 16;
    int caixasPam = caixa * bombom;
    System.out.println("Quantidade de bombons de Pamela: " + caixasPam);
    
    //Garrafas D'água
    int garrafa = 300;
    int cx = 20;
    int vendidas = garrafa/cx;
    System.out.println("A quantidade de caixas ultilizadas foram: " + vendidas);
    
    //Cálculo para camisetas
    int estoqueinicial = 120;
    int camisetasvenda = 80;
    int novacompra = 50;
    double preco = 30.00;
    int estoqueatual = estoqueinicial - camisetasvenda + novacompra;
    double faturamento = camisetasvenda * preco;
    System.out.println("Estoque atual: " + estoqueatual);
    System.out.println("Faturamento: R$" + faturamento);
    
    //Dobro e Metade
    int isaloves = 500;
    int sla = 2;
    int half = isaloves/sla;
    int mult = isaloves * sla;
    System.out.println("O número é: " + isaloves);
    System.out.println("O seu dobro é: " + mult);
    System.out.println("A sua metade é: " + half);
  }
}