package cadenas;

import java.util.Objects;
import java.util.Scanner;

public class cuantasVecesApareceLetra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(".:¿Cuántas veces aparece una letra en una palabra:.\n");
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        System.out.println("¿Qué letra busca?: ");
        String letter = scanner.next();

        String str = palabra.toLowerCase();
        int count = 0;

        for (int i  = 0; i < str.length(); i++){
            char letra = str.charAt(i);
            if(letter.charAt(0) == letra){
                count++;
            }
        }

        System.out.println(count);
    }
}
