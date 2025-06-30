package estructuras_condicionales;

import java.util.Scanner;

public class mayor {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(".:¿Cuál es mayor?:.\n");
        System.out.println("Ingresa el primer número: ");
        int numA = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int numB = scanner.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int numC = scanner.nextInt();

        if(numA > numB && numA > numC){
            System.out.println("El número mayor es: " + numA);
        } else if (numB > numA && numB > numC) {
            System.out.println("El número mayor es: " + numB);
        }else{
            System.out.println("El número mayor es: " + numC);
        }

    }
}
