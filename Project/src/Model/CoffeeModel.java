
package Model;

public class CoffeeModel {
    private int id;
    private String name;
    private double price;
    private int qty;
    private String sugar, date;

    public CoffeeModel(int id, String name, double price, int qty, String sugar, String date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.sugar = sugar;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getSugar() {
        return sugar;
    }

    public String getDate() {
        return date;
    }
     
}
