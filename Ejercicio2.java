

public class Ejercicio2
{
    public int sucecionPadovan(int num){
        int num1=1;
        System.out.print(num1+" ");
        int num2=1;
        System.out.print(num2+" ");
        int num3=1;
        System.out.print(num3+" ");
        
        int nuevo=0;
        
        for(int i=4; i<=num;i++){
            nuevo=num2+num1;
            System.out.print(nuevo+" ");
            num1=num2;
            num2=num3;
            num3=nuevo;
        } 
        return nuevo;
    }
}
