package ricardo_paulo.net;

import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int floatCases;
    private int amount;

    public Book() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o título do livro: ");
        title = scan.nextLine();
        System.out.print("Insira o autor: ");
        author = scan.nextLine();
        System.out.print("Insira o preço: ");
        price = parsePrice(scan.nextLine());
        System.out.print("Insira a quantidade: ");
        amount = scan.nextInt();
    }

    private int parsePrice(String rawPrice) {
        rawPrice = rawPrice.replace(",", ".");
        double dprice = Double.parseDouble(rawPrice);

        if (rawPrice.contains(".")) {
            floatCases = rawPrice.split("[.]")[1].length();
            return Math.abs((int) (dprice * Math.pow(10, floatCases)));
        } else {
            floatCases = 0;
            return Math.abs((int) dprice);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return (float) (price / Math.pow(10, floatCases));
    }

    public void setPrice(String price) {
        this.price = parsePrice(price);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws Exception {
        if (amount > 0) {
            this.amount = amount;
        } else {
            throw new Exception("O valor inserido é inválido. Insira uma quantidade maior que zero.");
        }
    }

    public double calcTotalPrice() {
        double dprice = getPrice();
        return dprice * amount;
    }

    public void showBookInfo() {
        System.out.println("Informações sobre o livro:");
        System.out.println(title);
        System.out.println(author);
        System.out.printf("R$ %.2f\n", getPrice());
        System.out.println(amount);
    }
}
