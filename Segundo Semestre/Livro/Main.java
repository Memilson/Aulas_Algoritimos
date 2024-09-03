package Livro;

class main{
    public static void main(String[] args){
        Livro ChapeuzinhoVermelho = new Livro("Chapeuzinho Vermelho", "Sla man to sem net", 1500);
        Livro ToSemNet = new Livro("ToSemNetFATESG","Mabbel", 1969);

       ChapeuzinhoVermelho.exibirDetalhes();
       ToSemNet.exibirDetalhes();

       ChapeuzinhoVermelho.emprestarLivro();
       ChapeuzinhoVermelho.devolverLivro();

       ToSemNet.emprestarLivro();
       ToSemNet.devolverLivro();
    }
}