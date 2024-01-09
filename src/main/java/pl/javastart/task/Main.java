package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Cola", 10, "Pyszna cola");
        product1.category = new Category("Napoje", "Dział napojów");
        product1.showInfo();
        product1.category.showInfo();

        Product product2 = new Product("Woda", 5, "Pyszna woda");
        product2.category = new Category("Napoje", "Dział napojów");
        product2.showInfo();
        product2.category.showInfo();

        Product product3 = new Product("Czekolada", 7, "Pyszna czekolada");
        product3.category = new Category("Słodycze", "Dział słodyczy");
        product3.showInfo();
        product3.category.showInfo();

        Product product4 = new Product("Paluszki", 6, "Pyszne paluszki");
        product4.showInfo();

        product4.specialOffer = new SpecialOffer("Wyjątkowa okazja", "od wtorku do niedzieli zniżka", 20);
        product4.specialOffer.showInfo();

    }
}
