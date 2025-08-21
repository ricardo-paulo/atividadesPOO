package ricardo_paulo.net;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Product product1 = new Product();
        System.out.print("Insira o nome do produto 2: ");
        String name2 = scan.nextLine();
        System.out.print("Insira o preço do produto 2: ");
        double price2 = scan.nextDouble();
        Product product2 = new Product(name2, price2);

        String name3 = "Milho de Pipoca";
        System.out.print("Insira o preço do produto 3: ");
        double price3 = scan.nextDouble();
        System.out.print("Insira a quantidade do produto 3: ");
        int amount3 = scan.nextInt();
        Product product3 = new Product(name3, price3, amount3);


        product2.setName("Mouse");
        product2.setPrice(158.90);
        product2.setAmount(12);

        product2.applyDiscount();
        product3.applyDiscount(10);

        product1.showInformation();
        product2.showInformation();
        product3.showInformation();
    }
}
