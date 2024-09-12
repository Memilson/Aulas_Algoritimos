package AT1;

import java.util.Scanner;

public class playroom {
    public void playroom() {
        int pontuacao = 0;
        Scanner ler = new Scanner(System.in);
        String[] perguntas = {
                "Qual é a capital da França?",
                "Qual é o maior planeta do sistema solar?",
                "Quem escreveu 'Dom Casmurro'?",
                "Em que ano o homem pisou na Lua pela primeira vez?",
                "Qual o elemento químico com símbolo 'O'?",
                "Quem pintou a Mona Lisa?",
                "Qual é o rio mais longo do mundo?",
                "Qual é o animal mais rápido do mundo?",
                "Quantos continentes existem?",
                "Qual é a moeda do Japão?"
        };
        String[] respostaCorreta = {
                "Paris",
                "Júpiter",
                "Machado de Assis",
                "1969",
                "Oxigênio",
                "Leonardo da Vinci",
                "Nilo",
                "Guepardo",
                "Sete",
                "Iene"
        };
        for(int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            String respostaUsuario = ler.nextLine();
        }
    }
}
