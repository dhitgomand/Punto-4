import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu número entero");
        String numero;
        numero=entrada.next();
        if(numero.length()>5){
            System.out.print("No se pueden números de más de 5 cifras");
        }
        else{
            System.out.printf("La primera cifra del número es %s",numero.charAt(0));
        }
    }
}
