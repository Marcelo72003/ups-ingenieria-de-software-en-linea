/*5. Elabore un programa en Java que pida al usuario dos números enteros, determine si éstos son o
  no números amigos y que muestre en pantalla el mensaje “Son números amigos” o “No son números amigos”. Recuerde que dos números son amigos si la suma de los divisores de uno de
  ellos es igual al otro y viceversa; por ejemplo, 220 y 284 son amigos:
  Divisores de 220 son:
  1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
  Divisores de 284 son:
  1 + 2 + 4 + 71 + 142 = 220*/

// Alumno: Marcelo Darwin Peña Ochoa
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    // Crear una instancia del objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Obtener los números a comparar
    System.out.print("Inserta el primer número: ");
    int numUno = scanner.nextInt();
    System.out.print("Inserta el segundo número: ");
    int numDos = scanner.nextInt();

    // Calcular la suma de los divisores de numUno
    int sumaDivisoresUno = 0;
    for (int i = 1; i <= numUno / 2; i++) {
      if (numUno % i == 0) {
        sumaDivisoresUno += i;
      }
    }

    // Calcular la suma de los divisores de numDos
    int sumaDivisoresDos = 0;
    for (int i = 1; i <= numDos / 2; i++) {
      if (numDos % i == 0) {
        sumaDivisoresDos += i;
      }
    }

    // Verificar si son números amigos
    if (sumaDivisoresUno == numDos && sumaDivisoresDos == numUno) {
      System.out.println("Son números amigos");
    } else {
      System.out.println("No son números amigos");
    }

    // Cerrar el Scanner después de leer la entrada
    scanner.close();
  }
}


