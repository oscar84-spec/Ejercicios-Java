package arrays;

import java.util.Scanner;

public class averageArrays {
    public static void main(String[] args){
        System.out.println(".:Promedio de números en un Array:.\n");
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el número en la posición: [" + i + "]");
            nums[i] = scanner.nextInt();
        }

        int result = 0;

        for (int num : nums) {
            result += num;
        }
        System.out.println("El promedio es: " + (result / 5));
    }
}
