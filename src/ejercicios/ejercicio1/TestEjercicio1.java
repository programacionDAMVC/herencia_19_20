package ejercicios.ejercicio1;

import java.time.LocalDate;

public class TestEjercicio1 {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("Ángel Garrido", "666661122", LocalDate.of(1999, 11, 11),
                SexoPersona.HOMBRE, TipoEstudio.FP);
        Persona profesor = new Profesor("Luisa Garrido", "611661122", LocalDate.of(1990, 11, 11),
                SexoPersona.MUJER, TipoProfesor.FIJO);
        System.out.printf("Estudiante mayor de edad: %b%n", estudiante.esMayorDeEdad());
        System.out.println(estudiante);
        System.out.println(profesor);
    }
}
