package basics.Printing.printf;

import java.util.Scanner;

public class Printftres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Dame tu nombre hermanardo%n");
        String nombre = sc.nextLine();
        System.out.printf("Dame tu primera calificacion broder%n");
        double cal1 = sc.nextDouble();
        System.out.printf("Dame tu segunda calificacion broder%n");
        double cal2 = sc.nextDouble();
        double promedio = (cal1  + cal2)/2;
        System.out.printf("Alumno:%s%nPromedio:%.2f%n",
                nombre,promedio);

        sc.close();



    }
}
