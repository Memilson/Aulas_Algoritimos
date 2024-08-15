import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    String ent, dia, mes, ano, dataformatada;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o data da seguinte forma (dd/MM/yyyy)");
		ent = ler.next();
		
		dia = ent.substring(0,2);
		mes = ent.substring(2,4);
		ano = ent.substring(4);
		
		dataformatada = dia + "/" + mes + "/" + ano;
		System.out.println(dataformatada);
	}
}
