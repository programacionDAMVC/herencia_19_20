package teoria.video1;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        List<Animal> lista = new ArrayList<>();

        Animal animal = new Animal(5);
      //  System.out.println(animal);
        mostrarDatos(animal);
        lista.add(animal);
        Animal mamifero = new Mamifero(4, TipoMamifero.ACUATICO);
      //  System.out.println(mamifero);
        mostrarDatos(mamifero);
        lista.add(mamifero);
        Animal perro1 = new Perro("Pastor aleman");
        Animal perro2 = null;
        try {
            perro2 = (Animal) perro1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // System.out.println(perro);
        mostrarDatos(perro1);
        lista.add(perro1);
        Cabra cabra1 = new Cabra(true);
        Cabra cabra3 = null;
        try {
             cabra3 = (Cabra) cabra1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Cabra cabra2 = cabra1;
        cabra2.setCuernos(false);
      //  System.out.println(cabra);
        mostrarDatos(cabra1);
        mostrarDatos(cabra2);
        mostrarDatos(cabra3);

        lista.add(cabra1);
    //    mostrarDatos(lista);
    }
    public static void mostrarDatos (Animal animal) {
        System.out.println(animal);
    }
    public static void mostrarDatos (List<Animal> lista) {
        lista.forEach(System.out::println);
    }
}
