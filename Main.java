
package triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 3.0, 5.0, 4.0, 3.0); 
        System.out.println(triangulo);
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
    }
}