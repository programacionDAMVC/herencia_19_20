package teoria.automocion;

public class Coche extends Automovil {
    private int numeroPuertas;
    private int numeroAsientos;

    public Coche( double consumo, int numeroPuertas, int numeroAsientos) {
        super(4, consumo);
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return String.format("%SSoy un coche con número de puertas %d y con %d asientos%n",
                super.toString(), numeroPuertas, numeroAsientos);
    }
}
