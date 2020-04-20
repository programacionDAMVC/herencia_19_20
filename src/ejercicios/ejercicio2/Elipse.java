package ejercicios.ejercicio2;

public class Elipse extends FiguraCircular {

    public Elipse(double semiejeMayor, double semiejeMenor) {
        super(semiejeMayor, semiejeMenor);
    }

    @Override
    public String toString() {
        return String.format("ELIPSE, de %.2f de semieje1, de %.2f de semieje2, de %.2f de área y de %.2f de perímetro%n",
                semiejeMayor, semiejeMenor, cacularArea(), calcularPerimetro());
    }
}
