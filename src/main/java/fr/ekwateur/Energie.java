package fr.ekwateur;

public class Energie {
    private String type;
    private Facturaion facturaion;

    public Energie(String type, Facturaion facturaion) {
        this.type = type;
        this.facturaion = facturaion;
    }

    public String getType() {
        return type;
    }

    public double calculerFacture(int consommation) {
        return this.facturaion.calculer(consommation);
    }

}
