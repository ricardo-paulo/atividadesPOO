package ricardo_paulo.net;

public class Functionary {

    private String name;
    private double salary;
    private String rule;

    public Functionary() {
        name = "Funcionário desconhecido";
        salary = 0.0;
        rule = "Não definido";
    }

    public Functionary(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.rule = "Não definido";
    }

    public Functionary(String name, double salary, String rule) {
        this.name = name;
        this.salary = salary;
        this.rule = rule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Math.abs(salary);
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public void increaseSalary() {
        this.salary *= 1.1;
    }

    public void increaseSalary(double percentual) {
        this.salary += (salary * percentual)/100;
    }

    public void showInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Salario: " + salary);
        System.out.println("Cargo: " + rule);
    }
}
