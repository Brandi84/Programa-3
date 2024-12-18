import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registro de Visitante a Edificio");
        System.out.println("Porfavor Ingresar su Informacion");


        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        byte edad = scanner.nextByte();

        System.out.print("Ingrese el piso a visitar (ejemplo: 3): ");
        short piso = scanner.nextShort();

        System.out.print("Ingrese el número del apartamento: ");
        int numeroApartamento = scanner.nextInt();

        System.out.print("Ingrese el número de identificación del visitante: ");
        long Cedula = scanner.nextLong();

        System.out.print("¿Es un visitante recurrente? (true/false): ");
        boolean Recurrente = scanner.nextBoolean();
        scanner.close();

        // Mostrar la información del visitante
        System.out.println("\n--- Información del Visitante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Piso a visitar: " + piso);
        System.out.println("Número de apartamento: " + numeroApartamento);
        System.out.println("Número de identificación: " + Cedula);
        System.out.println("Visitante recurrente: " + Recurrente);
    }
}