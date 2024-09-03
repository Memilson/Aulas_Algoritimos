package Animal;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("General");
        Pato meuPato = new Pato("Donald");

        meuAnimal.fazerSom(); // Saída: O animal faz um som
        meuPato.fazerSom();   // Saída: O pato faz quack
    }
}
