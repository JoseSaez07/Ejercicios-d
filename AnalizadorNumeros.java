import java.util.Scanner;

public class AnalizadorNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = null;

        // ---------------------------
        // 1. Pedir la lista hasta que sea válida
        // ---------------------------
        while (numeros == null) {
            System.out.println("Introduce números enteros separados por comas:");
            String entrada = sc.nextLine();

            // Intentar convertir a array
            numeros = convertirAArray(entrada);
        }

        // ---------------------------
        // 2. Mostrar cantidad, máximo y mínimo
        // ---------------------------
        System.out.println("\nCantidad de números introducidos: " + numeros.length);
        System.out.println("Valor máximo: " + maximo(numeros));
        System.out.println("Valor mínimo: " + minimo(numeros));

        // ---------------------------
        // 3. Pedir índice y mostrar valor
        // ---------------------------
        System.out.print("\nIntroduce una posición del array: ");

        try {
            int indice = sc.nextInt();
            System.out.println("Valor en esa posición: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }

        sc.close();
    }

    // ==================================================
    // MÉTODOS AUXILIARES
    // ==================================================

    // Convierte la entrada en array de enteros
    public static int[] convertirAArray(String entrada) {
        try {
            String[] partes = entrada.split(",");
            int[] numeros = new int[partes.length];

            for (int i = 0; i < partes.length; i++) {
                partes[i] = partes[i].trim(); // quitar espacios
                numeros[i] = Integer.parseInt(partes[i]); // parseo
            }

            return numeros;

        } catch (NumberFormatException e) {
            System.out.println("Error: uno de los valores introducidos no es un número entero válido.\n");
            return null; // para repetir entrada
        }
    }

    // Calcula el máximo
    public static int maximo(int[] array) {
        int max = array[0];
        for (int n : array)
            if (n > max)
                max = n;
        return max;
    }

    // Calcula el mínimo
    public static int minimo(int[] array) {
        int min = array[0];
        for (int n : array)
            if (n < min)
                min = n;
        return min;
    }
}
