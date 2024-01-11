package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Cola", 10, "Pyszna cola");
        product1.category = new Category("Napoje", "Dział napojów");
        product1.showInfo();
        product1.category.showInfo();

        Product product2 = new Product("Woda", 5, "Pyszna woda");
        product2.category = product1.category;
        product2.showInfo();
        product2.category.showInfo();

        Product product3 = new Product("Czekolada", 7, "Pyszna czekolada");
        product3.category = new Category("Słodycze", "Dział słodyczy");
        product3.showInfo();
        product3.category.showInfo();

        Product product4 = new Product("Paluszki", 6, "Pyszne paluszki");
        product4.showInfo();

        SpecialOffer specialOffer = new SpecialOffer("Wyjątkowa okazja na produkt 1 !!!", "Od wtorku do niedzieli zniżka", 20);
        specialOffer.showInfo();
        double discount = specialOffer.specialOffer(product1);
        System.out.println("Cena po obniżce wynosi: " + discount);
    }
}
