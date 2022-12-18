package interfaces.figure;

public class Rectangle implements Figure{

    private double longueur; 
    private double largeur; 

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return 2*(longueur+largeur);
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return longueur*largeur;
    }

    @Override
    public void afficher() {
        System.out.println("Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]");
    }
    
}
