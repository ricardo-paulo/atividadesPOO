package ricardo_paulo.net;

public class Main {
    public static void main(String[] args) {
        Functionary func1 = new Functionary();
        Functionary func2 = new Functionary("Irineu", 1574.80);
        Functionary func3 = new Functionary("Sabrina", 1745.99, "Gerente");
        func1.showInfo();
        func2.showInfo();
        func3.showInfo();

        func1.setName("Bárbara");
        func1.setSalary(1784);
        func1.setRule("Estagiária");
        func1.showInfo();

        func2.increaseSalary();
        func3.increaseSalary(20.0);
        System.out.printf("Salário +10%%: %.2f\n", func2.getSalary());
        System.out.printf("Salário +20%%: %.2f\n", func3.getSalary());
    }
}
