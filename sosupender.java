import java.util.InputMismatchException;
import java.util.Scanner;

public class sosupender {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int numeroSuerte;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Dime tu Nombre: ");
            nombre = sc.nextLine();
            if (nombre.length() >= 3) {
                break;
            }
            System.out.println("Error: Necesitas por lo menos introducir 3 letras ");
        }
        while (true) {
            System.out.print("Dime tu Apellido : ");
            apellido = sc.nextLine();
            if (apellido.length() >= 2) {
                break;
            }
            System.out.println("Error: Necesitas por lo menos introducir 2 letras ");
        }
        while (true) {
            try {
                System.out.print("Dime tu numero de la suerte: ");
                numeroSuerte = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error deves de introducir un numero ");
                sc.nextLine();
            }
        }

        String contraseña = nombre.substring(0, 3) + numeroSuerte + apellido.substring(apellido.length() - 2);
        System.out.println("Tu contraseña es <" + contraseña + ">");
        sc.close();
    }
}
