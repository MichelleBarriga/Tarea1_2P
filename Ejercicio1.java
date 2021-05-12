

public class Ejercicio1
{
    public int ejercicio1(int num){
        int numero=1;
        int incremento=0;
        int contador=0;
        while (contador<num){
            if(incremento<3){
                numero=numero+incremento;
                incremento++;
                contador++;
                System.out.println(numero);
            }else{
                while(incremento>1){
                    numero=numero+incremento;
                    incremento--;
                    contador++;
                    System.out.println(numero);
                }
            } 
        }
        return numero;
    }
    
            
}
