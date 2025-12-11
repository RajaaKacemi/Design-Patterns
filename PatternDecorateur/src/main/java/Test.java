import boissons.Boisson;
import boissons.Espresso;
import decorateur.Chocolat;
import decorateur.Noisette;

public class Test {
    public static void main(String[] args){
        Boisson boisson;
        boisson = new Espresso();
        System.out.println("Commande : " + boisson.getDescription());
        System.out.println("Prix :" + boisson.cout());
        System.out.println("-------------");
        boisson = new Chocolat(boisson);
        System.out.println("Commande : " + boisson.getDescription());
        System.out.println("Prix :" + boisson.cout());
        System.out.println("-------------");
        boisson = new Noisette(boisson);
        System.out.println("Commande : " + boisson.getDescription());
        System.out.println("Prix :" + boisson.cout());
    }
}
