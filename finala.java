public class finala {
    public static double[] mediasFranjas(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double[] media = new double[franjas];
        for (int j = 0; j < franjas; j++) {
            double suma = 0;
            for (int i = 0; i < dias; i++) {
                suma += m[i][j];
            }
            media[j] = (double) suma / dias;
        }
        return media;
    }

    public static double[] maximoDias(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double[] max = new double[dias];
        for (int i = 0; i < dias; i++) {
            max[i] = m[i][0];
            for (int j = 0; j < franjas; j++) {
                if (m[i][j] > max[i]) {
                    max[i] = m[i][j];
                }
            }
        }
        return max;
    }

    public static double maximo(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double maxtotal = m[0][0];
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < franjas; j++) {
                if (m[i][j] > maxtotal) {
                    maxtotal = m[i][j];
                }
            }
        }
        return maxtotal;
    }

    public static void pintarMaximo(double[] pintar) {
        for (int i = 0; i < pintar.length; i++) {
            System.out.println("Maximo dia " + (i + 1) + ": " + pintar[i]);
        }
    }

    public static void pintarMaximo(double pintar) {
        System.out.println("Maximo: " + pintar);
    }

    public static void pintarFranjas(double[] pintar) {
        for (int i = 0; i < pintar.length; i++) {
            System.out.println("Franja " + (i + 1) + ": " + pintar[i]);
        }
    }

    public static void main(String[] args) {
        double[][] diasFinales = {
                { 2, 22, 24.5 },
                { 7, 12, 19.2 },
                { 5, 14, 8.4 },
                { 21, 6, 10.5 },
                { 22, 4.3, 5 }
        };

        double[] result = finala.mediasFranjas(diasFinales);
        pintarFranjas(result);
        System.out.println("---------------------");
        double[] rellena = finala.maximoDias(diasFinales);
        pintarMaximo(rellena);

        double jo = finala.maximo(diasFinales);
        pintarMaximo(jo);
    }
}
