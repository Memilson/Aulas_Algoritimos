import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double diametro = 140, premetrocub, vol, custoprodc;
        double raio = diametro / 2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o preço do metro cúbico de aço em dólares:");
        premetrocub = ler.nextDouble();
        vol = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        custoprodc = vol * premetrocub;
        
        if (custoprodc < 1000000) {
            System.out.println("Custo de produção: " + custoprodc + " dólares - Possível");
        } else if (custoprodc >= 1000000 && custoprodc < 10000000000L) {
            System.out.println("Custo de produção: " + custoprodc + " dólares - Razoável");
        } else {
            System.out.println("Custo de produção: " + custoprodc + " dólares - Impossível");
        }
    }
}
