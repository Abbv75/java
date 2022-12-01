
public class Etudiant extends Personne {

    public Etudiant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        //TODO Auto-generated constructor stub
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
    public Etudiant(String nom, String prenom, int age, int scolaire, String classe) {
        super(nom, prenom, age);
        this.scolaire = scolaire;
        this.classe = classe;
    }
    @Override
    public String toString() {
        ;
        return super.toString()+ " ,scolaire=" + scolaire + ", classe=" + classe;
    }

    

    
    
}
