
public class Main {
    public static void main(String[] args) {
        Etudiant E1= new Etudiant("Bore", "Younouss", 18,);
        Etudiant E2= new Etudiant("Sidibe", "Sounkalo", 18, 1500000, "CM1");
        Enseignant P1= new Enseignant("Bore", "Younouss", 18, "JAVA", 800000);
        // System.out.println(E1.toString());
        // System.out.println(P1.toString());
        Personne tab[] = new Personne[4];
        tab[0]=E1;
        tab[1]=E2;
        tab[2]=P1;
        tab[3]=P1;
        for(int i=0; i<tab.length; i++){
            if(tab[i] instanceof Enseignant){
                System.out.println(tab[i].toString());
            }
        }
        for(int i=0; i<tab.length; i++){
            if(tab[i] instanceof Etudiant){
                System.out.println(tab[i].toString());
            }
        }
        int tmpAge=0;
        for(int i=0; i<tab.length; i++){
            tmpAge+=tab[i].getAge();
        }
        tmpAge=tmpAge/tab.length;
        System.out.println("l'age moyenne est "+ tmpAge);

    }
}