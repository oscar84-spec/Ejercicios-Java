package estructuras_condicionales;

import java.util.Scanner;

public class parOImpar {
    public static void main(String[] args){
        System.out.println(".:¿Par o Impar?:.");
        System.out.println("Ingrese un número entero: \n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "El número es par" : "El número es impar");
    }
}
