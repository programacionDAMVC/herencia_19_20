package teoria.video1;

public class Mamifero extends Animal {
    private TipoMamifero tipoMamifero;

    public Mamifero(int numeroPatas, TipoMamifero tipoMamifero) {
        super(numeroPatas);
        this.tipoMamifero = tipoMamifero;
    }

    public TipoMamifero getTipoMamifero() {
        return tipoMamifero;
    }

    public void setTipoMamifero(TipoMamifero tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }
    public String obtenerSonido(){
        return "";
    }
    @Override
    public String toString() {
        return String.format("MAMÍFERO, de tipo %s y con número de patas %d%n",
                tipoMamifero.toString(), super.getNumeroPatas());
    }
}
