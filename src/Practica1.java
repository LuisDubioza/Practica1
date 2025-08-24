import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("\nBienvenido a Trash The Dragon \n");
       System.out.println("Ingrese el nombre de la pelicula \n");
       String nombrePelicula = scanner.nextLine();

       System.out.println("\nIngrese el año de estreno \n");
       int Estreno = scanner.nextInt();

       System.out.println("\nIngrese precio de renta \n");
       double precioRenta = scanner.nextDouble();

       System.out.println("\nIngrese la calificacion de 1 a 5 estrellas \n");
       int calificacion = scanner.nextInt();

       System.out.println("\nIngrese la disponibilidad de la pelicula");
       System.out.println(" escribir \"true\" si esta disponible, \"false\" si no lo esta no disponible \n");
        boolean disponibilidad = scanner.nextBoolean();

        System.out.println("\nIngrese la clasificación de edad \n");
        char clasificacionEdad = scanner.next().charAt(0);

        System.out.println("\n");

        double iva = 1.16;
        double precioFinal = precioRenta * iva;

        int anoactual = 2025;
        int antiguedad = anoactual - Estreno;
        int aplicardescuento = ((antiguedad - 10) >>> 31) ^ 1; // se recorre a la derecha 31 bits para obtener 0 o 1
        double preciofinaldescuento = precioFinal * (1 - aplicardescuento * 0.10);

        System.out.println("Titulo: " + nombrePelicula + "\n");
        System.out.println("Año de estreno: " + Estreno + "\n");
        System.out.println("Precio de renta: $" + precioRenta + "\n");
        System.err.println("clasificacion por estrellas: " + calificacion + " estrellas \n");
        System.out.println("Disponibilidad: " + disponibilidad + "\n");
        System.out.println("Clasificación por edad: " + clasificacionEdad + "\n");
        System.out.println("Precio final con IVA: $" + precioFinal + "\n");
        System.out.println("Precio final con descuento (si aplica): $" + preciofinaldescuento + "\n");



 
    }
}
