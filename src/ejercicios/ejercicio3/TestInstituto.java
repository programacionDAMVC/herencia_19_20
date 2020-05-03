package ejercicios.ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestInstituto {
    private static Instituto instituto;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        cargarDatos();
        while (true){
            mostrarMenu();
            String opcion = sc.nextLine();
            if (opcion.equals("0")) {
                System.out.println("Fin de programa");
                try {
                    instituto.escribirDatosProfesorado();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }
            if (opcion.equals("4")) {
                instituto.mostrarDatosProfesorado();
            }
            if (opcion.equals("2")){
                borrarProfesor();
            }
            if (opcion.equals("5"))  {
                mostrarSueldos();
            }
            if (opcion.equals("3"))  {
                ampliarContrato();
            }
            if (opcion.equals("1")){
                nuevoProfesor();
            }

        }

    }

    private static void nuevoProfesor() {
        /*public Profesor(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
                    double sueldoBruto, MateriaImpartida materiaImpartida) */
        // this.fechaIncorporacion = fechaIncorporacion; profesor Titular
        //this.tiempoContrato = tiempoContrato; profesor Interino
        String dni;
        while (true) {
            System.out.println("Introduce un dni válido");
            dni = sc.nextLine();
            if (Auxiliar.validarDNI(dni))
                break;
        }
        String nombre;
        while (true) {
            System.out.println("Introduce un nombre válido");
            nombre = sc.nextLine();
            if (Auxiliar.validarNombreApellidos(nombre))
                break;
        }
        String apellido1;
        while (true) {
            System.out.println("Introduce un apellido válido");
            apellido1 = sc.nextLine();
            if (Auxiliar.validarNombreApellidos(apellido1))
                break;
        }
        String apellido2;
        while (true) {
            System.out.println("Introduce un apellido válido");
            apellido2 = sc.nextLine();
            if (Auxiliar.validarNombreApellidos(apellido2))
                break;
        }
        String sMes;
        int mesNacimiento = 0;
        while (true) {
            System.out.println("Introduce mes de nacimiento");
            sMes = sc.nextLine();
            if (sMes.matches("[1-9]|1[0-2]")){
                mesNacimiento = Integer.parseInt(sMes);
                break;
            }

        }
        String sDia;
        int diaNacimiento = 0;
        while (true) {
            System.out.println("Introduce día de nacimiento");
            sDia = sc.nextLine();
            if (sDia.matches("[1-9]|[12][0-9]|3[01]")){
                diaNacimiento = Integer.parseInt(sDia);
                break;
            }

        }
        String sAnno;
        int anno = 0;
        while (true) {
            System.out.println("Introduce año de nacimiento");
            sAnno = sc.nextLine();
            if (!sAnno.matches("[0-9]{4}"))
                continue;
            anno = Integer.parseInt(sAnno);
            int edad = LocalDate.now().getYear() - anno;
            System.out.println("Edad: " + edad);
            if (edad > 69   || edad < 18)
                continue;
            break;


        }
        LocalDate fechaNacimiento = Auxiliar.obtenerFecha(mesNacimiento + "/" + diaNacimiento + "/" + anno);
        String sSueldoBruto;
        double sueldoBruto;
        while (true) {
            System.out.println("Introduce sueldo bruto");
            sSueldoBruto = sc.nextLine();
            if (!sSueldoBruto.matches("[0-9]{4}(\\.[0-9]{1,5})?"))
                continue;
            sueldoBruto = Double.parseDouble(sSueldoBruto);
            if (sueldoBruto < 1000)
                continue;
            break;
        }


        MateriaImpartida materiaImpartida;
        String opcion;
        while (true) {
            System.out.println("Elige materia impartida\n");
            System.out.println("1. PROGRAMACION");
            System.out.println("2. SISTEMAS INFORMATICOS");
            System.out.println("3. LENGUAJES DE MARCAS");
            System.out.println("4. ENTORNOS DE PROGRAMACION");
            System.out.println("5. BASE DE DATOS");
            System.out.println("6. EMPRESAS\n\n");
            opcion = sc.nextLine();
            if (opcion.matches("[1-6]"))
                break;
        }
        switch (opcion) {
            case "1":
                materiaImpartida = MateriaImpartida.programacion;
                break;
            case "2":
                materiaImpartida = MateriaImpartida.sistemasInformaticos;
                break;
            case "3":
                materiaImpartida = MateriaImpartida.lenguajesMarcas;
                break;
            case "4":
                materiaImpartida = MateriaImpartida.entornosDesarrollo;
                break;
            case "5":
                materiaImpartida = MateriaImpartida.baseDatos;
                break;
            case "6":
                materiaImpartida = MateriaImpartida.empresas;
                break;
            default:
                materiaImpartida = null;
        }

        while (true) {
            System.out.println("\n\nElige opción\n");
            System.out.println("1. Profesor titular");
            System.out.println("2. Profesor interino");
            opcion = sc.nextLine();
            if (opcion.matches("[12]"))
                break;
        }
        if (opcion.equals("1")) {
            LocalDate fechaIncorporacion = LocalDate.now();
            Profesor profesor = new ProfesorTitular(dni, nombre, apellido1, apellido2, fechaNacimiento, sueldoBruto,
                    materiaImpartida, fechaIncorporacion);
            instituto.annadirProfesor(profesor);
        }
        else {
            String sTiempoContrato;
            while (true){
                System.out.println("\nIntroduce tiempo de contrato");
                sTiempoContrato = sc.nextLine();
                if (sTiempoContrato.matches("[1-9]|1[0-2]"))
                    break;
            }
            int tiempoContrato = Integer.parseInt(sTiempoContrato);
            Profesor profesor = new ProfesorInterino(dni, nombre, apellido1, apellido2, fechaNacimiento, sueldoBruto,
                    materiaImpartida, tiempoContrato);
            instituto.annadirProfesor(profesor);
        }
    }

    private static void ampliarContrato() {
        String dni;
        Profesor profesor;
        while (true) {
            System.out.println("Introduce dni");
            dni = sc.nextLine();
            if (!Auxiliar.validarDNI(dni))
                continue;
            if (instituto.getListaProfesores().indexOf(new Profesor(dni, null, null, null, null,
                    0, null)) == -1 )
                continue;
                profesor = instituto.getListaProfesores().get(instituto.getListaProfesores().indexOf(new Profesor(dni, null, null, null, null,
                        0, null)));
                 if (! (profesor instanceof ProfesorInterino))
                     continue;
                ProfesorInterino profesorInterino = (ProfesorInterino) profesor;
                while (true){
                    System.out.println("Introduce ampliación de contrato");
                    String contrato = sc.nextLine();
                    if (!contrato.matches("[1-9]|1[01]"))
                        continue;
                    if (profesorInterino.getTiempoContrato() + Integer.parseInt(contrato) > 12)
                        continue;
                    instituto.actualizarContrato(profesorInterino, Integer.parseInt(contrato));
                    break;
                }
               break;
            }


        }



    private static void mostrarSueldos() {
        String retencion;
        while (true) {
            System.out.println("Introduce retención");
             retencion = sc.nextLine();
            if (!Auxiliar.validarNumeroReal(retencion))
                continue;
            break;
        }
        Map<String, Double> sueldos = instituto.obtenerSueldoProfesores(Double.parseDouble(retencion));
        for ( String dni : sueldos.keySet()) {
            System.out.printf("%s: %.2f%n", dni, sueldos.get(dni));
        }
    }

    private static void borrarProfesor() {
        while (true){
            System.out.println("Introduce DNI valida");
            String dni = sc.nextLine();
            if (! Auxiliar.validarDNI(dni))
                continue;
            if (instituto.eliminarProfesor(new Profesor(dni, null, null, null,
                    null, 0, null)))
                break;
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n0.- Salir.");
        System.out.println("1.- Añadir profesor.");
        System.out.println("2.- Borrar profesor.");
        System.out.println("3.- Ampliar contrato.");
        System.out.println("4.- Mostrar profesores.");
        System.out.println("5.- Mostrar sueldos.\n");
        System.out.println("Introduce opcion");
    }

    private static void cargarDatos() {
        try {
            List<String> lineasFichero = Files.readAllLines(Paths.get("ficheros/profesores.csv"));
            String nombreInstituto = lineasFichero.get(0);
            List<Profesor> listaProfesores = new ArrayList<>();
            for (int i = 1; i < lineasFichero.size() ; i++) {
                //System.out.println(lineasFichero.get(i));
                String[] tokens = lineasFichero.get(i).split(";");
               /* Annetta;Lennie;Tantum;42562598r;4/24/1996;1766.1;ENTORNOS DE PROGRAMACION;7/15/2007
                Kelsey;Jereme;Moston;15362001G;7/11/1975;1873.3;LENGUAJES DE MARCAS;5*/
                if (tokens[tokens.length - 1 ].matches("[1-9]| (1[012])?")){
                   /*String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
                            double sueldoBruto, MateriaImpartida materiaImpartida, int tiempoContrato*/
                    Profesor profesorInterino = new ProfesorInterino(tokens[3], tokens[0], tokens[1], tokens[2],
                            Auxiliar.obtenerFecha(tokens[4]), Double.parseDouble(tokens[5]), Auxiliar.obtenerMateriaImpartida(tokens[6]),
                            Integer.parseInt(tokens[7]));
                    listaProfesores.add(profesorInterino);
                }
                else {
                    Profesor profesorTitular = new ProfesorTitular(tokens[3], tokens[0], tokens[1], tokens[2],
                            Auxiliar.obtenerFecha(tokens[4]), Double.parseDouble(tokens[5]), Auxiliar.obtenerMateriaImpartida(tokens[6]),
                            Auxiliar.obtenerFecha(tokens[7]));
                    listaProfesores.add(profesorTitular);
                }
            }
            instituto = new Instituto(listaProfesores, nombreInstituto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
