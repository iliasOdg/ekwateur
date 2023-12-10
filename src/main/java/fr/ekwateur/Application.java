package fr.ekwateur;


public class Application {
    public static void main(String[] args) {
        ClientParticulier particulier = new ClientParticulier("EKW156545", "M.", "User", "Particulier");
        Facturaion facturaionElecPart = consommation -> consommation * 0.133;
        Energie electricitePart = new Energie(EnergieEnum.ELECTRICITE.getName(), facturaionElecPart);
        double montantPart = OperationsFacturation.calculerFactureMensuel(electricitePart, 100);
        System.out.println("Facturation particulier : " + montantPart + " €");


        ClientPro clientPro = new ClientPro("EKW03432", "XXSIRET", "Entreprise XX", 1500000);
        Facturaion consommationGaz = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.110 : 0.112);
        Energie gazPro = new Energie(EnergieEnum.GAZ.getName(), consommationGaz);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        System.out.println("Facturation professionnel : " + montantPro + " €");
    }
}
