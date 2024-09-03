package Funcionario;

class Gerente extends Funcionario {
    private String departamento;
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome " + getNome());
        System.out.println("Salario: R$" + getSalario());
        System.out.println("Departamento " + getDepartamento() + "\n");
    }
    public void aumentarSalario(){
        double percentual = 15.5;
        double aumentoSalario = percentual * getSalario() / 10;
        System.out.println("Aumento de salario de " + percentual + "%");
        System.out.println("Salario foi para R$" + aumentoSalario + "\n");
    }
}