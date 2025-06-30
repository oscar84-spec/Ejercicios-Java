package arrays;

import java.util.Scanner;

public class mayorMenor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Ingresa el número "+ (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int menor = numbers[0];
        int mayor = numbers[0];

        for (int number : numbers) {
            if (number < menor) {
                menor = number;
            }
            if (number > mayor) {
                mayor = number;
            }
        }


        System.out.println("EL número menor es: " + menor);

        System.out.println("EL número mayor es: " + mayor);
    }
}
