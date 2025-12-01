public class payo {
    public static String[] paisesdecalar() {
        String[] paises = new String[] { "Madrid", "Lugo", "Peru" };
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i + 1) + ": " + paises[i]);

        }
        return paises;
    }

    public static String[] paisesPintar(String[] pintar) {
        String[] paises = new String[pintar.length];
        for (int i = 0; i < paises.length; i++) {
            paises[i] = pintar[i].toUpperCase();
            System.out.println("Pais " + (i + 1) + ": " + paises[i]);

        }
        return paises;
    }

    public static void main(String[] args) {
        String[] resultado = payo.paisesdecalar();
        String[] copia = payo.paisesPintar(resultado);
    }
}
