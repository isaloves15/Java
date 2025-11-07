package herança;

public class Main4 {

	public static void main(String[] args) {
		Livro4 l = new Livro4();
        l.setNome("As vantagens de ser invisível");
        l.setPreco(30.00);
        l.setAutor("Stephen Chbosky");
        l.mostrarInfo();
        l.lerTrecho();

        System.out.println();

        Filme4 f = new Filme4();
        f.setNome("Little Woman");
        f.setPreco(54.90);
        f.setDiretor("Greta Gerwing");
        f.mostrarInfo();
        f.assistir();	
		
		
		

	}

}
