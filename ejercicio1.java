import java.util.Scanner;

public class ejercicio1 {

    public String accionSemaforoIf(String color){
        if (color == "rojo") {
            return "Para";
        } else if(color == "amarillo") {
            return "Atento";
              } else if(color == "amarillo") {
            return "Atento";
        }else{
        return "Solo elije entre los 3 colores principales ";
    }

    public String accionSemaforoSwitch(String color) {
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Semaforo semaforo = new Semaforo();

    }
}