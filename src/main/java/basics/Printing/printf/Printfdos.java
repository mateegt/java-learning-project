package basics.Printing.printf;


import java.util.Scanner;

public class Printfdos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce tu nombre hermano%n");
        String nombre = sc.nextLine();
        System.out.printf("Introduce tu edad hermano%n");
        int edad = sc.nextInt();
        System.out.printf("Introduce tu altura en metros broder%n");
        double height = sc.nextDouble();
        System.out.printf("Nombre:%s%nEdad:%d%nEstatura:%.2f%n",
                nombre, edad, height);


        sc.close();


    }
}
