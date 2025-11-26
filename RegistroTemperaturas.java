import java.util.Arrays;

public class RegistroTemperaturas {

    // --- Declaraciones (impleméntalas tú según el enunciado) ---
    public static boolean validar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < -10 || m[i][j] > 45) {
                    return false; // valor fuera de rango
                }
            }
        }
        return true;
    }

    public static double[] mediasDiarias(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;
        double[] medias = new double[filas];
        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += m[i][j];
            }
            medias[i] = (double) suma / columnas;
        }
        return medias;
    }

    public static int[] maximosPorFranja(int[][] m) {
       int fila = m.length;
       int columna = m.length;
       int[] maximo = new int[]
    }

    public static double[] mediasPorFranja(int[][] m) {
        return new double[3];
    }

    public static void imprimirPorDia(int[][] m) {

    }

    public static void main(String[] args) {
        // Matriz 7x3 ya rellena (días × [mañana, tarde, noche])
        int[][] m = {
                { 15, 22, 18 },
                { 20, 25, 19 },
                { 12, 17, 16 },
                { 28, 30, 26 },
                { 10, 14, 13 },
                { 21, 23, 20 },
                { 18, 27, 24 }
        };

        // Llamadas a los métodos (debes tenerlos implementados)
        if (!validar(m)) {
            System.out.println("Hay valores fuera de [-10, 45].");
            return;
        }

        double[] mediasDia = mediasDiarias(m);
        int[] maxFranjas = maximosPorFranja(m); // [maxMañana, maxTarde, maxNoche]
        double[] mediasFranjas = mediasPorFranja(m); // [mediaMañanas, mediaTardes, mediaNoches]

        imprimirPorDia(m);

        System.out.println("Medias por día: " + Arrays.toString(mediasDia));
        System.out.println("Máximos por franja [mañana, tarde, noche]: " + Arrays.toString(maxFranjas));
        System.out.println("Medias por franja [mañanas, tardes, noches]: " + Arrays.toString(mediasFranjas));
    }

}