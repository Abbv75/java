package gestionEmployer;

public class Application {
    public static void main(String[] args) {
        EmployeCommission E1= new EmployeCommission("E1", "Bore", "Younouss", 555000, 10, 5000);
        EmployeHoraire E2= new EmployeHoraire("E2", "Sidibe", "Sounkalo", 55000, 7);
        EmployeCommission E3= new EmployeCommission("E3", "Traore", "Noumoutene", 5000, 1, 50000);

        Personnel P1= new Personnel();
        P1.add(E1);
        P1.add(E2);
        P1.add(E3);

        P1.search("E3");
        P1.searchByHoraire(2);
    }
}
