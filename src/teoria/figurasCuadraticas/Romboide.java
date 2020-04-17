package teoria.figurasCuadraticas;

public class Romboide extends Cuadrilatero {
    private double angulo;

    public Romboide(int lado1, int lado2, double angulo) {
        super(lado1, lado2);
        this.angulo = angulo;
    }

    @Override
    public double calcularArera() {
        return getLado1() * getLado2() * Math.sin(angulo);
    }

    @Override
    public String toString() {
        return String.format("SOY UN ROMBOIDE%n%s", super.toString());
    }
}
