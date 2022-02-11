import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double pi, raio, area;
		pi = 3.14159;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.printf("Digite o valor do raio: %n");
		raio = sc.nextDouble();
		
		sc.close();
		
		area = Math.pow(raio, 2) * pi;
		
		System.out.printf("A area desse circulo é: %.4f", area);

	}

}
