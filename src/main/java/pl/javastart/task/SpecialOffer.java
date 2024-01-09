package pl.javastart.task;

public class SpecialOffer {
    Product product;

    String description;
    String time;
    int discount;

    SpecialOffer(String description, String time, int discount) {
        this.description = description;
        this.time = time;
        this.discount = discount;
    }

    void showInfo() {
        System.out.println(description + " " + " " + time + " " + discount);
    }
}
