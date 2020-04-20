package ejercicios.ejercicio2;

public class FiguraCircular {
    protected double semiejeMayor;
    protected double semiejeMenor;

    public FiguraCircular(double semiejeMayor, double semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }
    protected double cacularArea(){
        return Math.PI * semiejeMayor * semiejeMenor;
    }
    protected double calcularPerimetro() {
        return Math.PI * (semiejeMenor + semiejeMayor);
    }

    @Override
    public String toString() {
        return String.format("FIGURA GEOMETRICA, de %.2f de semieje1, de %.2f de semieje2, de %.2f de área y de %.2f de perímetro%n",
                semiejeMayor, semiejeMenor, cacularArea(), calcularPerimetro());
    }
}
