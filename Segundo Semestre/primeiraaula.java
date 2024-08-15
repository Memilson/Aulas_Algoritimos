import java.lang.*;

// The main method must be in a class named "Main".
public class Main {

    // Define the Carro class as a static inner class
    public static class Carro {
        private String Marca;
        private String Modelo;
        private String Nome;
        private String Peso;
        private String Acelerar;
        private String Freiar;
        private String Parar;
        private String ConsumirGasolina;

        // Constructor for the Carro class
        public Carro(String Marca, String Modelo, String Nome, String Peso) {
            this.Marca = Marca;
            this.Modelo = Modelo;
            this.Nome = Nome;
            this.Peso = Peso;
            this.Acelerar = Acelerar;
            this.Freiar = Freiar;
            this.Parar = Parar;
            this.ConsumirGasolina = ConsumirGasolina;
        }

        // Getter for Marca
        public String getMarca() {
            return Marca;
        }
        public String getPeso(){
            return Peso;
        }

        // Getter for Modelo
        public String getModelo() {
            return Modelo;
        }

        // Getter for Nome
        public String getNome() {
            return Nome;
        }

        // Getter for Peso
        public String getAcelerar() {
            return Acelerar;
        }
        public String getFreiar() {
            return Freiar;
        }
        public String getParar() {
            return Parar;
        }
        public String getConsumirGasolina() {
            return ConsumirGasolina;
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Example usage
        Carro carro = new Carro("Toyota", "Corolla", "Carro Exemplo", "1500kg");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Peso: " + carro.getPeso());
    }
}
