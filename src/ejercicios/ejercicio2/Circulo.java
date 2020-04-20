package ejercicios.ejercicio2;

public class Circulo extends FiguraCircular {
    public Circulo(double radio) {
        super(radio, radio);
    }
    @Override
    public String toString() {
        return String.format("CÍRCULO, de %.2f de radio, de %.2f de área y de %.2f de perímetro%n",
                semiejeMayor,  cacularArea(), calcularPerimetro());
    }
}
