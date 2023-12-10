package fr.ekwateur;

@FunctionalInterface
public interface Facturaion {

    /**
     * Fonction de calcul de la facturation
     * @param consommation consommation
     * @return montant facture
     */
    double calculer(int consommation);
}
