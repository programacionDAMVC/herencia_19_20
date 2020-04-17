package teoria.figurasCuadraticas;

public class Rectangulo extends Cuadrilatero {

    public Rectangulo(int lado1, int lado2) {
        super(lado1, lado2);
    }
    @Override
    public String toString() {
        return String.format("SOY UN RECTÁNGULO%n%s", super.toString());
    }
}
