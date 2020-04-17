package teoria.figurasCuadraticas;

import java.util.ArrayList;

public class TestCuadrilatero {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println(cuadrado);
        Rectangulo rectangulo = new Rectangulo(3,4);
        System.out.println(rectangulo);
        Rombo rombo = new Rombo(5,8);
        System.out.println(rombo);
        Romboide romboide = new Romboide(5,8, Math.PI / 8.0);
        System.out.println(romboide);
        rombo.setDiagonal1(7);
        System.out.println(rombo);
      //  List<String> lista = new ArrayList<>();
        Cuadrilatero rombo1 = new Rombo(3,4);
        System.out.println(rombo1);
        ((Rombo) rombo1).setDiagonal1(7);
        ((Rombo) rombo1).setDiagonal2(8);
        System.out.println(rombo1);

    }


}
