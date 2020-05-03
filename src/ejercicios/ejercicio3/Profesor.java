package ejercicios.ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Profesor extends Persona{

    private double sueldoBruto;
    private MateriaImpartida materiaImpartida;

    public Profesor(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
                    double sueldoBruto, MateriaImpartida materiaImpartida) {
        super(dni, nombre, apellido1, apellido2, fechaNacimiento);
        this.sueldoBruto = sueldoBruto;
        this.materiaImpartida = materiaImpartida;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public MateriaImpartida getMateriaImpartida() {
        return materiaImpartida;
    }

    public void setMateriaImpartida(MateriaImpartida materiaImpartida) {
        this.materiaImpartida = materiaImpartida;
    }

    public double obtenerSueldoNeto(double retencion) {
        return sueldoBruto - sueldoBruto * retencion / 100.0 ;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f, %s", super.toString(), sueldoBruto, materiaImpartida.getValorEnum());
    }

}
