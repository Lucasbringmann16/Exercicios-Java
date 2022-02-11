import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int funcionario, horasTrabalhadas;
		double valorHora;
		double salario;
		
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.printf("Digite seu numero %n");
	   funcionario = sc.nextInt();
	   System.out.printf("Digite suas horas trabalhadas %n");
	   horasTrabalhadas = sc.nextInt();
	   System.out.printf("Informe seu valor hora %n");
	   valorHora = sc.nextDouble();
	   
	   sc.close();
	   
	   salario = (horasTrabalhadas * valorHora);
	   
	   System.out.printf("Numero %d %n", funcionario);
	   System.out.printf("Salario: R$ %.2f", salario);

	}

}
