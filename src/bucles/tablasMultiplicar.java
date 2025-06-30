package bucles;

import java.util.Scanner;

public class tablasMultiplicar {
    public static void main(String[] args){
        System.out.println(".:Tablas de Multiplicar:.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
