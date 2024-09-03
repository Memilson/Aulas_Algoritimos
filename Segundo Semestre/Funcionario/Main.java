package Funcionario;

class Main {
    public static void main(String[] args){
        Funcionario ronaldinho = new Funcionario("Ronaldinho", 4230.5);
        Gerente Benso = new Gerente("Benson", 10000.0, "Gerencia");
        Estagiario badeco = new Estagiario("Badeco", 500.0, 12);
        ronaldinho.exibirDetalhes();
        Benso.exibirDetalhes();
        badeco.exibirDetalhes();
        Benso.aumentarSalario();
        badeco.renovarContrato();
    }
}
