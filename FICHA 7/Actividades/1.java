import java.util.Scanner;

public class App {

    public static int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        System.out.print("Introduzca un numerador entero: ");
        int numerador = explorador.nextInt();
        System.out.print("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();

        if (denominador == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            int resultado = cociente(numerador, denominador);
            System.out.printf("Resultado: %d / %d = %d%n", numerador, denominador, resultado);
        }
    }
}
