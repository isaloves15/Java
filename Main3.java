package herança;

public class Main3 {

	public static void main(String[] args) {
		Gerente3 g = new Gerente3();
        g.setNome("Doll");
        g.setSalarioBase(5000);
        g.setDepartamento("Vendas");

        g.exnfo();
        System.out.println("Salário total: R$ " + g.calcularSalario());
        g.gerenciar();

        System.out.println();

        Vendedor3 v = new Vendedor3();
        v.setNome("Isa");
        v.setSalarioBase(2000);

        v.exnfo();
        System.out.println("Salário total: R$ " + v.calcularSalario());
        v.vender();	
		
		
		
		
		
		

	}

}
