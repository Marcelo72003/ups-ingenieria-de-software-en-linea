/*4. Escriba un programa que, dado un valor entero en dólares, imprima el número mínimo de
  denominaciones de billetes en 100, 50, 20, 10, 5 y 1. Utilice el operador ternario (? :) para imprimir
  solo números de billetes distintos de cero*/

// Alumno: Marcelo Darwin Peña Ochoa

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    // Crear una instancia del objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese la cantidad en dólares
    System.out.print("Inserta la cantidad en dólares: ");
    int numEnDolares = scanner.nextInt();

    // Variables para contar el número de billetes en cada denominación
    int numDeBilletes;

    // Calcular y mostrar el número mínimo de billetes para cada denominación
    // Para billetes de $100
    numDeBilletes = numEnDolares / 100;
    numEnDolares = numEnDolares % 100;
    System.out.println(numDeBilletes > 0 ? "Billetes con denominacion de $100: " + numDeBilletes : "");

    // Para billetes de $50
    numDeBilletes = numEnDolares / 50;
    numEnDolares = numEnDolares % 50;
    System.out.println(numDeBilletes > 0 ? "Billetes con denominacion de $50: " + numDeBilletes: "");

    // Para billetes de $20
    numDeBilletes = numEnDolares / 20;
    numEnDolares = numEnDolares % 20;
    System.out.println(numDeBilletes > 0 ? "Billetes con denominacion de $20: " + numDeBilletes: "");

    // Para billetes de $10
    numDeBilletes = numEnDolares / 10;
    numEnDolares = numEnDolares % 10;
    System.out.println(numDeBilletes > 0 ? "Billetes con denominacion de $10: " + numDeBilletes: "");

    // Para billetes de $5
    numDeBilletes = numEnDolares / 5;
    numEnDolares = numEnDolares % 5;
    System.out.println(numDeBilletes > 0 ? "Billetes con denominacion de $5: " + numDeBilletes : "");

    // Para billetes de $1
    numDeBilletes = numEnDolares;
    System.out.println(numDeBilletes > 0 ? "Billetes con denominacion de $1: " + numDeBilletes: "");

    // Cerrar el Scanner para liberar recursos
    scanner.close();
  }
}

