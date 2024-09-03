class Estudante extends Pessoa {
    private String serie, matricula;

    public Estudante(String serie, String matricula, String nome, String idade, String id, String peso, String altura) {
        super(nome, id, peso, altura, idade);
        this.serie = serie;
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void reclamar() {
        // Essa parte desse comando é apenas um meme que vi hoje no Instagram, não leve a sério por favor
        System.out.println("RECEBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}