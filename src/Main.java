public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Bag bag = new Bag("Prada", 3, "Tiffany");
        bag.equals(null);
        Bag bag2 = new Bag("Prada", 3, "Tiffany");
        boolean eq_op = bag == bag2;
        boolean eq_func = bag.equals(bag2);
        System.out.println("Eq operator says: "+eq_op+"; eq function says: "+eq_func);
    }
}
