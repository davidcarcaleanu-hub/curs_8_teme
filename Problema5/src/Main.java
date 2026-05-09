public class Main {
    public static void main(String[] args) throws Exception {
        ColectieGreutati colectie = new ColectieGreutati(20); // in acest caz, capacitatea maxima a colectiei este de 20
                                                              // de elemente
        Greutate g1 = new Simpla(2);
        Greutate g2 = new Simpla(4);

        Dubla g3 = new Dubla(new Simpla(3), new Simpla(5));
        Dubla g4 = new Dubla(new Simpla(6), new Simpla(7));

        Multipla g5 = new Multipla();
        g5.adauga(g1);
        g5.adauga(g3);

        Multipla g6 = new Multipla();
        g6.adauga(g2);
        g6.adauga(g4);
        g6.adauga(new Simpla(10));

        // Colectia
        colectie.adauga(g1);
        colectie.adauga(g2);
        colectie.adauga(g3);
        colectie.adauga(g4);
        colectie.adauga(g5);
        colectie.adauga(g6);

        // media greutatilor
        System.out.println("Media greutatilor din colectie: " + colectie.medie());
    }
}
