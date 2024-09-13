package AT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        playroom jogo = new playroom();
        Scanner selecionarQuestao = new Scanner(System.in);
        System.out.println("Selecione a dificuldade");
        System.out.println("1 - Facil");
        System.out.println("2 - Media");
        System.out.println("3 - Dificil");
        switch (selecionarQuestao.nextInt()) {
            case 1:
                jogo.playroomeasy();
                break;
            case 2:
                jogo.playroommedium();
                break;
            case 3:
                jogo.playroomhard();
                break;
            default:
                break
        }
    }
}
