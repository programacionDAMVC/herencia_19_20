package teoria.figurasCuadraticas;

public class Rombo  extends Cuadrilatero{
    private int diagonal1;
    private int diagonal2;

    public Rombo( int diagonal1, int diagonal2) {

        super((int) Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2 ) / 2.0),
                (int) Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2 ) / 2.0));
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calcularArera() {
        return diagonal1 * diagonal2 / 2.0;
    }

    @Override
    public String toString() {
        return String.format("SOY UN ROMBO%n%s", super.toString());
    }
}
