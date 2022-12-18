package interfaces.figure;

public class Carre implements Figure{
    private double cote;

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return cote*4;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return cote*cote;
    }

    @Override
    public void afficher() {
        System.out.println("Rectangle [cotee=" + cote +"]");
    }
    
}
