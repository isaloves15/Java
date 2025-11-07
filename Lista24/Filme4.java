package Lista24;

public class Filme4  extends Produto4{
	private String diretor;

    public String getDiretor() { return diretor; }
    public void setDiretor(String d) { diretor = d; }

    public void assistir() {
        System.out.println("Assistindo ao filme " + getNome() + " dirigido por " + diretor + ".");
    }
	
	
	

}
