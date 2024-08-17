class FormasGeometricas{
    private int Largura;
    private int Altura;

    public FormasGeometricas(int Largura, int Altura) {
        this.Largura = Largura;
        this.Altura = Altura;
    }
    public int getLargura(){
        return Largura;
    }
    public int getAltura(){
        return Altura;
    }
    public void setAltura(){
        this.Altura = Altura;
    }
    public void setLargura(){
        this.Largura = Largura;
    }
    public String Calcular(){
        int perimetro = 2 * (Largura + Altura);
        int area = Largura * Altura;
        return "Area " + area + " Perimetro " + perimetro;
    }
    public static void main(String[] args) {
        FormasGeometricas forma = new FormasGeometricas(2, 5);
        System.out.println(forma.Calcular());

    }
}