import java.util.*;

public class Multipla extends Greutate {
    private ArrayList<Greutate> lista;

    public Multipla() {
        lista = new ArrayList<>();

    }

    public void adauga(Greutate g) {
        lista.add(g);
    }

    @Override
    public int capacitate() {
        int suma = 0;
        for (Greutate g : lista) {
            suma = suma + g.capacitate();
        }
        return suma;
    }

    @Override
    public String toString() {
        String output = "Multipla: ";
        for (Greutate g : lista) {
            output = output + " " + g + ", ";
        }
        output = output + " = " + capacitate();

        return output;
    }
}
