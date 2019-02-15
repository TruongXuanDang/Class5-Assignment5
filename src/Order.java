import java.util.ArrayList;

public class Order {
    public int Id;
    public int TotalAmount;
    public ArrayList<Product> products;


    public int BuyProducts(int amount,Product product){
        int Total = product.Price*amount;
        product.Amount-=amount;
        System.out.println("San pham: "+ product.Name);
        System.out.println("So luong: "+amount);
        System.out.println("Tong tien: "+Total);
        return Total;
    }
}
