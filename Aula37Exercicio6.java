import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	double x, intervalo;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor:");
	x = sc.nextDouble();
	
	if (x < 0.0 || x > 100.0) {
		System.out.println("Fora do intervalo");
	}
	
	else if (x <= 25.0) {
		System.out.println("Intervalo (0.25)");
	}
	
	else if (x <= 25.50) {
		System.out.println("Intervalo (25.50)");
	}
	
	else if (x <= 50.75) {
		System.out.println("Intervalo (50.75)");
	}
	
	else {
		System.out.println("Intervalo (75,100");
	}
	
	
	sc.close();
	
	}

}
