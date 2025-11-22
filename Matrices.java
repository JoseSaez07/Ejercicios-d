public class Matrices {

    // 1. Método que devuelve la matriz con los máximos elemento a elemento
    public static int[][] matrizMaximos(int[][] m1, int[][] m2) {
        int filas = m1.length;
        int columnas = m1[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = Math.max(m1[i][j], m2[i][j]);
            }
        }

        return resultado;
    }

    // 2. Método para mostrar una matriz 2D
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 3. Main
    public static void main(String[] args) {
        // Declaración de dos matrices 2D del mismo tamaño
        int[][] matriz1 = {
                { 1, 5, 3 },
                { 7, 2, 9 },
                { 4, 6, 8 }
        };

        int[][] matriz2 = {
                { 2, 3, 5 },
                { 6, 8, 1 },
                { 9, 0, 4 }
        };

        // Obtener matriz de máximos
        int[][] matrizMax = matrizMaximos(matriz1, matriz2);

        // Mostrar matriz resultante
        System.out.println("Matriz de máximos:");
        mostrarMatriz(matrizMax);
    }
}