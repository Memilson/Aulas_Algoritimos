package AT1;
import java.util.ArrayList;
import java.util.List;

public class saladejogo {
    private static final List<questao> perguntasRespostasEasy = List.of(
            new questao("Qual é a capital da França?", "Paris"),
            new questao("Qual é o maior planeta do sistema solar?", "Júpiter"),
            new questao("Quem escreveu 'Dom Casmurro'?", "Machado de Assis"),
            new questao("Em que ano o homem pisou na Lua pela primeira vez?", "1969"),
            new questao("Qual o elemento químico com símbolo 'O'?", "Oxigênio"),
            new questao("Quem pintou a Mona Lisa?", "Leonardo da Vinci"),
            new questao("Qual é o rio mais longo do mundo?", "Nilo"),
            new questao("Qual é o animal mais rápido do mundo?", "Guepardo"),
            new questao("Quantos continentes existem?", "Sete"),
            new questao("Qual é a moeda do Japão?", "Iene")
    );

    private static final List<questao> perguntasRespostasMedium = List.of(
            new questao("Qual é a capital da Alemanha?", "Berlim"),
            new questao("Qual é o segundo maior planeta do sistema solar?", "Saturno"),
            new questao("Quem escreveu 'O Pequeno Príncipe'?", "Antoine de Saint-Exupéry"),
            new questao("Em que ano ocorreu a queda do Muro de Berlim?", "1989"),
            new questao("Qual o elemento químico com símbolo 'Fe'?", "Ferro"),
            new questao("Quem pintou 'A Última Ceia'?", "Leonardo da Vinci"),
            new questao("Qual é o maior oceano do mundo?", "Pacífico"),
            new questao("Qual é o animal terrestre mais pesado?", "Elefante"),
            new questao("Quantos estados existem no Brasil?", "26"),
            new questao("Qual é a moeda oficial da Suíça?", "Franco Suíço")
    );

    private static final List<questao> perguntasRespostasHard = List.of(
            new questao("Qual é a capital da Eslováquia?", "Bratislava"),
            new questao("Qual é o planeta mais quente do sistema solar?", "Vênus"),
            new questao("Quem escreveu 'Em Busca do Tempo Perdido'?", "Marcel Proust"),
            new questao("Em que ano foi assinada a Magna Carta?", "1215"),
            new questao("Qual o elemento químico com símbolo 'Hg'?", "Mercúrio"),
            new questao("Quem pintou 'Guernica'?", "Pablo Picasso"),
            new questao("Qual é a montanha mais alta do mundo, se medida da base até o topo?", "Mauna Kea"),
            new questao("Qual é o mamífero que passa a maior parte de sua vida no oceano?", "Baleia Azul"),
            new questao("Quantos músculos existem no corpo humano?", "650"),
            new questao("Qual é a moeda oficial da Dinamarca?", "Coroa Dinamarquesa")
    );

    public static List<questao> getPerguntasRespostasEasy() {
        return perguntasRespostasEasy;
    }

    public static List<questao> getPerguntasRespostasMedium() {
        return perguntasRespostasMedium;
    }

    public static List<questao> getPerguntasRespostasHard() {
        return perguntasRespostasHard;
    }

    public static List<questao> getPerguntasRespostasGeral() {
        List<questao> geral = new ArrayList<>();
        geral.addAll(perguntasRespostasEasy);
        geral.addAll(perguntasRespostasMedium);
        geral.addAll(perguntasRespostasHard);
        return geral;
    }
}
