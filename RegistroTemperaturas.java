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

    public static int[] conteoMayor20(int[][] m) {
        int dias = m.length;
        int[] conteo = new int[dias];

        for (int i = 0; i < dias; i++) {
            int c = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > 20) { // condición para contar
                    c++;
                }
            }
            conteo[i] = c; // guardamos el conteo por día
        }

        return conteo;
    }

    public static void mostrarConteo(int[] conteo) {
        for (int i = 0; i < conteo.length; i++) {
            System.out.println("Día " + (i + 1) + " tiene " + conteo[i] + " temperaturas > 20°C");
        }
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
        int filas = m.length;
        int columnas = m[0].length;
        int[] maximos = new int[filas];
        for (int i = 0; i < filas; i++) {
            maximos[i] = m[i][0];
            for (int j = 0; j < columnas; j++) {
                if (m[i][j] > maximos[i]) {
                    maximos[i] = m[i][j];
                }
            }
        }
        return maximos;
    }

    public static double[] mediasPorFranja(int[][] m) {
        int dias = m.length;
        int frangas = m[0].length;
        double[] media = new double[frangas];
        for (int j = 0; j < frangas; j++) {
            int suma = 0;
            for (int i = 0; i < dias; i++) {
                suma += m[i][j];
            }
            media[j] = (double) suma / dias;
        }
        return media;
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