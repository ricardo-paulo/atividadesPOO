package ricardo_paulo.net;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Book myBook = new Book();
        System.out.println("----- TESTES -----");
        System.out.println("GETTERS");
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.printf("R$ %.2f\n", myBook.getPrice());
        System.out.println(myBook.getAmount());

        System.out.println("SETTERS");
        System.out.print("Insira o título do livro: ");
        myBook.setTitle(scan.nextLine());
        System.out.print("Insira o autor: ");
        myBook.setAuthor(scan.nextLine());
        System.out.print("Insira o preço: ");
        myBook.setPrice(scan.nextLine());
        System.out.print("Insira a quantidade: ");
        myBook.setAmount(scan.nextInt());

        System.out.println("MÉTODOS PERSONALIZADOS");
        System.out.printf("R$ %.2f\n", myBook.calcTotalPrice());
        myBook.showBookInfo();
    }
}
