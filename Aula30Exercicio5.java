import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int codigo1, codigo2, numeroPecas1, numeroPecas2;
		double valorUnitario1, valorUnitario2, valorFinal;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o código do produto 1 %n");
		codigo1 = sc.nextInt();
		
		System.out.printf("Informe a quantidade de peças %n");
		numeroPecas1 = sc.nextInt();
		
		System.out.printf("Informe o valor unitario %n");
		valorUnitario1 = sc.nextDouble();
		
		System.out.printf("Informe o código do produto 2 %n");
		codigo2 = sc.nextInt();
		
		System.out.printf("Informe a quantidade de peças %n");
		numeroPecas2 = sc.nextInt();
		
		System.out.printf("Informe o valor unitario %n");
		valorUnitario2 = sc.nextDouble();
		
		
		valorFinal = (valorUnitario1 * numeroPecas1) + (valorUnitario2 * numeroPecas2);
		
		System.out.printf("valor a ser pago: %.2f", valorFinal);
		
		sc.close();
		
	}

}
