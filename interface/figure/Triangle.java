package interfaces.figure;

public class Triangle implements Figure{
    private double cote1;
    private double cote2;

    @Override
    public void afficher() {
        System.out.println("Rectangle [cote1=" + cote1+ "cote2+ " + cote2 + "]");
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return cote1+cote2+Math.sqrt((cote1*cote1)+(cote2*cote2));
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return (cote1*cote2)/2;
    }
    
}
