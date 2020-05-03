package ejercicios.ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Instituto {

    private  List<Profesor> listaProfesores;
    private String nombreInstituto;

    public Instituto(List<Profesor> listaProfesores, String nombreInstituto) {
        this.listaProfesores = listaProfesores;
        this.nombreInstituto = nombreInstituto;
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public boolean annadirProfesor (Profesor profesor) {
        return listaProfesores.add(profesor);
    }
    public boolean eliminarProfesor (Profesor profesor)
    {
       System.out.println(profesor.getDni());
        return listaProfesores.remove(profesor);
    }
    public boolean actualizarContrato(ProfesorInterino profesorInterino, int ampliacionContrato) {
        for (Profesor profesor: listaProfesores) {
                if (profesorInterino.equals(profesor)) {
                    profesorInterino.setTiempoContrato(profesorInterino.getTiempoContrato() + ampliacionContrato );
                    return true;
                }
        }
        return false;
    }
    public void mostrarDatosProfesorado() {
        for (Profesor profesor: listaProfesores ) {
            System.out.printf("%-15s %-15s %-15s %-15s %-20s%n",profesor.getDni(), profesor.getApellido1(), profesor.getApellido2(),
                    profesor.getNombre(), profesor.getMateriaImpartida().getValorEnum());
        }
    }
/*Un método que devuelve una Hash<String, Double> donde la clave es el DNI de los
profesores y el valor (Double) el sueldo neto del profesor, donde se tiene en cuenta que la
retención actual es del 15,5% para todos los profesores.*/

    public Map<String, Double> obtenerSueldoProfesores(double retencion) {
        Map<String , Double> listadoSueldoProfesores = new HashMap<>();
        for (Profesor profesor: listaProfesores) {
            listadoSueldoProfesores.put(profesor.getDni(), profesor.obtenerSueldoNeto(retencion));
        }
        return  listadoSueldoProfesores;
    }


/*
• Un método que guarde en un fichero los datos de los profesores, cuyo nombre de salida será
profesores.csv. Las fechas se guardan en formato 10/12/2010, tal y como vienen el fichero
original que se aporta.*/
    public void escribirDatosProfesorado() throws IOException {
        PrintWriter in = new PrintWriter(new FileWriter("ficheros/profesores.csv"));
        for (Profesor profesor: listaProfesores) {
            in.println(profesor);
            in.flush();
            //Clio;Gorden;Heakins;10937941t;2/16/1972;1878.8;SISTEMAS INFORMATICOS;11/2/1992
        }
        in.close();
    }




}
