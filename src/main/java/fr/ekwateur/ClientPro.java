package fr.ekwateur;

public class ClientPro extends Client{

    private String siret;
    private String raisonSociale;
    private double ca;

    public ClientPro(String refClient, String siret, String raisonSociale, double ca) {
        super(refClient);
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.ca = ca;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }
}
