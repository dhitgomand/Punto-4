import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu número entero");
        String numero;
        numero=entrada.next();
        Boolean escapicuo=false;
        if(numero.length()>5){
            System.out.print("No se pueden números de más de 5 cifras");
        }
        else{
            if(numero.length()==4){
                if(numero.charAt(0) == numero.charAt(3) && numero.charAt(1)==numero.charAt(2)){
                    escapicuo=true;
                }
            }
            else if(numero.length()==5){
                if(numero.charAt(0) == numero.charAt(4) && numero.charAt(1)==numero.charAt(3)){
                    escapicuo=true;
                }
            }
            else if(numero.length()==3){
                if(numero.charAt(0) == numero.charAt(2)){
                    escapicuo=true;
                }
            }
            else if(numero.length()==2){
                if(numero.charAt(0)==numero.charAt(1)){
                    escapicuo=true;
                }
            }
            else{
                escapicuo=true;
            }
        }
        if(escapicuo){
            System.out.print("Es capicúo");
        }
        else{
            System.out.print("No es capicúo");
        }
    }
}
