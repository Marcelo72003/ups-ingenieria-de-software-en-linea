import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    // Crear una instancia del objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Declarar variables para almacenar la cantidad de artículos y el precio unitario
    int cantArt;
    double precUni;

    // Validar la cantidad de artículos ingresada por el usuario
    do {
      System.out.print("Inserte la cantidad de artículos: ");
      // Validar que la entrada sea un número entero
      while (!scanner.hasNextInt()) {
        System.out.println("Entrada no válida. Por favor, inserte un número entero.");
        scanner.next(); // Consumir la entrada inválida
      }
      cantArt = scanner.nextInt();
      // Verificar que la cantidad de artículos no sea negativa
      if (cantArt < 0) {
        System.out.println("La cantidad de artículos no puede ser negativa.");
      }
    } while (cantArt < 0);

    // Validar el precio unitario ingresado por el usuario
    do {
      System.out.print("Inserte el precio unitario del artículo: ");
      // Validar que la entrada sea un número (puede ser entero o decimal)
      while (!scanner.hasNextDouble()) {
        System.out.println("Entrada no válida. Por favor, inserte un número válido.");
        scanner.next(); // Consumir la entrada inválida
      }
      precUni = scanner.nextDouble();
      // Verificar que el precio unitario no sea negativo
      if (precUni < 0) {
        System.out.println("El precio unitario no puede ser negativo.");
      }
    } while (precUni < 0);

    // Calcular el total de la venta sin aplicar descuentos
    double totalVenta = cantArt * precUni;
    double descuento = 0;
    double totalVentaConDesc = totalVenta;

    // Aplicar descuento según la cantidad de artículos comprados
    if (cantArt >= 10 && cantArt <= 49) {
      descuento = (totalVenta * 0.03); // Descuento del 3% para 10-49 artículos
    } else if (cantArt >= 50 && cantArt <= 99) {
      descuento = (totalVenta * 0.05); // Descuento del 5% para 50-99 artículos
    } else if (cantArt >= 100) {
      descuento = (totalVenta * 0.10); // Descuento del 10% para 100 o más artículos
    }

    // Calcular el total de la venta con descuento aplicado
    totalVentaConDesc = totalVenta - descuento;

    // Mostrar el resultado al usuario
    System.out.printf("El total de la venta después del descuento es: $%.2f%n", totalVentaConDesc);
    if (descuento > 0) {
      System.out.printf("Descuento aplicado: $%.2f%n", descuento);
    }

    // Cerrar el objeto Scanner para liberar recursos
    scanner.close();
  }
}


