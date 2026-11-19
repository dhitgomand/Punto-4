import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu número");
        Integer numero=entrada.nextInt();
        if(numero%2==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
        if(numero%5==0){
            System.out.println("El número es divisible entre 5");
        }
        else{
            System.out.println("El número es indivisible entre 5");
        }
    }    
}