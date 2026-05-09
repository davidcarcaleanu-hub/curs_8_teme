public abstract class Vagon {
    public abstract int getCapacitatePasageri();

    public abstract int getCapacitateColete();

    public abstract String getTip();

    @Override
    public String toString() {
        return getTip() +
                "Calatori: " + getCapacitatePasageri() + ", " +
                "Colete: " + getCapacitateColete();

    }
}
