package Lista24;

public class Produto4 {
	 private String nome;
	    private double preco;

	    public String getNome() { return nome; }
	    public void setNome(String n) { nome = n; }

	    public double getPreco() { return preco; }
	    public void setPreco(double p) { preco = p; }

	    public void mostrarInfo() {
	        System.out.println("Produto: " + nome);
	        System.out.println("Preço: R$ " + preco);
	    }
	
	

}
