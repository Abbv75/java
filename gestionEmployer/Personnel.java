package gestionEmployer;

public class Personnel {
    private Employe personnel[]=new Employe[20];
    public Employe[] getPersonnel() {
        return personnel;
    }

    private static int i=0;

    public void add(Employe p){
        int tmp;
        boolean is_existe=false;
        for(tmp=0; tmp<this.personnel.length; tmp++){
            if(this.personnel[tmp]== null){
                break;
            }
            else if(p.getNumMatricule().equals(this.personnel[tmp].getNumMatricule())){
                is_existe=true;
                break;
            }
        }
        if(tmp>=20){
            System.out.println("Nombre maximal d'employer atteint");
        }
        else{
            if(is_existe){
                System.out.println("L'utilisateur est deja enregistrer");
            }
            else{
                this.personnel[i++]=p;
            }
        } 
    }

    public void search(String matricule){
        int tmp;
        boolean is_existe=false;
        for(tmp=0; tmp<this.personnel.length; tmp++){
            if(this.personnel[tmp]== null){
                break;
            }
            else if(matricule.equals(this.personnel[tmp].getNumMatricule())){
                is_existe=true;
                break;
            }
        }
        if(is_existe){
            System.out.println("L'utilisateur existe voici ses info");
            System.out.println("Matricule: "+personnel[tmp].getNumMatricule()+" Nom: "+personnel[tmp].getNom()+" Prenom: "+personnel[tmp].getPrenom());
        }
        else{
            System.out.println("Cet utilisateur n'existe pas");
        }
    }

    public void searchByHoraire(int index){
        if(this.personnel[index]!=null && this.personnel[index] instanceof EmployeHoraire){
            EmployeHoraire tmpEmp= (EmployeHoraire) this.personnel[index];
            System.out.println("Matricule: "+tmpEmp.getNumMatricule()+" Nom: "+tmpEmp.getNom()+" prenom: "+tmpEmp.getPrenom()+" salaire: "+tmpEmp.calculerSalaire());
        }
        else{
            System.out.println("Aucun employer n'existe a cette position");
        }
    }    
}
