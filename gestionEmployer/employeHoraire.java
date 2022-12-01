package gestionEmployer;

public class employeHoraire extends Employe{
    private int nbrHeureTravail;

    public int getNbrHeureTravail() {
        return nbrHeureTravail;
    }

    public void setNbrHeureTravail(int nbrHeureTravail) {
        this.nbrHeureTravail = nbrHeureTravail;
    }

    public employeHoraire(String numMatricule, String nom, String prenom, double salaire, int nbrHeureTravail) {
        super(numMatricule, nom, prenom, salaire);
        this.nbrHeureTravail = nbrHeureTravail;
        this.setSalaire(this.getSalaire()*this.getNbrHeureTravail());
    }

    public double calculerSalaire(){
        return  this.getSalaire()+this.getNbrItemVendu()*this.getMontantItemVendu();
    }

    
}
