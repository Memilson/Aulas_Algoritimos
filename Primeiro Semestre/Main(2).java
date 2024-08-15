import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, num3, num4, num5, resultado1, resultado2, resultado3, resultado4, resultado5;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o numero 1");
        num1 = ler.nextDouble();
        System.out.println("Insira o numero 2");
        num2 = ler.nextDouble();
        System.out.println("Insira o numero 3");
        num3 = ler.nextDouble();
        System.out.println("Insira o numero 4");
        num4 = ler.nextDouble();
        System.out.println("Insira o numero 5");
        num5 = ler.nextDouble();
        
        resultado1 = Math.sqrt(num1);
        resultado2 = Math.sqrt(num2);
        resultado3 = Math.sqrt(num3);
        resultado4 = Math.sqrt(num4);
        resultado5 = Math.sqrt(num5);
        
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4: " + resultado4);
        System.out.println("Resultado 5: " + resultado5);
    }
}
