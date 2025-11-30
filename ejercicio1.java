import java.util.Scanner;

public class ejercicio1 {

    public String accionSemaforoIf(String color) {
        if (color.equalsIgnoreCase("rojo")) {
            return "Para";
        } else if (color.equalsIgnoreCase("amarillo")) {
            return "Atento";
        } else if (color.equalsIgnoreCase("verde")) {
            return "pasa";
        } else {
            return "Solo elije entre los 3 colores principales ";
        }
    }

    public String accionSemaforoSwitch(String color) {
        return switch (color) {
            case "rojo" -> "Para";
            case "amarillo" -> "sigue";
            case "verde" -> "pasa";
            default -> "Solo 3 colores";

        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ejercicio1 jose = new ejercicio1();
        System.out.print("Escoje un color: ");

        String color = sc.nextLine();
        String resultado = jose.accionSemaforoIf(color);
        System.out.println(resultado);
        System.out.print("Escoje otro color: ");
        String color1 = sc.nextLine();
        String resultado2 = jose.accionSemaforoSwitch(color1);
        System.out.println(resultado2);
        sc.close();
    }
}
