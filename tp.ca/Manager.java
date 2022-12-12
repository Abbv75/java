public class Manager extends Personne{
    

    public Manager(int id, String nom, String prenom, String mail, String telephone, double salaire, String service) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.service = service;
    }

    private String service;

    @Override
    public double calculerSalaire() {
        // TODO Auto-generated method stub
        return salaire*1.35;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void afficher(){
        System.out.println("Le salaire du manager "+nom+" "+prenom+" est :"+calculerSalaire()+" fr, son service: "+service);
    }
    
}
