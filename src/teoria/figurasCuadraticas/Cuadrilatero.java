package teoria.figurasCuadraticas;

public class Cuadrilatero {
    private int lado1;
    private int lado2;

    public Cuadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public int calcularPerimetro() {
        return lado1 * 2 + lado2 * 2;
    }
    public double calcularArera(){
        return lado1 * lado2;
    }
    @Override
    public String toString() {
        return String.format("CUADRILATERO: de lado %d y %d, de perímetro %d, y de área %.2f%n",
                lado1, lado2, calcularPerimetro(), calcularArera());
    }
}
