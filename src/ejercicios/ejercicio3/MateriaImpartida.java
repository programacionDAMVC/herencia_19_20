package ejercicios.ejercicio3;

public enum MateriaImpartida {
    programacion("PROGRAMACION"), sistemasInformaticos("SISTEMAS INFORMATICOS"), lenguajesMarcas("LENGUAJES DE MARCAS"),
    entornosDesarrollo("ENTORNOS DE PROGRAMACION"), baseDatos("BASE DE DATOS"), empresas("EMPRESAS");

    private String valorEnum;

    MateriaImpartida(String valorEnum) {
        this.valorEnum = valorEnum;
    }

    public String getValorEnum() {
        return valorEnum;
    }
}
