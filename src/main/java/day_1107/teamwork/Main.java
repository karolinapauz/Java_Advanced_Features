package day_1107.teamwork;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product pienas = new Product(1, "Pienas", 23, 1.89);
        Product suris = new Product(2, "Suris", 14, 14.5);
        Product sviestas = new Product(3, "Sviestas", 11, 2.90);

        Product varske = new Product();
        varske.setPrice(0.89);
        varske.setName("Varske");
        varske.setQuantity(9);
        varske.setId(4);

        ArrayList<Product> products = new ArrayList<>();
        products.add(pienas);
        products.add(suris);
        products.add(sviestas);
        products.add(varske);

        for (Product product : products) {
            System.out.println("Produktas: " + product.getName() + ", kiekis: " + product.getQuantity() + ", kaina " + product.getPrice()
            + " kilmes salis: " + product.getOrigin());
        }





    }
}
