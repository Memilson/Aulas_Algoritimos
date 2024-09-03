class Universitario extends Estudante{
    private String TCC;

    public Universitario(String serie, String matricula, String nome, String idade, String id, String peso, String altura) {
        super(serie, matricula, nome, idade, id, peso, altura);
        this.TCC = TCC;
    }

    public String getTCC() {
        return TCC;
    }

    public void setTCC(String TCC) {
        this.TCC = TCC;
    }
}
