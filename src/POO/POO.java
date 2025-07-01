package POO;

import java.util.Scanner;

public class POO {
    public static void main(String[] args){
        //Ejercicio 1:
        /*Persona persona = new Persona();
        persona.name = "Oscar";
        persona.age = 15;
        persona.saludar();*/

        //Ejercicio 2:

        /*Circulo circulo = new Circulo();
        circulo.radio = 3f;

        circulo.perimetro();
        circulo.area();*/

        //Ejercicio 3
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("\n.:Cajero Automático:.\n");

        terminal: while (true){
            mostrarOpciones();
            System.out.println("Opción: ");
            String opc = scanner.next();

            switch (opc){
                case "1":
                    cuenta.saldoDisponible();
                    break;
                case "2":
                    cuenta.depositarDinero();
                    break;
                case "3":
                    cuenta.retirarDinero();
                    break;
                case "4":
                    System.out.println("Adiós");
                    scanner.close();
                    break terminal;
            }
        }

    }

    public static void mostrarOpciones(){
        System.out.println("1.- Consultar Saldo");
        System.out.println("2.- Depositar dinero");
        System.out.println("3.- Retirar dinero");
        System.out.println("4.- Salir");
    }
}
