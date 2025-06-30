package metodos;

import java.util.Scanner;

public class numeroMasGrande {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(".:El número más grande:.\n");
        int[] numbers = new int[5];
        System.out.println("Ingresará sólo 5 números.");

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int result = numeroMayor(numbers);
        System.out.println("El número mayor es: " + result);

    }

    static int numeroMayor(int[] numbers){
        int mayor = numbers[0];

        for (int number : numbers){
            if (number > mayor) mayor = number;
        }

        return mayor;
    }
}
