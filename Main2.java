package herança;

public class Main2 {

	public static void main(String[] args) {
		Carro2 ca1 = new Carro2();
		ca1.setMarca("Fiat");
		ca1.setAno(2018);
		ca1.setPortas(4);
		
		
		System.out.println("Mostrar as informações sobre o carro:");
		ca1.exibirInfo();
		ca1.abrirMala();
		
		
		

	}

}
