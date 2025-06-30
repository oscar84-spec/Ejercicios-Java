import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /**System.out.println(".: Calculadora :.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un primer número: ");
        int numA = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int numB = scanner.nextInt();

        System.out.println("El resultado de las operaciones es:\n");
        System.out.println("Suma: " + (numA + numB));
        System.out.println("Resta: " + (numA - numB));
        System.out.println("Multiplicación: " + (numA * numB));
        System.out.println("División: " + (numA / numB));*/

        /**System.out.println(".:¿Cuántos días has vivido?:.\n");
        System.out.println("Ingresa tu edad: ");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        float ageTotal = age * 365;
        System.out.println("Ha vivido " + ageTotal + " días en total.");*/

        //Conversor de temperatura----------------------------------------

        System.out.println(".:Converso de grados Celsius a Fahrenheit:.\n");
        System.out.println("Eliga una de la siguientes opciones: ");
        System.out.println("1.-De Celsius a Fahrenheit: ");
        System.out.println("2.-De Fahrenheit a Celsius: ");
        System.out.println("3.-Salir");
        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();

         switch (opc){
            case 1:
                celciusToFahrenheit(scanner);
                break;
            case 2:
                fahrenheitToCelsius(scanner);
                break;
            case 3:
                System.out.println("Terminando el programa");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    static void celciusToFahrenheit(Scanner scanner){
        System.out.println("Ingrese la temperatura: \n");
        float temp = scanner.nextFloat();
        float result = (1.8f * temp) + 32;
        System.out.println("La temperatura es: " + result + " °F");
    }

    static void fahrenheitToCelsius(Scanner scanner){
        System.out.println("Ingrese la temperatura: \n");
        float temp = scanner.nextFloat();
        float result = (temp - 32) / 1.8f;
        System.out.println("La temperatura es: " + result + " °C");
    }
}