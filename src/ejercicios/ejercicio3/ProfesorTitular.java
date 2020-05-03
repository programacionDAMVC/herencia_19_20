package ejercicios.ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class ProfesorTitular extends Profesor {

    private LocalDate fechaIncorporacion;

    public ProfesorTitular(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, double sueldoBruto,
                           MateriaImpartida materiaImpartida, LocalDate fechaIncorporacion) {
        super(dni, nombre, apellido1, apellido2, fechaNacimiento, sueldoBruto, materiaImpartida);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return String.format(("%s, %d/%d/%d"), super.toString(), fechaIncorporacion.getDayOfMonth(), fechaIncorporacion.getMonthValue(),
                fechaIncorporacion.getYear());
    }

    @Override
    public double obtenerSueldoNeto(double retencion) {
        return super.obtenerSueldoNeto(retencion)  + 100.0 * obtenerNumeroTrienios();  //cambio getSueldoBruto() por super.obtenerSueldoNeto
    }

    private int obtenerNumeroTrienios() {
        Period periodo = Period.between(fechaIncorporacion, LocalDate.now());
        return periodo.getYears() / 3;
    }

}
