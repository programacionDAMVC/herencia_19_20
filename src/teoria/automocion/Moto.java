package teoria.automocion;

public class Moto extends Automovil{
    private Carnet carnet;

    public Moto(double consumo, Carnet carnet) {
        super(2, consumo);
        this.carnet = carnet;
    }
    @Override
    public String toString() {
        return String.format("%SSoy una moto con carnet %s%n",
                super.toString(), carnet);
    }
}
