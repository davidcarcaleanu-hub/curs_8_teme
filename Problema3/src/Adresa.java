public class Adresa {
    private String strada;
    private int numar;

    public Adresa(String strada, int adresa) {
        this.strada = strada;
        this.numar = numar;

    }

    public String getStrada() {
        return strada;

    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String toString() {
        return "Strada: " + strada + " ,numar: " + numar;
    }
}
