package net.ricardo_paulo;
import java.util.Scanner;

public class Main {

    private static String name;
    private static int age;
    private static String email;
    private static String phoneNumber;

    public static void main (String[] args) {

        fillClientInfo();

        Client client1 = new Client(name, age, email, phoneNumber);

        System.out.println("GETTERS TEST");
        System.out.println(client1.getAge());
        System.out.println(client1.getEmail());
        System.out.println(client1.getName());
        System.out.println(client1.getPhoneNumber());

        client1.setName(name);
        client1.setAge(age);
        client1.setEmail(email);
        client1.setPhoneNumber(phoneNumber);

        System.out.println("CUSTOM METHODS TEST");
        client1.updateEmail(email);
        System.out.printf("%s é maior de idade. | %B\n", client1.getName(), client1.isMajor());
        client1.showUserInfo();

    }

    private static void fillClientInfo () {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os dados do cliente no formato: nome idade email telefone");
        String[] rawInfo = scan.nextLine().split(" ");

        name = rawInfo[0];
        age = Integer.parseInt(rawInfo[1]);
        email = rawInfo[2];
        phoneNumber = rawInfo[3];

    }

}
