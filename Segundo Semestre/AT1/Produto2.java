class Produto {
    private String Nome;
    private double Preco;
    private int Quantidade;

    public Produto(String Nome, double Preco, int Quantidade) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Quantidade = Quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    public void setQuantidade(int Quantidade){
        this.Quantidade = Quantidade;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + Nome);
        System.out.println("Preço: R$" + Preco);
        System.out.println("Quantidade: " + Quantidade);
    }
    // Adicionei frutas como Produtos
    public static void main(String[] args) {
        Produto maca = new Produto("Maca", 4.4, 50);
        Produto banana = new Produto("Banana", 7.5, 20);
        Produto uva = new Produto("Uva", 1.5, 10);
        System.out.println("Informações da Maçã:");
        maca.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da Banana:");
        banana.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da Uva:");
        uva.exibirInformacoes();
    }
}

/*
1)Cada objeto tem seu próprio conjunto de atributos e mantém seu próprio estado.
A criação de múltiplos objetos permite representar diferentes entidades com a mesma estrutura,
mantendo independência entre as instâncias

2) Para retirar valores privados e torna-los publicos na classe, sendo modificados ou acessados pelas regras,
pre estabelecidas

*/