package gestionEmployer;

public class EmployeCommission extends Employe {

    private int nbrItemVendu;
    public int getNbrItemVendu() {
        return nbrItemVendu;
    }

    public void setNbrItemVendu(int nbrItemVendu) {
        this.nbrItemVendu = nbrItemVendu;
    }

    private int montantItemVendu;

    public int getMontantItemVendu() {
        return montantItemVendu;
    }

    public void setMontantItemVendu(int montantItemVendu) {
        this.montantItemVendu = montantItemVendu;
    }

    public EmployeCommission(String numMatricule, String nom, String prenom, double salaire, int nbrItemVendu, int montantItemVendu) {
        super(numMatricule, nom, prenom, salaire);
        this.nbrItemVendu = nbrItemVendu;
        this.montantItemVendu = montantItemVendu;
    }

    public double calculerSalaire(){
        return  this.getSalaire()+this.getNbrItemVendu()*this.getMontantItemVendu();
    }

    public void afficherInformation(){
        System.out.println("Nom: "+this.getNom()+" Prenom: "+this.getPrenom()+" matricule: "+this.getNumMatricule()+" salaire: "+this.calculerSalaire());
    }

    
}
