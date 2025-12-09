package boissons;

public class Espresso extends Boisson{
    public Espresso() {
        description = "Expresso";
    }

    @Override
    public double cout() {
        return 12;
    }
}
