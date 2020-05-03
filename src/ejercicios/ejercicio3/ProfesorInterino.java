package ejercicios.ejercicio3;

import java.time.LocalDate;

public class ProfesorInterino extends  Profesor {
    /*Tiempo de contrato en meses
• Constructor
• Getters y setters
• toString que añada al toString de la clase anterior, separando por comas el tiempo de
contrato.*/
    private int tiempoContrato;

    public ProfesorInterino(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
                            double sueldoBruto, MateriaImpartida materiaImpartida, int tiempoContrato) {
        super(dni, nombre, apellido1, apellido2, fechaNacimiento, sueldoBruto, materiaImpartida);
        this.tiempoContrato = tiempoContrato;
    }

    public int getTiempoContrato() {
        return tiempoContrato;
    }

    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(), tiempoContrato);
    }
}
