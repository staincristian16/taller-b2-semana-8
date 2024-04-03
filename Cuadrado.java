
package cuadrado;


public class Cuadrado {
    private double lado; 


    public Cuadrado(double lado) {
        this.lado = lado;
    }

 
    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }


    public double calcularArea() {
        return lado * lado;
    }

 
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}

