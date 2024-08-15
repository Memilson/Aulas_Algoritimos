import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a, b, i, resultado;
		Scanner ler = new Scanner(System.in);
		for(i = 0; i <= 10; i++ ){
		System.out.println("insira o numero 1");
		a = ler.nextInt();
		System.out.println("Insira o numero 2");
		b = ler.nextInt();
System.out.printf("O resultado é %d%n", a + b);
		}
	}
}
