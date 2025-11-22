import java.util.Scanner;

public class Generadordecontrasenas {
    public static void main(String[] args) {
        String nombre;
        String ciudad;
        int numeroSuerte;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Dime tu nombre: ");
            nombre = sc.nextLine();
            if (nombre.length() >= 3) {
                break;
            }
            System.err.println("Error: introduce como minimo 3 letras");
        }
        while (true) {
            System.out.print("Dime tu ciudad: ");
            ciudad = sc.nextLine();
            if (ciudad.length() >= 2) {
                break;
            }
            System.out.println("Error: como minimo son 2 caracteres");
        }
        System.out.print("Dime el numero de la suerte: ");
        numeroSuerte = sc.nextInt();
        String contraseña = nombre.substring(0, 2) + numeroSuerte + ciudad.substring(ciudad.length() - 2);
        System.out.println("Tu contraseña generada es " + "<" + contraseña + ">");
        sc.close();
    }
}
