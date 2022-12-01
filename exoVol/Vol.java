public class Vol {
    private String date, heureDepart, escale;
    private int duree, nbreVoyageurs;
    private final String NUMERO = "45785", SOURCE = "Mali", DESTINATION = "FRANCE", COMPANIE = "AIR FRANCE";

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
        setEscale();
    }

    public int getNbreVoyageurs() {
        return nbreVoyageurs;
    }
    
    public String getEscale() {
        return escale;
    }

    public void setNbreVoyageurs(int nbreVoyageurs) {
        this.nbreVoyageurs = nbreVoyageurs;
    }

    public String getNumero() {
        return NUMERO;
    }

    public String getSource() {
        return SOURCE;
    }

    public String getDestination() {
        return DESTINATION;
    }

    public String getCompagnie() {
        return COMPANIE;
    }

    public Vol(String date, String heureDepart, int duree, int nbreVoyageurs) {
        this.date = date;
        this.heureDepart = heureDepart;
        this.duree = duree;
        setEscale();
        this.nbreVoyageurs = nbreVoyageurs;
    }

    private void setEscale(){
        if(this.duree<=4){
            this.escale="sans escale";
        }
        else {
            this.escale="avec escale";
        }
    }

    public void getInformation() {
            System.out.println("Le vol "+this.escale+" numero " + this.NUMERO + " de " + this.COMPANIE + " part de "
                    + this.SOURCE + " a " + this.DESTINATION
                    + " le " + this.date + " a " + this.heureDepart + ", duree " + this.duree + " heure  et contient "
                    + this.nbreVoyageurs + " voyageurs\n");
    }

    public static void main(String[] args) {
        Vol vol1 = new Vol("02/05/2022", "10:45", 3, 27);
        Vol vol2 = new Vol("0309/2023", "02:00", 11, 30);

        vol1.getInformation();
        vol2.getInformation();

        vol1.setDuree(9);
        System.out.println(vol1.getEscale());
    }

}
