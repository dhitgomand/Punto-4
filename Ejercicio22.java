import java.util.Scanner;

public class Ejercicio22{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Integer viernes15=6660;
        String dia;
        Integer numdia=0;
        Integer hora;
        Integer minsrestantes;
        System.out.print("Introduzca qué día es hoy (de lunes a viernes) ");
        dia=entrada.next();
        System.out.print("Introduzca la hora (formato 24h) ");
        hora=entrada.nextInt();
        switch (dia){
            case "Lunes":
                numdia=1;
                break;
            case "Martes":
                numdia=2;
                break;
            case "Miércoles":
                numdia=3;
                break;
            case "Jueves":
                numdia=4;
                break;
            case "Viernes":
                numdia=5;
                break;
        }
        switch (numdia) {
            case 1:
                minsrestantes=(viernes15-(hora*60));
                break;
        
            default:
                minsrestantes=(viernes15-(((numdia-1)*24*60)+(hora*60)));
                break;
        }
        System.out.printf("Le quedan %d minutos",minsrestantes);
    }
}