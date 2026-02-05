package ejercicios;

import java.util.Scanner;

public class ConversorDeMonedas {
    public static void main(String[] args) {
        final double valorDolar = 17.50;
        final double valorEuro = 19.20;
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CONVERSOR DE MONEDAS ===");
        System.out.println("Opciones:");
        System.out.println("1. Dolares > Pesos");
        System.out.println("2. Euros > Pesos");
        System.out.println("3. Pesos > Dolares");
        System.out.println("4. Pesos > Euros");
        System.out.println("Elige una opcion (1-4):");
        int opcion = sc.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("Error: Opcion invalida");
            sc.close();
            return;

        }
        System.out.println("Ingresa la cantidad: ");
        double cantidad = sc.nextDouble();

        if (cantidad < 0) {
            System.out.println("Error: La cantidad no puede ser negativa");
            sc.close();
            return;
        }
        double resultado = 0;
        String monedaOrigen = "";
        String monedadDestino = "";

        if (opcion == 1) {
            resultado = cantidad * valorDolar;
            monedaOrigen = "USD";
            monedadDestino = "MXN";
        } else if (opcion == 2) {
            resultado = cantidad * valorEuro;
            monedaOrigen = "EUR";
            monedadDestino = "MXN";

        } else if (opcion == 3) {
            resultado = cantidad / valorDolar;
            monedaOrigen = "MXN";
            monedadDestino = "USD";


        } else if (opcion == 4) {
            resultado = cantidad / valorEuro;
            monedaOrigen = "MXN";
            monedadDestino = "EUR";

        }
        System.out.printf("\n%.2f %s = %.2f %s\n",
                cantidad,monedaOrigen,resultado ,monedadDestino);

    }
}
