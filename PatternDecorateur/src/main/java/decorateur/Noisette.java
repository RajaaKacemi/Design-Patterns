package decorateur;

import boissons.Boisson;

public class Noisette extends DecorateurBoisson{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au noisette";
    }

    @Override
    public double cout() {
        return 1 + boisson.cout();
    }
}
