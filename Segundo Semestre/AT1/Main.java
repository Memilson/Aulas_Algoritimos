package AT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showdomeiao jogo = new showdomeiao();
        Scanner selecionarQuestao = new Scanner(System.in);
        System.out.println("Selecione a dificuldade");
        System.out.println("1 - Facil");
        System.out.println("2 - Media");
        System.out.println("3 - Dificil");
        switch (selecionarQuestao.nextInt()) {
            case 1:
                jogo.playroomEasy();
                break;
            case 2:
                jogo.playroomMedium();
                break;
            case 3:
                jogo.playroomHard();
                break;
            case 4:
                jogo.playroomGeral();
                break;
        }
    }
}
