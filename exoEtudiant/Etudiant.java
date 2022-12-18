
public class Etudiant extends Personne {

    

    public Etudiant(int id, String nom, String prenom, String mail, String telephone, double salaire, int scolaire,
            String classe) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.scolaire = scolaire;
        this.classe = classe;
    }
    private int scolaire;
    private String classe;
    public int getScolaire() {
        return scolaire;
    }
    public void setScolaire(int scolaire) {
        this.scolaire = scolaire;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    @Override
    public String toString() {
        ;
        return super.toString()+ " ,scolaire=" + scolaire + ", classe=" + classe;
    }
    @Override
    public double calculerSalaire() {
        // TODO Auto-generated method stub
        return 0;
    }

    

    
    
}
