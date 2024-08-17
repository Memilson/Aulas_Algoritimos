class Robo{
    private String status;
    private int speed;
    private float temperatura;

    public Robo(String status, int speed, float temperatura){
        this.status = status;
        this.speed = speed;
        this.temperatura = temperatura;
    }
    public String getStatus(){
        return status;
    }
    public int getSpeed(){
        return speed;
    }
    public float getTemperatura(){
        return temperatura;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }
    public String Checagem() {
        if (temperatura >= 660) {
            speed = 5;
            status = "Retornando para casa";
            return "Velocidade alterada pra 5 e retornando para casa";
        }
        else{
            return "Inalterado";
        }
    }
    public static class AnimatronicoXumbante extends Robo{
        public AnimatronicoXumbante(String status, int speed, float temperatura){
            super(status, speed, temperatura);
            this.setStatus(status);
            this.setSpeed(speed);
            this.setTemperatura(temperatura);

        }
    }

    public static void main(String[] args){
        Robo robo = new Robo("Ativo", 10, 650);
        AnimatronicoXumbante xumbante = new AnimatronicoXumbante("Ativo",10, 660);
        System.out.println(robo.Checagem());
        System.out.println("Speed "+ robo.getSpeed());
        System.out.println("Status "+ robo.getStatus());
        System.out.println("Temperatura " + robo.getTemperatura());
        System.out.println(xumbante.Checagem());
        System.out.println("Speed "+ xumbante.getSpeed());
        System.out.println("Status "+ xumbante.getStatus());
        System.out.println("Temperatura"+ xumbante.getTemperatura());

    }
}
