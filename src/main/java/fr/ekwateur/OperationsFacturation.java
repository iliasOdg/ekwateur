package fr.ekwateur;

/**
 * OperationsFacturation regroupe les opérations de facturation
 * qui pourraient être enrichies
 */
public interface OperationsFacturation {

    /**
     * Calculer le montant d'une facture en appliquant les règles pour chaque energie
     * pour un mois calendaire (28j au moins)
     * @param energie Energie
     * @param consommation montant de la consommation en kwh
     * @return Montant de la facture
     */
    static double calculerFactureMensuel(Energie energie, int consommation) {
        double montant = energie.calculerFacture(consommation) * 28;
        return Math.round(montant);
    }
}
