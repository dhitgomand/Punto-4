import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner alturascanner=new Scanner(System.in);
        System.out.println("Introduzca la altura:");
        int h=Integer.parseInt(alturascanner.nextLine());
        float g=(float)(9.81);
        float tiempo=(float)(Math.sqrt((2*h)/g));
        System.out.printf("Tardará %.3f segundos",tiempo);
    }
}
