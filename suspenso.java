public class suspenso {
    public static int[][] recibeMatriz(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int[][] C = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (A[i][j] < B[i][j]) {
                    C[i][j] = B[i][j];
                } else {
                    C[i][j] = A[i][j];
                }
            }

        }
        return C;
    }

    public static void pintarMatrices(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = {
                { 1, 2, 3 },
                { 2, 4, 3 },
                { 1, 2, 5 }
        };
        int[][] B = {
                { 2, 4, 1 },
                { 1, 3, 5 },
                { 3, 4, 1 }
        };
        int[][] C = recibeMatriz(A, B);
        pintarMatrices(C);
    }

}
