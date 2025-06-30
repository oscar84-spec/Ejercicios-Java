package bucles;

import java.util.Scanner;

public class sumaNumerosPares {
    public static void main(String[] args){
        System.out.println(".:Suma de números pares:.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= num; i++){
            if(i % 2 == 0){
                result += i;
            }
        }
        System.out.println("La suma total es: " + result);
    }
}
