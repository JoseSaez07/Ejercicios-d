import java.util.Scanner;

public class jose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        while (true) {
            System.out.print("Dime tu edad: ");
            edad = sc.nextInt();
            if (edad > 0 && edad <= 120) {
                break;
            }
            System.out.println("Vuelve a pedirlo");
        }
        System.out.println("Edad valida, tu edad es de " + edad + "años");
        sc.close();
    }
}
