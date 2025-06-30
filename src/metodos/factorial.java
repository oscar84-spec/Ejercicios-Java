package metodos;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(".:Factorial de un número:.\n");
        System.out.println("Ingresa un número entero: ");
        int number = scanner.nextInt();

        int resultado = factorialNumber(number);
        System.out.println("El factorial del número: " + number + " es: " + resultado);

    }

    static int factorialNumber(int number){
        if(number == 0 || number == 1) return 1;
        int resultado = 1;

        for (int i = 1; i <= number; i++){
            resultado *= i;
        }
        return resultado;
    }
}
