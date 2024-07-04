package uvg.edu.gt;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculadora = new Calc();

        System.out.println("Ingrese el primer número:");
        int n1 =scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int n2 = scanner.nextInt();


        System.out.println("Elija una operación: 1. Suma 2. Resta 3. Multiplicacion");
        int opcion = scanner.nextInt();


}
}
