public class Ring extends Product {
    public int Weight;
    public String Kind;

    public Ring(int id, String name, int price, int amount, int weight, String kind) {
        super(id, name, price, amount);
        Weight = weight;
        Kind = kind;
    }
}
