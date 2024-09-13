
class Pessoa{
    private String nome, idade, id, peso, altura;

    public Pessoa(String nome, String id, String peso, String altura, String idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
class Estudante extends Pessoa{
    private String serie, matricula;

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

    public Estudante(String serie, String matricula, String nome, String idade, String id, String peso, String altura) {
        super(nome, id, peso, altura, idade);
        this.serie = serie;
        this.matricula = matricula;
    }
}
class Universitario extends Estudante{
    private String TCC;

    public Universitario(String serie, String matricula, String nome, String idade, String id, String peso, String altura, String TCC) {
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