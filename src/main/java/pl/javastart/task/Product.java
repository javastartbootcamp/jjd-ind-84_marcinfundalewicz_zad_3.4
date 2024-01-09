package pl.javastart.task;

public class Product {
    Category category;
    SpecialOffer specialOffer;

    String name;
    int price;
    String description;

    Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    void showInfo() {
        System.out.println(name + " " + " " + price + " " + description);
    }
}