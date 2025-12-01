public class pp {
    public static double[] sumaDias(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        double[] sumar = new double[dias];
        for (int i = 0; i < dias; i++) {
            double suma = 0;
            for (int j = 0; j < franjas; j++) {
                suma += m[i][j];
            }
            sumar[i] = suma;
        }
        return sumar;
    }

    public static int[] diasmenoresque50(double[][] m) {
        int dias = m.length;
        int franjas = m[0].length;
        int[] conteo = new int[dias];
        for (int i = 0; i < dias; i++) {
            int C = 0;
            for (int j = 0; j < franjas; j++) {
                if (m[i][j] > 20) {
                    C++;
                }
            }
            conteo[i] = C;
        }
        return conteo;
    }

    public static void sumarPintado(double[] dias) {
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Suma dia " + (i + 1) + " :" + dias[i]);
        }
    }

    public static void mayoresPintado(int[] dias) {
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Cuantos dias son mayores que 20 " + "Dia: " + (i + 1) + " :" + dias[i]);
        }
    }

    public static void main(String[] args) {
        double[][] diasTotales = {
                { 15.5, 22.0, 18.0 },
                { 20.0, 25.5, 19.0 },
                { 12.0, 17.0, 16.5 },
                { 28.0, 30.0, 26.0 },
                { 10.0, 14.0, 13.5 },
                { 21.0, 23.0, 20.0 },
                { 18.0, 27.0, 24.5 }
        };
        double[] result = pp.sumaDias(diasTotales);
        sumarPintado(result);
        int[] dias = pp.diasmenoresque50(diasTotales);
        mayoresPintado(dias);
    }
}
