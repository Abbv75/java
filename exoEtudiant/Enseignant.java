
public class Enseignant extends Personne {


    private String specialite;
    private int salaire;
    
    public Enseignant(int id, String nom, String prenom, String mail, String telephone, double salaire,
            String specialite, int salaire2) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.specialite = specialite;
        salaire = salaire2;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    @Override
    public String toString() {
        return super.toString()+" ,specialite=" + specialite + ", salaire=" + salaire;
    }
    @Override
    public double calculerSalaire() {
        // TODO Auto-generated method stub
        return 0;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    
    
}
