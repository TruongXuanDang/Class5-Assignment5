import java.util.ArrayList;

public class Inventory {
    public ArrayList<Product> products = new ArrayList<>();


    public void PrintList(ArrayList<Product> products){
        System.out.println("So luong hang ton: ");
        for (Product product1: products
        ) {

            System.out.println("Ten: "+product1.Name);
            System.out.println("So luong: "+product1.Amount);
        }
    }
}
