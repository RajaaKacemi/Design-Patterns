package decorateur;

import boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;

    public double cout(){
        return boisson.cout();
    };

    DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public abstract String getDescription();
}
