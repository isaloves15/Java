package Lista24;

public class Vendedor3 extends Funcionario3{
	private double comissao = 500;

    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }

    public void vender() {
        System.out.println("O vendedor realizou uma venda!");
    }
	
	
	

}
