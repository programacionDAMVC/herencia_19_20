package teoria.video1;

public class Animal implements Cloneable{
    private int numeroPatas;

    public Animal(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return String.format("Soy un animal con %d patas%n", numeroPatas);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
