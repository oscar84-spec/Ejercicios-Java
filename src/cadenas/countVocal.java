package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class countVocal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(".:Contar Vocales:.\n");
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Convertir a minúsculas para simplificar las comparaciones
        frase = frase.toLowerCase();

        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La frase contiene " + contadorVocales + " vocales.");
    }
}
