package estructuras_condicionales;

import java.util.Scanner;

public class calificación {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(".:Calificación:.");
        System.out.println("Ingrese su calificación");
        float calificacion = scanner.nextFloat();

        if(calificacion < 60){
            System.out.println("Reprobado");
        } else if (calificacion >= 60 && calificacion <= 70) {
            System.out.println("Regular");
        } else if (calificacion > 70 && calificacion <= 85) {
            System.out.println("Bueno");
        }else {
            System.out.println("Excelente");
        }
    }
}
