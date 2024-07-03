import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    // Inicializamos el Scanner para leer desde la entrada estándar (teclado)
    Scanner scanner = new Scanner(System.in);

    // Solicitamos al usuario que ingrese un número entero de tres dígitos
    System.out.print("Introduce un número entero de tres dígitos: ");
    int numero = scanner.nextInt();

    // Verificamos que el número tenga tres dígitos
    if (numero < 100 || numero > 999) {
      System.out.println("El número no es de tres dígitos. Inténtalo de nuevo.");
    } else {
      // Convertimos el número en una cadena para facilitar la manipulación de caracteres
      String numeroStr = String.valueOf(numero);

      // Convertimos la cadena de entrada en un arreglo de caracteres
      char[] arregloCaracteres = numeroStr.toCharArray();

      // Creamos un nuevo arreglo de caracteres para almacenar el resultado invertido
      char[] arregloInvertido = new char[arregloCaracteres.length];

      // Iteramos sobre el arreglo original para invertir los caracteres
      for (int i = 0; i < arregloCaracteres.length; i++) {
        // Almacenamos los caracteres en orden inverso en el nuevo arreglo
        arregloInvertido[i] = arregloCaracteres[arregloCaracteres.length - 1 - i];
      }

      // Creamos una nueva cadena a partir del arreglo invertido
      String cadenaInvertida = new String(arregloInvertido);

      // Convertimos la cadena invertida de caracteres a un número entero
      int numeroInvertido = Integer.parseInt(cadenaInvertida);

      // Imprimimos el número invertido
      System.out.println("Número invertido: " + numeroInvertido);
    }

    // Cerramos el Scanner
    scanner.close();
  }
}


