import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scannerdia=new Scanner(System.in);
        System.out.print("Introduce un día de la semana");
        String dia=scannerdia.nextLine();
        String asignatura = "";
        switch(dia){
            case "Lunes":
                asignatura="historia";
                break;
            case "Martes":
                asignatura="lengua";
                break;
            case "Miércoles":
                asignatura="matemáticas";
                break;
            case "Jueves":
                asignatura="filosofía";
                break;
            case "Viernes":
                asignatura="TIC";
                break;
            default:
                asignatura = "ninguna";
                break;
        }
        System.out.printf("Te toca %s a primera hora", asignatura);
    } 
}
