package ejercicios.ejercicio1;

import java.time.LocalDate;

public class Profesor extends Persona{
    private TipoProfesor tipoProfesor;

    public Profesor(String nombreCompleto, String telefono, LocalDate fechaNacimiento, SexoPersona sexoPersona, TipoProfesor tipoProfesor) {
        super(nombreCompleto, telefono, fechaNacimiento, sexoPersona);
        this.tipoProfesor = tipoProfesor;
    }

    public TipoProfesor getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(TipoProfesor tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }

    @Override
    public String toString() {
        return String.format("PROFESOR %s, %s%n", tipoProfesor, super.toString());
    }
}
