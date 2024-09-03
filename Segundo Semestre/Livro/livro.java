package Livro;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicaçao;
    private boolean disponivel = true ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicaçao() {
        return anoPublicaçao;
    }

    public void setAnoPublicaçao(int anoPublicaçao) {
        this.anoPublicaçao = anoPublicaçao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Livro(String titulo, String autor, int anoPublicaçao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicaçao = anoPublicaçao;
        this.disponivel = disponivel;
    }
    public void exibirDetalhes(){
        System.out.println("Titulo "+ getTitulo()+"\n");
        System.out.println("Autor: "+ getAutor());
        System.out.println("Ano publicado " + getAnoPublicaçao());
        System.out.println("Esta disponivel? " + isDisponivel());
    }
    public void emprestarLivro(){
        if (isDisponivel()){
            System.out.println("O livro  " + getTitulo() + " foi emprestado\n");
            disponivel = false;
        }
        else{
            System.out.println("O livro " + getTitulo() + "nao esta disponivel\n");
        }
    }
    public void devolverLivro(){
        if(isDisponivel() == false){
            System.out.print("O livro " + getTitulo() + " foi devolvido\n");
            disponivel = true;
        }
        else{
            System.out.println("Não a nada para devolver\n");
        }
    }
}