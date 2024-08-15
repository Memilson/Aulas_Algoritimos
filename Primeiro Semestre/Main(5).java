import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ipi = 0.25;
        double valorpc1, valorpc2, qntpc1, qntpc2, total;
        String codpc1, codpc2;
        Scanner ler = new Scanner(System.in);

        System.out.print("Qual é o código da peça 1? ");
        codpc1 = ler.next();

        System.out.print("Qual é o código da peça 2? ");
        codpc2 = ler.next();

        System.out.print("Qual é o valor da peça 1? ");
        valorpc1 = ler.nextDouble();

        System.out.print("Qual é o valor da peça 2? ");
        valorpc2 = ler.nextDouble();

        System.out.print("Qual é a quantidade da peça 1? ");
        qntpc1 = ler.nextDouble();

        System.out.print("Qual é a quantidade da peça 2? ");
        qntpc2 = ler.nextDouble();

        total = (valorpc1 * qntpc1 + valorpc2 * qntpc2) * (ipi + 1);

        System.out.println("O que foi comprado? Código da peça 1: " + codpc1 + ", Código da peça 2: " + codpc2 + ", O valor total é: " + total);
    }
}