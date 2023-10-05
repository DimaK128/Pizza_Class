package pizza;

// Setter is a method that changes the value of our field.
// Getter is a method that returns the value of our field.
// This is used to refer to the current object in the context of which it is called.
public class Pizza {
    private double price;
    private String name;

    public Pizza(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPizzaInfo() {
        return name + " (" + price + " UAH)";
    }
}       // Returns information about the pizza as a string.