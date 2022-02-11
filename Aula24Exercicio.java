import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 30;
	        int codigo = 5290;
	        char genero = 'F';
	        
	        double preco1 = 2100.0;
	        double preco2 = 650.50;
	        double medida = 53.234567;
	    
	        System.out.printf("Produtos: %n");
	        System.out.printf("%s, cujo o preço é R$ %.2f %n", produto1, preco1);
	        System.out.printf("%s, cujo o preço é R$ %.2f %n %n", produto2, preco2);
	        System.out.printf("Registro: %d anos, código %d e genero: %s %n %n", idade, codigo, genero);
	        System.out.printf("Medida com oito casas decimais %.8f %n", medida);
	        System.out.printf("Arredondando (três casas decimais): %.3f %n", medida);
	        Locale.setDefault(Locale.US);
	        System.out.printf("Ponto decimal dos EUA: %.3f %n", medida);
	    	    
	}

}
