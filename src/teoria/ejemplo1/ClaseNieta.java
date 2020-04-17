package teoria.ejemplo1;

public class ClaseNieta extends ClaseHija {

    private String atributoNieta;

    public ClaseNieta(String atributoPadre, String atributoHija, String atributoNieta) {
        super(atributoPadre, atributoHija);
        this.atributoNieta = atributoNieta;
    }

    @Override
    public void mostrarDatosPadreHija() {
        System.out.println(String.format("Atributo nieta %s, atributo hija %s y atributo padre %s",
                atributoNieta, getAtributoHija(), getAtributoPadre()));
    }

    @Override
    public String toString() {
        return String.format("SOY LA CLASE HIJA %s%n", atributoNieta);
    }
}
