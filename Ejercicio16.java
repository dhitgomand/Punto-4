import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        int puntuacion = 0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Te están siendo infiel? \n");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        switch (entrada.next()){
            case "verdadero":
                puntuacion += 3;
                break;
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("Puntuación total: " + puntuacion + " puntos");

        if (puntuacion >= 0 && puntuacion <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntuacion >= 11 && puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntuacion >= 22 && puntuacion <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza");
        }
    }
}
