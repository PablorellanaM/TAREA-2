//CAMBIO 1 GIT RESET
package uvg.edu.gt;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculadora = new Calc();
        //Ejemplo cambui ESTUDIANTE 2 
        System.out.println("Ingrese el primer número:");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int n2 = scanner.nextInt();
        // Ejemplo Cambio
        System.out.println("Elija una operación: 1. Suma 2. Resta 3. Multiplicación");
        int opcion = scanner.nextInt();

        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = calculadora.suma(n1, n2);
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = calculadora.resta(n1, n2);
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicacion(n1, n2);
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}