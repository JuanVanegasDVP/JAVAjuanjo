import java.util.*;
import functions.funciones;

public class Numeros {
    public static void main(String[] args) {
        float num1, num2;
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese que operación desea hacer:\n" +
                    "1. Para sumar\n" +
                    "2. Para restar\n" +
                    "3. Para multiplicar\n" +
                    "4. Para dividir\n" +
                    "0. Para salir");
            int num = sc.nextInt();

            if (num != 0) {
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextFloat();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextFloat();

                funciones operaciones = new funciones(num1, num2, 0);

                switch (num) {
                    case 1:
                        operaciones.Sum();
                        break;
                    case 2:
                        operaciones.Res();
                        break;
                    case 3:
                        operaciones.Mul();
                        break;
                    case 4:
                        operaciones.Div();
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } while (opc != 0);

        sc.close();
    }
}

