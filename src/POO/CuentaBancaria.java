package POO;

import java.util.Scanner;

public class CuentaBancaria {
    float saldo = 1000000;
    Scanner scanner = new Scanner(System.in);

    public void saldoDisponible(){
        System.out.println("El saldo actual es: " + this.saldo);
    }

    public void retirarDinero(){
        System.out.println("Ingrese la cantidad que desea retirar:");
        float dinero = scanner.nextFloat();
        this.saldo -= dinero;
        System.out.println("Su saldo actualizado es: " + this.saldo);
    }

    public void depositarDinero(){
        System.out.println("Ingrese la cantidad que desea depositar:");
        float dinero = scanner.nextFloat();

        this.saldo += dinero;
        System.out.println("Su saldo actualizado es: " + this.saldo);
    }
}
