import java.util.Scanner;

public class CalculoAnosJubilacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad actual: ");
        int edadActual = sc.nextInt();
        System.out.print("Dime tu edad de jubilación: ");
        int edadJubilacion = sc.nextInt();
        sc.close();
        if (edadJubilacion < edadActual) {
            System.err.println("Error tu edad actual tiene que ser menor a tu edad de jubilacion");
            return;
        }
        int jubilación = edadJubilacion - edadActual;
        System.out.println("Faltan " + jubilación + " años para tu jubilación.");

        if (edadActual >= edadJubilacion) {
            System.out.println("Ya has alanzado la  edad  de jubilación ");
        } else {
            System.out.println("Todavia no ha llegado");

        }

    }
}