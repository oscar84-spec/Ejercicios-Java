package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class invertirArreglo {
    public static void main(String[] args){
        System.out.println(".:Invertir Arreglo:.\n");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        int[] result = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Ingrese un número: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--){
            result[count] = numbers[i];
            System.out.println("Contador: " + (numbers.length - 1 - i) );
            count++;
        }
        System.out.println("-------------------------------------------------\n");
        System.out.println(Arrays.toString(result));
    }
}
