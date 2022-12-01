package gestionEmployer;

public class Employe {
    private String numMatricule;
    private String nom;
    private String prenom;
    private double salaire;
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public String getNumMatricule() {
        return numMatricule;
    }
    public void setNumMatricule(String numMatricule) {
        this.numMatricule = numMatricule;
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
    public Employe(String numMatricule, String nom, String prenom, double salaire) {
        this.numMatricule = numMatricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
    
}
