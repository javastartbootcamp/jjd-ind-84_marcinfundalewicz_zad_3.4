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

    double specialOffer(Product product) {
        return product.price = product.price - (discount * product.price / 100);
    }

    void showInfo() {
        System.out.println(description + " " + time + " " + discount + "%");
    }
}
