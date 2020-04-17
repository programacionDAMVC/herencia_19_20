package teoria.ejemplo1;

public class ClasePadre {

    private String atributoPadre;

    public ClasePadre(String atributoPadre) {
        this.atributoPadre = atributoPadre;
    }

    public String getAtributoPadre() {
        return atributoPadre;
    }

    @Override
    public String toString() {
        return String.format("SOY LA CLASE PADRE %s%n", atributoPadre);
    }
}
