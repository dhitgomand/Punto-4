import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Integer puntuacion = 0;
        Scanner salida = new Scanner(System.in);
        String resultado;

        System.out.println("CUESTIONARIO DE 2º DE BACHILLERATO");

        // 1
        System.out.println("1. ¿Quién escribió El árbol de la ciencia? \n a) Pío Baroja \n b) Unamuno \n c) Lorca");
        resultado = salida.next();
        switch (resultado) {
            case "a":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "b":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 2
        System.out.println("\n2. ¿En qué año comenzó la Guerra de la Independencia en España? \n a) 1805 \n b) 1808 \n c) 1812");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 3
        System.out.println("\n3. ¿Cuál es la derivada de f(x) = x^2? \n a) x \n b) 2x \n c) 2");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 4
        System.out.println("\n4. ¿A qué movimiento literario pertenece la Generación del 27? \n a) Romanticismo \n b) Vanguardismo \n c) Realismo");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 5
        System.out.println("\n5. ¿En qué orgánulo celular se realiza la respiración aerobia? \n a) Ribosoma \n b) Mitocondria \n c) Cloroplasto");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 6
        System.out.println("\n6. ¿Quién es el máximo representante del Idealismo Alemán? \n a) Kant \n b) Hegel \n c) Nietzsche");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 7
        System.out.println("\n7. ¿Qué disolución tiene un pH menor que 7 a 25 ºC? \n a) Ácida \n b) Básica \n c) Neutra");
        resultado = salida.next();
        switch (resultado) {
            case "a":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "b":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 8
        System.out.println("\n8. ¿Cuál de los siguientes pintores pertenece al Barroco español? \n a) Picasso \n b) Velázquez \n c) Dalí");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 9
        System.out.println("\n9. ¿Cuál es el río más largo de la vertiente atlántica peninsular? \n a) Ebro \n b) Tajo \n c) Duero");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        // 10
        System.out.println("\n10. En inglés, ¿qué estructura corresponde al segundo condicional? \n a) If + present, will \n b) If + past simple, would \n c) If + past perfect, would have");
        resultado = salida.next();
        switch (resultado) {
            case "b":
                puntuacion++;
                System.out.println("¡Correcto!");
                break;
            case "a":
            case "c":
                System.out.println("No es correcto");
                break;
            default:
                System.out.println("Es imposible");
                break;
        }

        System.out.println("\n===========================");
        System.out.println("Puntuación final: " + puntuacion + " / 10");
    }
}
