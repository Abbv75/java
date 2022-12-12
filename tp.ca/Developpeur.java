public class Developpeur extends Personne{
    

    public Developpeur(int id, String nom, String prenom, String mail, String telephone, double salaire,
            String specialite) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.specialite = specialite;
    }

    private String specialite;

    @Override
    public double calculerSalaire() {
        // TODO Auto-generated method stub
        return salaire*1.2;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String afficher(){
        return "Le salaire du developpeur "+nom+" "+prenom+" est :"+calculerSalaire()+" Fr, sa specialite est: "+specialite;
    }
    
}
