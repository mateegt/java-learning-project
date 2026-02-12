package tema02_condicionales;

import java.util.Scanner;

public class Booleanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Tienes credencial?");
        String credencial = sc.nextLine();
        System.out.println("Eres empleado?");
        String empleado = sc.nextLine();
        boolean esEmpleado, tieneCredencial;

        if (credencial.equalsIgnoreCase("Si")) {
            tieneCredencial = true;


        } else if (credencial.equalsIgnoreCase("No")) {
            tieneCredencial = false;
        } else {
            System.out.println("Introduce una respuesta correcta ");
            return;
        }
        if (empleado.equalsIgnoreCase("Si")) {
            esEmpleado = true;

        } else if (empleado.equalsIgnoreCase("No")) {
            esEmpleado = false;

        } else {
            System.out.println("Introduce una respuesta correcta broder");
            return;
        }
        if ((edad >= 18 && tieneCredencial) || esEmpleado) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado broder");
        }
        sc.close();

    }

}
