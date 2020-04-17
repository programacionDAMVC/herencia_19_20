package ejercicios.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //el nombre completo, el teléfono, la fecha de nacimiento y el sexo que podrás
    //ser hombre o mujer.
    private String nombreCompleto;
    private String telefono;
    private LocalDate fechaNacimiento;
    private SexoPersona sexoPersona;

    public Persona(String nombreCompleto, String telefono, LocalDate fechaNacimiento, SexoPersona sexoPersona) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.sexoPersona = sexoPersona;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public SexoPersona getSexoPersona() {
        return sexoPersona;
    }

    public void setSexoPersona(SexoPersona sexoPersona) {
        this.sexoPersona = sexoPersona;
    }

    public boolean esMayorDeEdad(){
        return obtenerNumeroAnnos() > 17;
    }

    @Override
    public String toString() {
        return String.format("%s %d años %s y teléfono %s%n", nombreCompleto, obtenerNumeroAnnos(), sexoPersona.toString(), telefono );
    }

    private int obtenerNumeroAnnos() {
        Period period = Period.between(fechaNacimiento, LocalDate.now());
        return period.getYears();
    }
}
