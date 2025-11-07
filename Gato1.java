package herança;

public class Gato1 extends Animal1{
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void subirMuro () {
		System.out.println("O gato da cor "+cor+ " está em cima do muro ");
	}
	
	
	

}
