import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String material;
        float totalhoras, area, horas, material_preço_ton, material_qnt;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a área que foi destruída (em m²):");
        area = ler.nextFloat();
        
        System.out.println("Quantas horas diárias as pessoas irão trabalhar?");
        horas = ler.nextFloat();
        
        System.out.println("Qual material foi usado?");
        material = ler.next();
        
        System.out.println("Quantos dele em toneladas foram usados?");
        material_qnt = ler.nextFloat();
        
        totalhoras = (horas * area * material_qnt);
        
        System.out.println("O total de horas é " + totalhoras + " horas e o material usado foi " + material);
    }
}
