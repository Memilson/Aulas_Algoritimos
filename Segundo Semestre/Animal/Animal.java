package Animal;

// Classe base Animal
public class Animal {
    // Atributo nome
    private String nome;

    // Construtor da classe Animal
    public Animal(String nome) {
        this.nome = nome;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método fazerSom que pode ser sobrescrito
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

// Classe derivada Pato que herda de Animal
class Pato extends Animal {

    // Construtor da classe Pato
    public Pato(String nome) {
        super(nome);  // Chama o construtor da classe base Animal
    }

    // Sobrescrição do método fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O pato faz quack");
    }
}
