
public class Enseignant extends Personne {

    public Enseignant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        //TODO Auto-generated constructor stub
    }

    private String specialite;
    private int salaire;
    public Enseignant(String nom, String prenom, int age, String specialite, int salaire) {
        super(nom, prenom, age);
        this.specialite = specialite;
        this.salaire = salaire;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public int getSalaire() {
        return salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    @Override
    public String toString() {
        return super.toString()+" ,specialite=" + specialite + ", salaire=" + salaire;
    }
    
    
}
