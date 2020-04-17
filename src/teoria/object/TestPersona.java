package teoria.object;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("jacinto del olmo", "11111111h");
        Persona p3 = null;
        try {
            p3 = (Persona) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Persona p2 = p1;
        System.out.println("Persona p1 " + p1);
        System.out.println("Persona p2 " + p2);
        System.out.println("Persona p3 " + p3);
        p2.setDni("00000000a");
        System.out.println("Persona p1 " + p1);
        System.out.println("Persona p2 " + p2);
        System.out.println("Persona p3 " + p3);


    }
}
