package ejercicios.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFiguraCircular {
    public static void main(String[] args) {
        try {
            List<String> lineasFichero = Files.readAllLines(Paths.get("ficheros/datos.csv"));
            lineasFichero.remove(0); //elimino la cabecera del fichero
        //    lineasFichero.forEach(System.out::println);
            Set<FiguraCircular> conjuntoCirculos = new HashSet<>();
            Set<FiguraCircular> conjuntoElipses = new HashSet<>();

            for (String linea: lineasFichero) {
                String[] tokens = linea.split(",");
                if (tokens[0].equals(tokens[1]))
                    conjuntoCirculos.add(new Circulo(Double.parseDouble(tokens[0])));
                else
                    conjuntoElipses.add(new Elipse(Double.parseDouble(tokens[0]), Double.parseDouble(tokens[1])));
            }

            Circulo circuloDeAreaMasGrande = (Circulo) obtenerFiguraCircularDeAreaMasGrande(conjuntoCirculos);
            Elipse elipseDeAreaMasGrande   = (Elipse) obtenerFiguraCircularDeAreaMasGrande(conjuntoElipses);
            Circulo circuloDePerimetroMasGrande = (Circulo) obtenerFiguraCircularDePerimetroMasGrande(conjuntoCirculos);
            Elipse elipseDePerimetroGrande   = (Elipse) obtenerFiguraCircularDePerimetroMasGrande(conjuntoElipses);

            System.out.printf("Nº de círculos creados %d%n", conjuntoCirculos.size());
            System.out.printf("Nº de elipses creados %d%n", conjuntoElipses.size());
            System.out.printf("El círculo de mayor área es %s%n", circuloDeAreaMasGrande);
            System.out.printf("El círculo de mayor perímetro es %s%n", circuloDePerimetroMasGrande);
            System.out.printf("La elipse de mayor área es %s%n", elipseDeAreaMasGrande);
            System.out.printf("La elipse de mayor perímetro es %s%n", elipseDePerimetroGrande);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static FiguraCircular obtenerFiguraCircularDeAreaMasGrande (Set<FiguraCircular> conjunto) {
        double areaMasGrande = 0;
        FiguraCircular figuraCircularMasGrande = null;
        for (FiguraCircular figuraCircular: conjunto) {
            if (figuraCircular.cacularArea() > areaMasGrande){
                figuraCircularMasGrande = figuraCircular;
                areaMasGrande = figuraCircular.cacularArea();
            }
        }
        return figuraCircularMasGrande;
    }

    public static FiguraCircular obtenerFiguraCircularDePerimetroMasGrande (Set<FiguraCircular> conjunto) {
        double perimetroMasGrande = 0;
        FiguraCircular figuraCircularMasGrande = null;
        for (FiguraCircular figuraCircular: conjunto) {
            if (figuraCircular.calcularPerimetro() > perimetroMasGrande){
                figuraCircularMasGrande = figuraCircular;
                perimetroMasGrande = figuraCircular.calcularPerimetro();
            }
        }
        return figuraCircularMasGrande;
    }
}
