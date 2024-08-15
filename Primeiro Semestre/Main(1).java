import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double velocidade, distancia, dias;
        velocidade = 5.04;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual a distancia em km q ele ira percorrer?");
        distancia = ler.nextDouble();
        dias = distancia / velocidade / 24;
        System.out.println("Ele ira levar " + dias + " dias para chegar à Montanha da Perdição.");
    }
}