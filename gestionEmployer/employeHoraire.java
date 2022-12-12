package gestionEmployer;

public class EmployeHoraire extends Employe{
    private int nbrHeureTravail;

    public int getNbrHeureTravail() {
        return nbrHeureTravail;
    }

    public void setNbrHeureTravail(int nbrHeureTravail) {
        this.nbrHeureTravail = nbrHeureTravail;
    }

    public EmployeHoraire(String numMatricule, String nom, String prenom, double salaire, int nbrHeureTravail) {
        super(numMatricule, nom, prenom, salaire);
        this.nbrHeureTravail = nbrHeureTravail;
        this.setSalaire(this.getSalaire()*this.getNbrHeureTravail());
    }

    public double calculerSalaire(){
        return  this.getSalaire()*this.getNbrHeureTravail();
    }

    public void afficherInformation(){
        System.out.println("Nom: "+this.getNom()+" Prenom: "+this.getPrenom()+" matricule: "+this.getNumMatricule()+" salaire: "+this.calculerSalaire());
    }

    
}
