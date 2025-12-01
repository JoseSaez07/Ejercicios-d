public class bury {
    public static String[] paises() {
        String[] paises = new String[] { "España", "Francia", "Meru", "Lima", "Nose" };
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i + 1) + ": " + paises[i]);
        }

        return paises;
    }

    public static String[] copiarpais(String[] team) {
        String[] paises = new String[team.length];
        for (int i = 0; i < paises.length; i++) {
            paises[i] = team[i].toUpperCase();
            System.out.println("Pais " + (i + 1) + ": " + paises[i]);
        }

        return paises;
    }

    public static void main(String[] args) {
        // Obtener los países originales
        System.out.println("Paises minuscula: ");
        System.out.println();
        String[] originales = bury.paises();
        System.out.println("-----------------------");
        // Copiarlos y ponerlos en mayúsculas
        System.out.println();
        System.out.println("Paises mayuscula: ");
        System.out.println();
        String[] copia = copiarpais(originales);
        System.out.println("-----------------------");
    }
}