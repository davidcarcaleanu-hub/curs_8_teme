
public class Tren {
    private Vagon[] vagoane;
    private int nrVagoane;

    public Tren() {
        vagoane = new Vagon[15];
        nrVagoane = 0;
    }

    public void adaugareVagoane(Vagon v) {
        if (nrVagoane < 15) {
            vagoane[nrVagoane++] = v;
        }
    }

    public int totalColete() {
        int suma = 0;
        for (int i = 0; i < nrVagoane; i++) {
            suma = suma + vagoane[i].getCapacitateColete();
        }
        return suma;

    }

    @Override
    public boolean equals(Object obj) { // se verifica daca doua trenuri au acelasi numar de colete. Trenurile sunt
                                        // egale daca au acelasi tip si au acelasi numar de colete
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tren t = (Tren) obj;

        return this.totalColete() == t.totalColete();

    }

    @Override
    public String toString() { // se afiseaza trenul
        String output = "Vagoane: ";

        for (int i = 0; i < nrVagoane; i++) {
            output = output + vagoane[i].getTip() + ", ";
        }
        output = output + "Total colete: " + totalColete();
        return output;
    }

}
