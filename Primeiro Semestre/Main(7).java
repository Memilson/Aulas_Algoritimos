import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int limitesuperior, incremento, i;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o limite superior");
		limitesuperior = ler.nextInt();
		System.out.println("Insira o incremento");
		incremento = ler.nextInt();
		
		
		if(limitesuperior <= 0 || incremento <=0){
		    System.out.println("Os numeros tem que ser maiores que zero");
		    return;
		}
		System.out.println("Os numeros naturais vao de 0 ate " + limitesuperior + " com incremento de " + incremento);
		for (i = 0; i <= limitesuperior; i += limitesuperior){
		    System.out.println(i);
		}
	}
}
