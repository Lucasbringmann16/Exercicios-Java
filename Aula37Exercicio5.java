import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// PROGRAMA PARA FAZER COMPRA DE PRODUTOS
		
		//PRODUTOS: ---
		
		int cachorroQuente, xsalada, xbacon, torradaSimples, refrigerante, codigo;
		double preco1, preco2, preco3, preco4, preco5, quantidade, preco, resultado;
		
		// CODIGOS: ---
		
		cachorroQuente = 1;
		xsalada = 2;
		xbacon = 3;
		torradaSimples = 4;
		refrigerante = 5;
		
		// PREÇOS ---
		
		preco = 0;
		preco1 = 4.00;
		preco2 = 4.50;
		preco3 = 5.00;
		preco4 = 2.00;
		preco5 = 1.50;
		
		// DIGITAR PRODUTO ---
						
		System.out.println("DIGITE O CÓDIGO DO PRODUTO:");
			
		Scanner sc = new Scanner(System.in);
		codigo = sc.nextInt();
		
		if (codigo == 1) {
			preco = preco1;
		}
		
		if (codigo == 2) {
			preco = preco2;
		}
		
		if (codigo == 3) {
			preco = preco3;
		}
		
		if (codigo == 4) {
			preco = preco4;
		}
		
		if (codigo == 5) {
			preco = preco5;
        }
		
		if (codigo <= 0) {
			System.out.println("Produto não existe!");
		}
		
		if (codigo > 5) {
			System.out.println("Produto não existe!");
		}
		
		// QUANTIDADE ---
		
		System.out.println("Quantos voçê quer?");
		
		Scanner sc1 = new Scanner(System.in);
		quantidade = sc1.nextDouble();
		
		// CALCULAR PREÇO ---
		
		resultado = (preco * quantidade);
		System.out.printf("Preço a pagar é R$ %.2f %n", resultado);
		
		
		
		sc.close();
		sc1.close();
	}

}
