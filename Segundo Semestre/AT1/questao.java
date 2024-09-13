package AT1;

import java.util.Scanner;

class playroom {
    private static final String[][] perguntasRespostasEasy = {
            {"Qual é a capital da França?", "Paris"},
            {"Qual é o maior planeta do sistema solar?", "Júpiter"},
            {"Quem escreveu 'Dom Casmurro'?", "Machado de Assis"},
            {"Em que ano o homem pisou na Lua pela primeira vez?", "1969"},
            {"Qual o elemento químico com símbolo 'O'?", "Oxigênio"},
            {"Quem pintou a Mona Lisa?", "Leonardo da Vinci"},
            {"Qual é o rio mais longo do mundo?", "Nilo"},
            {"Qual é o animal mais rápido do mundo?", "Guepardo"},
            {"Quantos continentes existem?", "Sete"},
            {"Qual é a moeda do Japão?", "Iene"}
    };
    private static final String[][] perguntasRespostasMedium = {
            {"Qual é a capital da Alemanha?", "Berlim"},
            {"Qual é o segundo maior planeta do sistema solar?", "Saturno"},
            {"Quem escreveu 'O Pequeno Príncipe'?", "Antoine de Saint-Exupéry"},
            {"Em que ano ocorreu a queda do Muro de Berlim?", "1989"},
            {"Qual o elemento químico com símbolo 'Fe'?", "Ferro"},
            {"Quem pintou 'A Última Ceia'?", "Leonardo da Vinci"},
            {"Qual é o maior oceano do mundo?", "Pacífico"},
            {"Qual é o animal terrestre mais pesado?", "Elefante"},
            {"Quantos estados existem no Brasil?", "26"},
            {"Qual é a moeda oficial da Suíça?", "Franco Suíço"}
    };
    private static final String[][] perguntasRespostasHard = {
            {"Qual é a capital da Eslováquia?", "Bratislava"},
            {"Qual é o planeta mais quente do sistema solar?", "Vênus"},
            {"Quem escreveu 'Em Busca do Tempo Perdido'?", "Marcel Proust"},
            {"Em que ano foi assinada a Magna Carta?", "1215"},
            {"Qual o elemento químico com símbolo 'Hg'?", "Mercúrio"},
            {"Quem pintou 'Guernica'?", "Pablo Picasso"},
            {"Qual é a montanha mais alta do mundo, se medida da base até o topo?", "Mauna Kea"},
            {"Qual é o mamífero que passa a maior parte de sua vida no oceano?", "Baleia Azul"},
            {"Quantos músculos existem no corpo humano?", "650"},
            {"Qual é a moeda oficial da Dinamarca?", "Coroa Dinamarquesa"}
    };

    public void jogar(String[][] perguntasRespostas) {
        int pontuacao = 0;
        Scanner ler = new Scanner(System.in);
        for (String[] pergunta : perguntasRespostas) {
            System.out.println(pergunta[0]);
            String respostaUsuario = ler.nextLine();
            if (respostaUsuario.equalsIgnoreCase(pergunta[1])) {
                System.out.println("Correto");
                pontuacao++;
            } else {
                System.out.println("A resposta correta é: " + pergunta[1]);
            }
            System.out.println("Você acertou " + pontuacao + " de " + perguntasRespostas.length + " perguntas.");
        }
    }

    public void playroomeasy() {
        jogar(playroom.perguntasRespostasEasy);
    }

    public void playroommedium() {
        jogar(playroom.perguntasRespostasMedium);
    }

    public void playroomhard() {
        jogar(playroom.perguntasRespostasHard);
    }
}


