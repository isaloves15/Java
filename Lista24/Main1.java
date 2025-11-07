package Lista24;

public class Main1 {

	public static void main(String[] args) {
		Cachorro1 c1 = new Cachorro1();
		c1.setNome("Hermione");
		c1.setIdade(1);
		c1.setRaca("Cavalier");
		
		
		Gato1 g1 = new Gato1();
		g1.setNome("Ron");
		g1.setIdade(1);
		g1.setCor("laranja");
		
		
		System.out.println("Mostrar as informações sobre o cachorro:");
		c1.mostrarInfo();
		c1.abanarRabo();
		System.out.println("Mostrar as informações sobre o gato:");
		g1.mostrarInfo();
		g1.subirMuro();
		
		

	}

}
