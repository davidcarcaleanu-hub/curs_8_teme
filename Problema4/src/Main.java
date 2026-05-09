public class Main {
    public static void main(String[] args) throws Exception {
        Tren tren1 = new Tren();
        Tren tren2 = new Tren();

        tren1.adaugareVagoane(new Marfa());
        tren2.adaugareVagoane(new CalatoriA());

        System.out.println("Se verifica daca vagoanele sunt egale: " + tren1.equals(tren2));
        System.out.println("Trenul 1: " + tren1);
        System.out.println("Trenul 2: " + tren2);
    }
}
