
package persona;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad
    public String calcularEdad() {
        LocalDate hoy = LocalDate.now();
        long años = ChronoUnit.YEARS.between(fechaNacimiento, hoy);
        long meses = ChronoUnit.MONTHS.between(fechaNacimiento, hoy) % 12;
        long dias = ChronoUnit.DAYS.between(fechaNacimiento.plusYears(años).plusMonths(meses), hoy);

        return años + " años, " + meses + " meses y " + dias + " días";
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}



