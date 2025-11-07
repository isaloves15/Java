package Lista24;

public class Animal1 {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostrarInfo () {
		System.out.println("O nome do pet é "+nome+ " e a sua idade é: "+idade);
	}
	
	
	

}
