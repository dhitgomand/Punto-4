import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scannerhoras=new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana:");
        int horas=Integer.parseInt(scannerhoras.nextLine());
        int salario;
        if(horas<=40){
            salario=12*horas;
        }
        else{
            salario=(40*12)+((horas-40)*16);
        }
        System.out.printf("El sueldo semanal que le corresponde es de %d euros \n", salario);
    }
}
