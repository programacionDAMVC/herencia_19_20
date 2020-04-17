package teoria.automocion;

public class Automovil {
    private int numeroRuedas;
    private double consumo;

    public Automovil(int numeroRuedas, double consumo) {
        this.numeroRuedas = numeroRuedas;
        this.consumo = consumo;
    }

    public double obtenerLitrosConsumidosPorKm(double kilometros) {
        return consumo * kilometros / 100.0;
    }

    @Override
    public String toString() {
        return String.format("Soy un automóvil de %d ruedas y consumo %.2f%n", numeroRuedas, consumo);
    }
}
