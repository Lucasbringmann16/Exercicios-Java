import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	int horaInicial, horaFinal, duracao;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a hora inicial");
	horaInicial = sc.nextInt();
	
	System.out.println("Digite a hora final");
	horaFinal = sc.nextInt();
	
	if (horaInicial < horaFinal) {
		duracao = (horaFinal - horaInicial);
	}
	
	else {
		duracao = (24 - horaInicial) + horaFinal;
	}
	
	System.out.printf("O jogo durou %d hora (s)", duracao);
	
	sc.close();

	}

}
