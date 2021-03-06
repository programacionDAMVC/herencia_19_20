package ejercicios.ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Comparable<Persona>{

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;

    public Persona(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    //toString con formato apellido1, apellido2, nombre, dni, fecha_nacimiento

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %d/%d/%d", apellido1, apellido2, nombre, dni,fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
      //  if (o.getClass() != this.getClass()) return false;
        Persona  persona = (Persona) o;
        return Objects.equals(this.dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public int compareTo(Persona persona) {
        return this.apellido1.compareTo(persona.apellido1);

    }


}