import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scannerhora=new Scanner(System.in);
        System.out.print("Introduce una hora por teclado");
        int hora=Integer.parseInt(scannerhora.next());
        if (hora>=6 && hora<=12){
            System.out.println("Buenos días");
        }
        else if(hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        }
        else{
            System.out.println("Buenas noches");
        }
    } 
}
