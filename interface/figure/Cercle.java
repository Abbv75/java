
public class Cercle implements Figure{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return 2 * rayon * Math.PI;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return rayon * rayon * Math.PI;

    }

    @Override
    public void afficher() {
        // TODO Auto-generated method stub
        System.out.println("Rectangle [rayon=" + rayon +"]");
    }
    
}
