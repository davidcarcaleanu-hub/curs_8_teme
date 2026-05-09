public class CalatoriB extends Vagon {
    public int getCapacitatePasageri() {
        return 50;
    }

    public int getCapacitateColete() {
        return 400;
    }

    public String getTip() {
        return "CalatoriB";
    }

    public void deschidereUsi() {
        System.out.println("Usile sunt deschise");
    }

    public void inchidereUsi() {
        System.out.println("Usile sunt inchise");
    }

    public void blocareGeamuri() {
        System.out.println("Geamurile s-au blocat");
    }
}
