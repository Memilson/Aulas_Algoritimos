package Funcionario;

class Estagiario extends Funcionario {
    private int duracaoEstagio;

    public int getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public void setDuracaoEstagio(int duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }

    public Estagiario(String nome, double salario, int duracaoEstagio) {
        super(nome, salario);
        this.duracaoEstagio = duracaoEstagio;
    }
    @Override

    public void exibirDetalhes() {
        System.out.println("Nome \n" + getNome());
        System.out.println("Salario R$:" + getSalario());
        System.out.println("Duracao do estagio " + getDuracaoEstagio()+ "\n");
    }
    public void renovarContrato(){
        int renovar = 12;
        int contratoGeral = renovar + getDuracaoEstagio();
        System.out.println("O contrato foi para: " + contratoGeral + "\n");
    }
}