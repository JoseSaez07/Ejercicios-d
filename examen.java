import java.util.InputMismatchException;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            while (true) {
                try {
                    System.out.println("\t=== PANEL DE OPERACIONES ===");
                    System.out.println("\t1. Mostrar mensaje motivacional");
                    System.out.println("\t2. Calcular la media del circulo");
                    System.out.println("\t3. Evaluar tu edad ");
                    System.out.println("\t0. Salir");
                    System.out.println("\t==============================");
                    System.out.print("\tElige una opcion (0 - 3) : ");
                    numero = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("\n\tIntroduce un numero, no una letra.\n");
                    sc.nextLine();
                }
            }

            switch (numero) {
                case 1 -> System.out.println("\n\tEres el mejor.\n");
                case 2 -> radiocirculo(sc);
                case 3 -> System.out.println("\t" + mmostrarTemperatura(sc) + "\n");
                case 0 -> System.out.println("\n\tGracias por usar el ejercicio.\n");
                default -> System.out.println("\tElije un numero del 0 al 3\n");
            }

        } while (numero != 0);
    }

    public static void radiocirculo(Scanner sc) {
        int radio;
        double area;
        System.out.print("\tIntroduce el radio del circulo: ");
        radio = sc.nextInt();
        area = 3.14 * radio * radio;
        System.out.printf("\n\tEl área es de %.2f\n\n", area);
    }

    public static String mmostrarTemperatura(Scanner sc) {
        System.out.print("\tDime la temperatura: ");
        int temperatura = sc.nextInt();

        if (temperatura <= 15) {
            return "Hace frio";
        } else if (temperatura >= 16 && temperatura <= 25) {
            return "No hace frio ni calor";
        } else {
            return "Hace calor";
        }
    }
}