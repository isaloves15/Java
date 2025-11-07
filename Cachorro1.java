package herança;

public class Cachorro1 extends Animal1{
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void abanarRabo () {
		System.out.println("O cachorro da raça "+raca+ " está abanando o rabo ");
	}
	
	

}
