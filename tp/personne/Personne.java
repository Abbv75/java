package tp.personne;

import java.text.SimpleDateFormat;
import java.util.Date;

import tp.inter.IPersonne;

public class Personne extends Profil implements IPersonne{

    private int id;
    private String nom, prenom;
    private Date dateNaiss=new Date() {
        
    };
    private double salaire;

    SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Personne(Profil P, int id2, String nom, String prenom, Date dateNaiss,
            double salaire) {
        super(P.getId(), P.getCode(), P.getLibelle());
        id = id2;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.salaire = salaire;
    }

    @Override
    public void affiche() {
        // TODO Auto-generated method stub
        System.out.println("Je suis le "+this.getLibelle()+" "+nom+" "+prenom+" ne le "+dateFormater.format(dateNaiss)+" mon salaire est "+calculerSalaire());
    }

    @Override
    public double calculerSalaire() {
        // TODO Auto-generated method stub
        if(this.getLibelle().equals("directeur")){
            return salaire*1.2;
        }
        else{
            return salaire*1.1;
        }
    }
    
}
