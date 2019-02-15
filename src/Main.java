import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product shirt1 = new Shirt(1,"T-Shirt Red",10000,5,25,"red","crocodile");
        Product ring1 = new Ring(1,"Wedding Ring",20000,5,5,"Wedding");

        ArrayList<Product> products = new ArrayList<>();
        products.add(shirt1);
        products.add(ring1);

        Order order =new Order();
        int Total=0;
        System.out.println("Danh sach Order: ");
        Total+=order.BuyProducts(2,shirt1);
        Total+=order.BuyProducts(3,ring1);
        System.out.println();
        System.out.println("Tong tien Order: "+Total);

        System.out.println();

        Inventory inventory = new Inventory();
        inventory.PrintList(products);
    }
}
