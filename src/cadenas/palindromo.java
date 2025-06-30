package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class palindromo {
    public static void main(String[] args){
        System.out.println(".:Palindromo:.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        String str = palabra.toLowerCase();
        String str2 = "";

        if(str.contains(" ")){
            str2 = str.replace(" ", "");
        }else{
            str2 = str;
        }


        System.out.println(str2.length());
        char[] nuevaPalabra = new char[str2.length()];
        int count = 0;

        for (int j = str2.length() - 1; j >= 0; j--) {
            nuevaPalabra[count] = str2.charAt(j);
            count++;
        }

        System.out.println(nuevaPalabra);

        if (Arrays.equals(str2.toCharArray(), nuevaPalabra)){
            System.out.println("La palabra " + palabra + " es palindromo");
        }else {
            System.out.println("La palabra " + palabra + " no es palindromo");
        }

    }
}
