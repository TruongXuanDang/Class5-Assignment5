public class Shirt extends Product {
    public int Size;
    public String Color;
    public String Brand;

    public Shirt(int id, String name, int price, int amount, int size, String color, String brand) {
        super(id, name, price, amount);
        Size = size;
        Color = color;
        Brand = brand;
    }
}
