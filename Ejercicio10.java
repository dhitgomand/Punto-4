import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leerlineas=new Scanner(System.in);
        System.out.println("Introduce el mes de nacimiento (Primera mayúscula)");
        String mes=leerlineas.next();
        System.err.println("Introduce el día");
        Integer dia=leerlineas.nextInt();
        Integer diayear=0;
        String signo;
        switch(mes){
            case "Enero":
                diayear=dia;
                break;
            case "Febrero":
                diayear=31+dia;
                break;
            case "Marzo":
                diayear=59+dia;
                break;
            case "Abril":
                diayear=90+dia;
                break;
            case "Mayo":
                diayear=120+dia;
                break;
            case "Junio":
                diayear=151+dia;
                break;
            case "Julio":
                diayear=181+dia;
                break;
            case "Agosto":
                diayear=212+dia;
                break;
            case "Septiembre":
                diayear=243+dia;
                break;
            case "Octubre":
                diayear=273+dia;
                break;
            case "Noviembre":
                diayear=304+dia;
                break;
            case "Diciembre":
                diayear=334+dia;
                break;
            default:
                System.out.println("Mes no valido");
                leerlineas.close();
                return;
        }

        if (dia < 1 || dia > 31) {
            System.out.println("Día no válido");
            leerlineas.close();
            return;
        }

        if (diayear >= 80 && diayear <= 109) {
            signo="Aries";
        } else if (diayear >= 110 && diayear <= 140) {
            signo="Tauro";
        } else if (diayear >= 141 && diayear <= 171) {
            signo="Géminis";
        } else if (diayear >= 172 && diayear <= 203) {
            signo="Cáncer";
        } else if (diayear >= 204 && diayear <= 234) {
            signo="Leo";
        } else if (diayear >= 235 && diayear <= 265) {
            signo="Virgo";
        } else if (diayear >= 266 && diayear <= 295) {
            signo="Libra";
        } else if (diayear >= 296 && diayear <= 325) {
            signo="Escorpio";
        } else if (diayear >= 326 && diayear <= 355) {
            signo="Sagitario";
        } else if (diayear >= 356 || diayear <= 19) {
            signo="Capricornio";
        } else if (diayear >= 20 && diayear <= 49) {
            signo="Acuario";
        } else {
            signo="Piscis";
        }
        System.out.println("Tu signo zodiacal es " + signo);
        leerlineas.close();
    }
}