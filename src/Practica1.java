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
 
    }
}
