package AT1;

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
    public static class maca extends Produto{
        public maca(String Nome, double Preco, int Quantidade) {
            super(Nome, Preco, Quantidade);
        }
    }
    public static class banana extends Produto{
        public banana(String Nome, double Preco, int Quantidade) {
            super(Nome, Preco, Quantidade);
        }
    }
    public static class uva extends Produto{
        public uva(String Nome, double Preco, int Quantidade) {
            super(Nome, Preco, Quantidade);
        }
    }
    // Adicionei frutas como Produtos
    public static void main(String[] args) {
        maca maca = new maca("Maca", 4.4, 50);
        banana banana = new banana("Banana", 7.5, 20);
        uva uva = new uva("Uva", 1.5, 10);
        System.out.println("Nome " + maca.getNome() );
        System.out.println("Preco R$" + maca.getPreco());
        System.out.println("Quantidade " + maca.getQuantidade());

        System.out.println("Nome " + banana.getNome() );
        System.out.println("Preco R$" + banana.getPreco());
        System.out.println("Quantidade " + banana.getQuantidade());

        System.out.println("Nome " + uva.getNome() );
        System.out.println("Preco R$" + uva.getPreco());
        System.out.println("Quantidade " + uva.getQuantidade());
    }
}

/*
1)Cada objeto tem seu próprio conjunto de atributos e mantém seu próprio estado.
A criação de múltiplos objetos permite representar diferentes entidades com a mesma estrutura,
mantendo independência entre as instâncias

2) Para retirar valores privados e torna-los publicos na classe, sendo modificados ou acessados pelas regras,
pre estabelecidas

*/