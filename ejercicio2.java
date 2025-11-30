import java.util.Scanner;

public class ejercicio2 {
    public static String parImpar(int numero) {
        boolean espar = (numero % 2 == 0);
        boolean esMultiplo = (numero % 3 == 0);
        if (esMultiplo && espar) {
            return "Es par y multiplo de 3";
        } else if (espar) {
            return "Es par";
        } else if (!espar && esMultiplo) {
            return "Es impar y multiplo de 3";
        } else {
            return "Es impar";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();
        String resultado = parImpar(numero);
        System.out.println(resultado);
        sc.close();
    }
}
