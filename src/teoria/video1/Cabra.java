package teoria.video1;

public final class Cabra  extends Mamifero {
    private boolean cuernos;

    public Cabra( boolean cuernos) {
        super(4, TipoMamifero.TERRESTRE);
        this.cuernos = cuernos;
    }

    public boolean isCuernos() {
        return cuernos;
    }

    public void setCuernos(boolean cuernos) {
        this.cuernos = cuernos;
    }

    @Override
    public String toString() {
        return String.format("CABRA con cuernos %b, con %d patas y de tipo %s%n", cuernos, getNumeroPatas(), getTipoMamifero());
    }

 /*   @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
}
