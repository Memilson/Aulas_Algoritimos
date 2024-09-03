package Instrumento;

// Classe base InstrumentoMusical
class InstrumentoMusical {
    // Atributo de volume
    private int volume;

    // Construtor para inicializar o volume
    public InstrumentoMusical(int volume) {
        this.volume = volume;
    }

    // Método para tocar o instrumento
    public void tocar() {
        System.out.println("Tocando instrumento com volume " + volume);
    }

    // Getter para o volume
    public int getVolume() {
        return volume;
    }

    // Setter para o volume
    public void setVolume(int volume) {
        this.volume = volume;
    }
}

// Classe derivada Guitarra
class Guitarra extends InstrumentoMusical {

    // Construtor que chama o construtor da classe base
    public Guitarra(int volume) {
        super(volume);
    }

    // Método adicional para afinar a guitarra
    public void afinar() {
        System.out.println("Guitarra afinada");
    }
}
