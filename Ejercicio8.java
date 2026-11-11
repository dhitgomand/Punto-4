import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scannernotas=new Scanner(System.in);
        System.out.print("Introduzca las 3 notas");
        Float nota1=scannernotas.nextFloat();
        Float nota2=scannernotas.nextFloat();
        Float nota3=scannernotas.nextFloat();
        Float media=(nota1+nota2+nota3)/3;
        System.out.printf("Tienes un %.2f de media \n", media);
        if(media<5){
            System.out.println("Tienes un insuficiente");
        }
        else if(media<7){
            System.out.println("Tienes un suficiente");
        }
        else if(media<9){
            System.out.println("Tienes un notable");
        }
        else{
            System.out.println("Tienes un sobresaliente");
        }
    }
}
