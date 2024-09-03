package Instrumento;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Guitarra com volume 5
        Guitarra minhaGuitarra = new Guitarra(5);

        // Tocar a guitarra
        minhaGuitarra.tocar(); // Saída: Tocando instrumento com volume 5

        // Afinar a guitarra
        minhaGuitarra.afinar(); // Saída: Guitarra afinada

        // Alterar o volume e tocar novamente
        minhaGuitarra.setVolume(7);
        minhaGuitarra.tocar(); // Saída: Tocando instrumento com volume 7
    }
}
