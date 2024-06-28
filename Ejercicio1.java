import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    // Inicializamos el Scanner para leer desde la entrada estándar (teclado)
    Scanner scanner = new Scanner(System.in);

    // Solicitamos al usuario que ingrese un número
    System.out.print("Introduce un número: ");

    // Leemos la línea completa ingresada por el usuario
    String entradaUsuario = scanner.nextLine();

    // Convertimos la cadena de entrada en un arreglo de caracteres
    char[] arregloCaracteres = entradaUsuario.toCharArray();

    // Creamos un nuevo arreglo de caracteres para almacenar el resultado invertido
    char[] arregloInvertido = new char[arregloCaracteres.length];

    // Iteramos sobre el arreglo original para invertir los caracteres
    for (int i = 0; i < arregloCaracteres.length; i++) {
      // Almacenamos los caracteres en orden inverso en el nuevo arreglo
      arregloInvertido[i] = arregloCaracteres[arregloCaracteres.length - 1 - i];
    }

    // Creamos una nueva cadena a partir del arreglo invertido
    String cadenaInvertida = new String(arregloInvertido);

    // Imprimimos la cadena invertida
    System.out.println("Número invertido: " + cadenaInvertida);

    // Cerramos el Scanner
    scanner.close();
  }
}

