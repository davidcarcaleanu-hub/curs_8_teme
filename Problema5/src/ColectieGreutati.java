public class ColectieGreutati {
    private Greutate[] greutati;
    private int numar;
    private int capacitateMaxima;

    public ColectieGreutati(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
        this.greutati = new Greutate[capacitateMaxima];
        this.numar = 0;
    }

    public void adauga(Greutate g) {
        if (numar < capacitateMaxima) {
            greutati[numar++] = g;
        }
    }

    public double medie() {
        if (numar == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < numar; i++) {
            suma = suma + greutati[i].capacitate();
        }
        return suma / numar;
    }

    public int total() {
        int suma = 0;
        for (int i = 0; i < numar; i++) {
            suma = suma + greutati[i].capacitate();
        }
        return suma;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColectieGreutati c = (ColectieGreutati) obj;
        return this.total() == c.total();

    }

    @Override
    public String toString() {
        String output = "ColectieGreutati: ";

        for (int i = 0; i < numar; i++) {
            output = output + greutati[i];
        }
        output = output + "Media: " + medie();

        return output;
    }

}
