package tp;

import java.text.SimpleDateFormat;
import java.util.Date;

import tp.personne.*;

public class TestInterface {
    public static void main(String[] args){
        Profil P1= new Profil(0, 223, "directeur");
        Profil P2= new Profil(1, 224, "developpeur");

        Personne Pe1= new Personne(P1, 0, "Bore", "Younouss",new Date("12/12/2000"), 300000);
        Personne Pe2= new Personne(P2, 0, "Bore", "Younouss",new Date("12/05/2002"), 300000);
        Pe1.affiche();
        Pe2.affiche();
    }
    
    
}
