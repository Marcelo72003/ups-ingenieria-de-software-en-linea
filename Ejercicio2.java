import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) { System.out.println("Ejercicio 2");
    // Inicializamos el Scanner para leer desde la entrada estándar (teclado)
    Scanner scanner = new Scanner(System.in);

    // Solicitamos al usuario que ingrese el tipo de vehículo (a, b o c)
    System.out.print("Introduce el tipo de vehículo (a, b o c): ");
    String entradaTipo = scanner.nextLine();

    // Solicitamos al usuario que ingrese el número de horas de estacionamiento
    System.out.print("Introduce cuántas horas estuvo en el estacionamiento: ");
    String entradaHoras = scanner.nextLine();

    // Convertimos la entrada de horas a un número entero
    int numHoras = Integer.parseInt(entradaHoras);

    // Variable para almacenar el precio final del estacionamiento
    double precioFinal;

    // Calculamos el precio final basado en el tipo de vehículo ingresado
    if (entradaTipo.equals("a")) {
      double valorHoraAuto = 1.20;
      precioFinal = valorHoraAuto * numHoras;
      System.out.println("El valor final a pagar es: " + precioFinal);
    } else if (entradaTipo.equals("b")) {
      int valorHoraBus = 2;
      precioFinal = valorHoraBus * numHoras; // numHoras ya es un entero, no es necesario convertirlo de nuevo
      System.out.println("El valor final a pagar es: " + (int)precioFinal);
    } else if (entradaTipo.equals("c")) {
      int valorHoraCamion = 3;
      precioFinal = valorHoraCamion * numHoras; // numHoras ya es un entero, no es necesario convertirlo de nuevo
      System.out.println("El valor final a pagar es: " + (int)precioFinal);
    } else {
      System.out.println("Tipo de vehículo no válido. Inténtalo de nuevo.");
    }

    // Cerramos el Scanner para liberar recursos
    scanner.close();
  }
}
