package metodos;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n.:¿Es un número primo?:.\n");
        System.out.println("Ingrese un número entero:");
        int number = scanner.nextInt();

        isPrimo(number);
    }

    static void isPrimo(int number){
        int count = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                count++;
            }
        }
        if (count == 2) {
            System.out.println("El número " + number + " es primo");
        }else {
            System.out.println("El número " + number + " no es primo");
        }
    }
}
