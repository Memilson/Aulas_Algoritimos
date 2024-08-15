import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inicio, fim, i, contador = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o início");
        inicio = ler.nextInt();
        System.out.println("Insira o fim");
        fim = ler.nextInt();
        i = inicio;
        if (inicio >= 0 && fim >= 0) {
            while (i <= fim) {
                System.out.println(i);
                contador++; 
                i++;
            }
            System.out.println("Quantidade de números no intervalo [" + inicio + "-" + fim + "]: " + contador);
        }
        else {
            System.out.println("Insira um número positivo");
        }
    }
}
