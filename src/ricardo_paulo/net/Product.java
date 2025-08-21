package ricardo_paulo.net;

public class Product {

    private String name;
    private double price;
    private int amount;

    public Product() {
        this.name = "Sem nome";
        this.price = 0;
        this.amount = 0;
    }

    public Product(String name, double price) {
        this.name = name;
        if (price >= 0) this.price = price;
        this.amount = 0;
    }

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) this.amount = amount;
    }

    public void applyDiscount() {
        this.price *= 1.05;
    }

    public void applyDiscount(double percent) {
        if (percent < 100 && percent > 0) {
            this.price -= (price * percent) / 100;
        }
    }

    public void showInformation() {
        System.out.printf("Nome: %s | Peço: %.2f | Quantidade: %d\n", name, price, amount);
    }
}
