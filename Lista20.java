package lista2;

public class Lista20 {

	public static void main(String[] args) {
		bomdia();
		linha();
		retangulo();
		linha();
		mult();
		linha();
		contagem();
		linha();
		meses();
		linha();
		visi(25);
		linha();
		tchau("Isa");
		linha();
		nomes("Isa Souza");
		linha();
		maior(50);
		linha();
		velocidade(20);
		linha();
		dia("Segunda");
		linha();
		estoque(10);
	}
	
	//linha
	public static void linha () {
		System.out.println("--------------------");
	}
	
	//1
	public static void bomdia() { 
		for (int i = 0; i < 5; i++) {
            System.out.println("Bom dia!");
        }
	}
	
	
	//2
	public static void retangulo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("*****");
        }
    }
	
	
	//3
	public static void mult() {
        for (int i = 5; i <= 25; i += 5) {
            System.out.println(i);
        }
    }
	
	
	
	//4
	public static void contagem() {
		for (int i = 1; i<9; i++) {
			System.out.println(i);
		}System.out.println("Pronto!");
	}
	
	
	//5
	public static void meses() {
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
	}
	
	
	
	//6
	public static void visi(int numero) {
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5.");
        } else {
            System.out.println(numero + " não é divisível por 5.");
        }
    }
	
	
	
	//7
	public static void tchau(String nome) {
        System.out.println("Até logo, " + nome + "!");
    }
	
	
	
    //8
	public static void nomes(String nomes) {
        System.out.println("Nome completo: " + nomes);
    }
	
	
	//9
	public static void maior(int numero) {
        if (numero > 100) {
            System.out.println(numero + " é maior que 100.");
        } else {
            System.out.println(numero + " não é maior que 100.");
        }
    }
	
	
	//10
	public static void velocidade(int velocidade) {
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
    }
	
	
	//11
	public static void dia(String dia) {
        System.out.println("Tenha uma ótima " + dia + "!");
    }
	
	
	//12
	public static void estoque(int quantidade) {
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
