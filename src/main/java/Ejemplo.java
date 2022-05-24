import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        System.out.println("Programa de ejemplo");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = leer.nextInt();

        System.out.println("La suma es: "+(a+b));
    }
}
