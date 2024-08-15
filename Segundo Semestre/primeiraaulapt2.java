class Veiculo {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

class Carro extends Veiculo {
    private String modelo;

    public Carro(String marca, String modelo) {
        setMarca(marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String retornargeralessaporra() {
        return "Marca: " + getMarca() + ", Modelo: " + getModelo();
    }
}
