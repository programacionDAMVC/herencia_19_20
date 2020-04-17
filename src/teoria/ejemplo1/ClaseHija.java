package teoria.ejemplo1;

public class ClaseHija  extends ClasePadre{
    private String atributoHija;

    public ClaseHija(String atributoPadre, String atributoHija) {
        super(atributoPadre);
        this.atributoHija = atributoHija;
    }

    public String getAtributoHija() {
        return atributoHija;
    }

    public void mostrarDatosPadreHija(){
        System.out.println(String.format("Atributo hija %s y atributo padre %s", atributoHija, getAtributoPadre()));
    }
    @Override
    public String toString() {
        return String.format("SOY LA CLASE HIJA %s%n", atributoHija);
    }
}
