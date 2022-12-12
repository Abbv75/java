public class Test {
    public static void main(String[] args) {
        Developpeur D1=new Developpeur(0, "sidibe", "sounkalo", "sounk@gmail.com", "66666666", 10000, "test");
        Developpeur D2=new Developpeur(1, "sidibe2", "sounkalo2", "sounk@gmail.com2", "76666666", 50000, "test");
        Manager M1= new Manager(2, "Bore", "younouss", "bore@gmail.com", "66035300", 1000000,"test");
        Manager M2= new Manager(3, "Bore2", "younouss2", "bore@gmail.com", "66035300", 2000000,"test2");
        System.out.println(D1.afficher());
        System.out.println(D2.afficher());
        M1.afficher();
        M2.afficher();
    }
}
