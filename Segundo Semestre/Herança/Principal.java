public class Principal {
    public static void main(String[] args) {
    Estudante estudante = new Estudante("1º Ano", "12345", "João", "20", "001", "70kg", "1.75m");
    Universitario universitario = new Universitario("5º Ano", "123465", "Mauricio", "20", "0401", "706kg", "1.75m") ;
        System.out.println("Estudante:" ); estudante.reclamar();
        System.out.println("Universitario: "); universitario.reclamar();

    }
}