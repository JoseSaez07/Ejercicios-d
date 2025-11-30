import java.util.InputMismatchException;
import java.util.Scanner;

public class supersuspenso {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("== Centro de control ==");
            System.err.println("1. Mostrar Calculo: ");
            System.err.println("2. Calcular descuento: ");
            System.err.println("3. Evaluar temperatura: ");
            System.out.println("4. Salir: ");
            System.out.println("------------------------");
            while (true) {
                try {
                    System.err.print("Elige una opción (1 - 3): ");
                    opcion = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Error: necesitas poner un número no letra. ");
                    sc.nextLine();
                }
            }
            switch (opcion) {
                case 1 -> System.out.println(" Hola a todos  \n");
                case 2 -> pidePrecio(sc);
                case 3 -> pideTemperatura(sc);
                case 4 -> System.out.println("Gracias por usar la aplicación. ");
                default -> System.out.println("Error elige un numero del 1 al 3. \n");
            }
        } while (opcion != 4);
    }

    public static void pidePrecio(Scanner sc) {
        double producto = 0;
        while (true) {
            try {
                System.out.print("Dime el precio del producto en $: ");
                producto = sc.nextInt();
                if (producto < 0) {
                    System.out.println("Error el precio del producto no puede ser negativo. ");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error : Tienes que introducir un numero, no letra. ");
                sc.nextLine();
            }
        }
        double descuento = producto * 0.10;
        System.out.println("Se aplica un descuento de: " + descuento);
        double precioFinal = producto - descuento;
        System.out.println("El precio final es de: " + precioFinal + "$");
        System.out.println();
    }

    public static void pideTemperatura(Scanner sc) {
        int temperarura = 0;
        while (true) {
            try {
                System.out.print("Dime tu temperatura: ");
                temperarura = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error introduce un número, no texto. ");
                sc.nextLine();
            }
        }
        if (temperarura <= 15) {
            System.out.println("Hace frio ");
        } else if (temperarura >= 16 && temperarura <= 25) {
            System.out.println("No hace ni frío ni calor\n");
        } else {
            System.out.println("Hace calor");
        }
    }
}
