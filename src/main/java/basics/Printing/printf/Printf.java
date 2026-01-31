package basics.Printing.printf;

public class Printf {
    public static void main(String[] args) {

        String nombre = "Mateo";
        int edad = 23;
        char inicial = 'G';
        double promedio = 8.756;


        System.out.printf("Nombre: %s  | Edad: %d | Inicial: %c | Promedio: %.2f", nombre, edad, inicial, promedio   );

    }
}
