package net.ricardo_paulo;

public class Client {

    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public Client(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMajor() {
        return this.age >= 18;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("A idade informada é inválida! Insira uma idade igual ou maior que zero");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email.toLowerCase();
        } else {
            System.out.println("O e-mail informado é inválido!");
        }
    }

    public void updateEmail(String email) {
        if (email.contains("@") && !this.email.equals(email)) {
            this.email = email.toLowerCase();
        } else {
            System.out.println("O e-mail informado é inválido!");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showUserInfo() {
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Idade: %d\n", this.age);
        System.out.printf("Email: %s\n", this.email);
        System.out.printf("Número de telefone: %s\n", this.phoneNumber);
    }
}