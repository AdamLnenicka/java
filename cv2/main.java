public class Main {
    public static void main(String[] args) {
        // Vytvoření instancí třídy Item
        Item item1 = new Item(10, 5);
        Item item2 = new Item(20, 15);

        // Vytvoření instance třídy Backpack
        Backpack backpack = new Backpack(100, 150);

        // Testování vložení předmětů do batohu
        System.out.println("Putting item1 into backpack: " + backpack.putItem(item1)); // Mělo by vrátit true
        System.out.println("Putting item2 into backpack: " + backpack.putItem(item2)); // Mělo by vrátit true
        System.out.println("Remaining volume: " + backpack.getRemainingVolume());
        System.out.println("Remaining load capacity: " + backpack.getRemainingLoadCapacity());

        // Vytvoření instancí třídy Rectangle
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(7);

        // Zobrazení plochy a obvodu obdélníků
        System.out.println("Area of rect1: " + rect1.getArea()); // 50
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter()); // 30
        System.out.println("Area of rect2 (square): " + rect2.getArea()); // 49
        System.out.println("Perimeter of rect2 (square): " + rect2.getPerimeter()); // 28

        // Zobrazit počet vytvořených instancí Rectangle
        System.out.println("Total Rectangle instances: " + Rectangle.getInstanceCount());
    }
}
