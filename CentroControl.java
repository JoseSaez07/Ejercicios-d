import java.util.Scanner;

public class CentroControl {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("==CENTRO DE CONTROL==\n");
            System.out.println("1.Mostrar saludo: ");
            System.out.println("2.Calcular descuento: ");
            System.out.println("3.Evaluar temperatura: \n");
            System.out.print("Elije una opcion (0-3): ");
            numero = sc.nextInt();
            switch (numero) {
                case 1 -> System.out.println("!Hola a todos¡");
                case 2 -> precioProducto(0, 0, sc);
                case 3 -> System.out.println(temperaturaEjercicio(0, sc));
                case 0 -> System.out.println("Gracias por usar el programa");
                default -> System.out.println("Opcion no valida");
            }
        } while (numero != 0);

    }

    public static void precioProducto(double descuento, double precioFinal, Scanner sc) {
        System.out.print("Introduce el precio a euros:");
        double producto = sc.nextDouble();
        if (producto < 0) {
            System.out.println("El precio no puede ser negativo.");
            return;
        }
        descuento = producto * 0.10;
        System.out.println("Se aplicara un descuento del 10%: " + descuento + "$");
        precioFinal = producto - descuento;
        System.out.println("El precio final es de: " + precioFinal + "$");

    }

    public static String temperaturaEjercicio(int temperarura, Scanner sc) {
        System.out.print("Dime una temperatura: ");
        temperarura = sc.nextInt();
        if (temperarura < 15) {
            return "Hace frío";
        } else if (temperarura >= 15 && temperarura <= 25) {
            return "No hace ni frio ni calor";
        } else {
            return "Hace calor";
        }

    }
}
