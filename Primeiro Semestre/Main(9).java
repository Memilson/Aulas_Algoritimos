public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, num1 = 0, num2=0, num3=0, num4=0;      
                

        do {
            System.out.println("Informe um numero: ");
            num = ler.nextInt();
            if(num>=0&&num<=25){
                num1++;
            }
            else if (num>=26&&num<=50){
                num2++;
            }
            else if(num>=51&&num<=75){
                num3++;
            }
            else if(num>=76&&num<=100){
               num4++;
            }
            else if(num>100){
                System.out.println("Invalido.");
            }
        }
        while(num>=0);
        
        System.out.println("Resultado, ");
        System.out.println("0 a 25: " + num1);
        System.out.println("26 a 50: " + num2);
        System.out.println("51 a 75: " + num3);
        System.out.println("76 a 100: " + num4);
        
        
        
        
        
    }
    
}