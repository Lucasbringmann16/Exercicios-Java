import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;
		int e;

		a = sc.nextInt();
		b = sc.nextInt();
	    c = sc.nextInt();
		d = sc.nextInt();

		sc.close();

		e = (a * b) - (c * d);

		System.out.print("DIFERENÇA = ");
		System.out.println(e);

	}

}
