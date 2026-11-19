import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("1 - Programador junior \n 2 - Prog. senior \n 3 - Jefe de proyecto \n Introduzca el cargo del empleado (1 - 3): ");
        Integer cargoempleado=entrada.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        Integer dias=entrada.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        Integer estado=entrada.nextInt();
        Integer sueldobase=0;
        switch (cargoempleado){
            case 1:
                sueldobase=950;
                break;
            case 2:
                sueldobase=1200;
                break;
            case 3:
                sueldobase=1600;
                break;
        }
        Integer dietas=(dias*30);
        Integer sueldobruto=dietas+sueldobase;

        Integer porcentajeretencion = 0;
        if (estado == 1) {
            porcentajeretencion = 25;
        } else if (estado == 2) {
            porcentajeretencion = 20;
        }

        Float retencion = (float)sueldobruto * (porcentajeretencion / 100.0f);
        Float sueldoneto = (float)sueldobruto - retencion;

        System.out.println("----------------------------------");
        System.out.printf("│ Sueldo base %12.2f │\n", (float)sueldobase);
        System.out.printf("│ Dietas (%2d viajes) %8.2f │\n", dias, (float)dietas);
        System.out.println("----------------------------------");
        System.out.printf("│ Sueldo bruto %11.2f │\n", (float)sueldobruto);
        System.out.printf("│ Retención IRPF (%.0f%%) %6.2f │\n", (float)porcentajeretencion, retencion);
        System.out.println("----------------------------------");
        System.out.printf("│ Sueldo neto %12.2f │\n", sueldoneto);
        System.out.println("----------------------------------");
    }
}
