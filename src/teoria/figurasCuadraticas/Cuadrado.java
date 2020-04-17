package teoria.figurasCuadraticas;

public class Cuadrado extends Cuadrilatero {


    public Cuadrado(int lado) {
        super(lado, lado);
    }
    @Override
    public String toString() {
        return String.format("SOY UN CUADRADO%n%s", super.toString());
    }
}
