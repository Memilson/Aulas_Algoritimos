package AT1;
import java.util.List;
import java.util.Scanner;

public class showdomeiao {

    public void jogo(List<questao> perguntasRespostas) {
        int pontuacao = 0;
        Scanner ler = new Scanner(System.in);

        for (questao pergunta : perguntasRespostas) {
            System.out.println(pergunta.getQuestao());
            String respostaUsuario = ler.nextLine();
            if (respostaUsuario.equalsIgnoreCase(pergunta.getResposta())) {
                System.out.println("Correto");
                pontuacao++;
            } else {
                System.out.println("A resposta correta é: " + pergunta.getResposta());
            }
            System.out.println("Você acertou " + pontuacao + " de " + perguntasRespostas.size() + " perguntas.");
        }
    }

    public void playroomEasy() {
        jogo(saladejogo.getPerguntasRespostasEasy());
    }

    public void playroomMedium() {
        jogo(saladejogo.getPerguntasRespostasMedium());
    }

    public void playroomHard() {
        jogo(saladejogo.getPerguntasRespostasHard());
    }

    public void playroomGeral() {
        jogo(saladejogo.getPerguntasRespostasGeral());
    }
}

