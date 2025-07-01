package POO;

import java.text.DecimalFormat;

public class Circulo {
    float radio;
    DecimalFormat df = new DecimalFormat("#.0000");

    public void perimetro(){
        double p = (2 * this.radio) * Math.PI;
        System.out.println("EL perímetro del círculo es: " + df.format(p));
    }

    public void area(){
        double a = Math.PI * (Math.pow(this.radio, 2));

        System.out.println("El área del círculo es: " + df.format(a));
    }
}
