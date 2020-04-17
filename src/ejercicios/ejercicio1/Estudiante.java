package ejercicios.ejercicio1;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private TipoEstudio tipoEstudio;

    public Estudiante(String nombreCompleto, String telefono, LocalDate fechaNacimiento, SexoPersona sexoPersona, TipoEstudio tipoEstudio) {
        super(nombreCompleto, telefono, fechaNacimiento, sexoPersona);
        this.tipoEstudio = tipoEstudio;
    }

    public TipoEstudio getTipoEstudio() {
        return tipoEstudio;
    }

    public void setTipoEstudio(TipoEstudio tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }

    @Override
    public String toString() {
        return String.format("ESTUDIANTE de %s, %s%n", tipoEstudio, super.toString());
    }
}
