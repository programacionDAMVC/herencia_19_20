package teoria.ejemplo1;

public class TestHerencia {
    public static void main(String[] args) {
        ClaseNieta claseNieta = new ClaseNieta("padre", "hija", "nieta");
        ClaseHija claseHija = new ClaseHija("padre", "hija");
        ClasePadre clasePadre = new ClasePadre("padre");
        mostrarValores(clasePadre);
        mostrarValores(claseHija);
        mostrarValores(claseNieta);
        claseHija.mostrarDatosPadreHija();
        claseNieta.mostrarDatosPadreHija();
    }

    public static void mostrarValores (ClasePadre referencia) {
        System.out.println(referencia);
    }
}
