package teoria.automocion;

public class TestAutmovil {
    public static void main(String[] args) {
        Coche coche = new Coche(7, 5, 7);
        System.out.println(coche);
        double kilometroRecorridos = 98.7;
        System.out.printf("Consumo %.2f litros recorriendo %.2f km%n",
                coche.obtenerLitrosConsumidosPorKm(kilometroRecorridos), kilometroRecorridos );
        Moto moto = new Moto(4.5, Carnet.A1);
        System.out.println(moto);
        System.out.printf("Consumo %.2f litros recorriendo %.2f km%n",
                moto.obtenerLitrosConsumidosPorKm(kilometroRecorridos), kilometroRecorridos );
    }
}
