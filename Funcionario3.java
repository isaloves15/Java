package herança;

public class Funcionario3 {
	private String nome;
	private double salarioBase;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	public void exnfo () {
		System.out.println("O nome desse funcionário é "+nome+ " e o seu salário é: R$"+salarioBase);
	}
	
	
	
	

}
