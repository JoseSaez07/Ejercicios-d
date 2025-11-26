public class josito {
    public static int[][] recibeMatriz(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (A[i][j] < B[i][j]) {
                    resultado[i][j] = B[i][j];
                } else {
                    resultado[i][j] = A[i][j];
                }
            }
        }
        return resultado;
    }

    public static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 1, 4 },
                { 2, 4, 3, 8 },
                { 3, 2, 5, 9 }
        };
        int[][] B = {
                { 2, 2, 4, 1 },
                { 1, 5, 6, 7 },
                { 5, 4, 6, 9 }
        };
        int[][] max = recibeMatriz(A, B);
        System.out.println("Matriz maximos ");
        pintarMatriz(max);
    }
}
