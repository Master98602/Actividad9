import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Capturar datos del primer perro
            System.out.println("Datos del primer perro:");
            System.out.print("Nombre: ");
            String nombre1 = scanner.nextLine();
            System.out.print("Edad: ");
            int edad1 = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer de entrada
            System.out.print("Peso: ");
            double peso1 = scanner.nextDouble();
            scanner.nextLine(); // Limpia el buffer de entrada

            Perro perro1 = new Perro(nombre1, edad1, peso1);

            // Capturar datos del segundo perro
            System.out.println("Datos del segundo perro:");
            System.out.print("Nombre: ");
            String nombre2 = scanner.nextLine();
            System.out.print("Edad: ");
            int edad2 = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer de entrada
            System.out.print("Peso: ");
            double peso2 = scanner.nextDouble();
            scanner.nextLine(); // Limpia el buffer de entrada

            Perro perro2 = new Perro(nombre2, edad2, peso2);

            // Invocar los métodos de los perros
            System.out.println("\nMétodos de " + perro1.getNombre() + ":");
            perro1.comer("croquetas", 200);
            System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

            System.out.println("\nMétodos de " + perro2.getNombre() + ":");
            perro2.comer("huesos", 150);
            System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());

        } catch (Exception e) {
            System.out.println("Error: Ingresa datos válidos.");
        } finally {
            scanner.close(); // Cerrar el scanner al finalizar
        }
    }
}
