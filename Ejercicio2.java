/*2. Escriba un programa en Java que solicite al usuario el tipo de vehículo ('a' para automóvil, 'b'
para bus, 'c' para camión) y la cantidad de horas que un vehículo pasó en el estacionamiento, y
devuelva el valor de estacionamiento a pagar según las tarifas que se muestran a continuación.
Automóvil: $1.20 por hora; bus: $2 por hora; camión: $3 por hora*/

// Alumno: Marcelo Darwin Peña Ochoa

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Ejercicio 2");

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
    } else if (entradaTipo.equals("b")) {
      int valorHoraBus = 2;
      precioFinal = valorHoraBus * numHoras;
    } else if (entradaTipo.equals("c")) {
      int valorHoraCamion = 3;
      precioFinal = valorHoraCamion * numHoras;
    } else {
      // Tipo de vehículo no válido
      System.out.println("Tipo de vehículo no válido. Inténtalo de nuevo.");
      // Cerramos el Scanner antes de salir
      scanner.close();
      return; // Salimos del programa si el tipo de vehículo no es válido
    }

    // Formateamos el precio final para imprimirlo con dos decimales si es necesario
    String precioFormateado = String.format("%.2f", precioFinal);

    // Imprimimos el valor final a pagar
    System.out.println("El valor final a pagar es: $" + precioFormateado);

    // Cerramos el Scanner para liberar recursos
    scanner.close();
  }
}


