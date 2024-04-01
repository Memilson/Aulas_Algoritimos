import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	int mais = 1, menos = 2, div = 3, multi = 4, conta, a, b;

	Scanner ler = new Scanner (System.in);
	  System.out.println ("Insira um numero");
	  a = ler.nextInt(); 

	  System.out.println ("Insira outro numero");
	  b = ler.nextInt();
	  
	  System.out.println("Qual Operaçao aritimetica vc ira usar? 1-Adicao 2-Subtraçao 3-Divisao 4-Multiplicaçao");
	  conta = ler.nextInt();
	switch (conta)
	  {
	  case 1:
		System.out.println (a + b);
		break;
		case 2:System.out.println (a - b);
		break;
		case 3:if (b != 0)
		  System.out.println ((double) a / b);
		else
		  System.out.println ("Nao C) possivel dividir por zero");
		break;
		case 4:System.out.println (a * b);
		break;
		default:System.out.println ("Invalida");
	  }
  }
}
