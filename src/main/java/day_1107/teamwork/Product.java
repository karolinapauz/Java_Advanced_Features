package day_1107.teamwork;

public class Product {

    private int id;
    private String name;
    private int quantity;
    private double price;
    private final String origin = "Lietuva";

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name.toUpperCase();
        } else {
            System.out.println("Nera tokio vardo arba tuscia.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Kiekis negali buti mazesnis uz nuli.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 1000) {
            System.out.println("Kaina negali but didesne uz 1000");
        } else if (price < 0) {
            System.out.println("Kaina negali but maziau uz 0");
        } else {
            this.price = price;
        }
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}';
    }
}
