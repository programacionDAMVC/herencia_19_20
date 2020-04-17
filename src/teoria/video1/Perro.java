package teoria.video1;

public final class Perro extends Mamifero {
    private String raza;

    public Perro( String raza) {
        super(4, TipoMamifero.TERRESTRE);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public final String obtenerSonido() {
        return "ladra";
    }

    @Override
    public String toString() {
        return String.format("PERRO de raza %s, %s%n", raza, super.toString());
    }


}
