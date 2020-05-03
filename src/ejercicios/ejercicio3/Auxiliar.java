package ejercicios.ejercicio3;

import java.time.LocalDate;

public class Auxiliar {

    public static boolean validarDNI(String dni) {
            return dni.toLowerCase().matches("[0-9]{8}[a-z]");
        }
    public static boolean validarNumeroReal(String numero) {
            return numero.matches("[0-9](\\.[0-9]{1,5})?|[1-8][0-9](\\.[0-9]{1,5})?|9[0-9](\\.[0-9]{1,5})?");
    }

  /*  public static void main(String[] args) {
        System.out.println(validarNumeroReal("99.36"));
    }*/

    public static LocalDate obtenerFecha(String token) {
        String[] tokens = token.split("/"); //   4/24/1996 Mes, año 1996 4, día 24
        return LocalDate.of(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
    }

    public static MateriaImpartida obtenerMateriaImpartida(String token) {
        switch (token) {
            case "PROGRAMACION":
                return MateriaImpartida.programacion;
            case "SISTEMAS INFORMATICOS":
                return MateriaImpartida.sistemasInformaticos;
            case "LENGUAJES DE MARCAS":
                return MateriaImpartida.lenguajesMarcas;
            case "ENTORNOS DE PROGRAMACION":
                return MateriaImpartida.entornosDesarrollo;
            case "BASE DE DATOS":
                return MateriaImpartida.baseDatos;
            case "EMPRESAS":
                return MateriaImpartida.empresas;
            default:
                return null;
        }
    }

    public static boolean validarNombreApellidos(String nombre) {
            return nombre.toLowerCase().matches("[a-záéíóúñü]+");
    }
}
