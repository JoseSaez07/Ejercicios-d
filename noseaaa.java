public class noseaaa {

    // Calcula la media de cada día
    public static double[] mediaDiaria(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double[] medias = new double[dias];
        for (int i = 0; i < dias; i++) {
            double suma = 0;
            for (int j = 0; j < franjas; j++) {
                suma += m[i][j];
            }
            medias[i] = suma / franjas;
        }
        return medias;
    }

    // Calcula el máximo de cada franja (mañana, tarde, noche)
    public static double[] temperaturaMax(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double[] maximos = new double[franjas];
        for (int j = 0; j < franjas; j++) {
            maximos[j] = m[0][j];
            for (int i = 0; i < dias; i++) {
                if (m[i][j] > maximos[j]) {
                    maximos[j] = m[i][j];
                }
            }
        }
        return maximos;
    }

    // Calcula la suma total de cada día
    public static double[] sumaPorDia(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double[] sumaDias = new double[dias];
        for (int i = 0; i < dias; i++) {
            double suma = 0;
            for (int j = 0; j < franjas; j++) {
                suma += m[i][j];
            }
            sumaDias[i] = suma;
        }
        return sumaDias;
    }

    // Cuenta cuántas temperaturas de cada día son mayores a 20°C
    public static int[] conteoMayor20(double[][] m) {
        int dias = m.length;
        int[] conteo = new int[dias];
        for (int i = 0; i < dias; i++) {
            int c = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > 20) {
                    c++;
                }
            }
            conteo[i] = c;
        }
        return conteo;
    }

    // Métodos para mostrar resultados
    public static void mostrarMedias(double[] medias) {
        System.out.println("Media diaria:");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Día %d: %.2f°C%n", i + 1, medias[i]);
        }
    }

    public static void mostrarMaximos(double[] maximos) {
        System.out.println("Máximos por franja:");
        String[] franjas = { "Mañana", "Tarde", "Noche" };
        for (int i = 0; i < maximos.length; i++) {
            System.out.printf("%s: %.2f°C%n", franjas[i], maximos[i]);
        }
    }

    public static void mostrarSumaDias(double[] sumas) {
        System.out.println("Suma de temperaturas por día:");
        for (int i = 0; i < sumas.length; i++) {
            System.out.printf("Día %d: %.2f°C%n", i + 1, sumas[i]);
        }
    }

    public static void mostrarConteo(int[] conteo) {
        System.out.println("Conteo de temperaturas > 20°C por día:");
        for (int i = 0; i < conteo.length; i++) {
            System.out.printf("Día %d: %d temperaturas%n", i + 1, conteo[i]);
        }
    }

    public static void main(String[] args) {
        double[][] temperaturas = {
                { 15.5, 22.0, 18.0 },
                { 20.0, 25.5, 19.0 },
                { 12.0, 17.0, 16.5 },
                { 28.0, 30.0, 26.0 },
                { 10.0, 14.0, 13.5 },
                { 21.0, 23.0, 20.0 },
                { 18.0, 27.0, 24.5 }
        };

        mostrarMedias(mediaDiaria(temperaturas));
        System.out.println("----------------------------------");
        mostrarMaximos(temperaturaMax(temperaturas));
        System.out.println("----------------------------------");
        mostrarSumaDias(sumaPorDia(temperaturas));
        System.out.println("----------------------------------");
        mostrarConteo(conteoMayor20(temperaturas));
    }
}
