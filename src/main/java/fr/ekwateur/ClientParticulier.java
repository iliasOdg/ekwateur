package fr.ekwateur;

public class ClientParticulier extends Client{

    private String civilite;
    private String nom;
    private String prenom;

    public ClientParticulier(String refClient,String civilite, String nom, String prenom) {
        super(refClient);
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
