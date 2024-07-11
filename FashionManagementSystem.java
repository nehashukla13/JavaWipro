import java.util.Scanner;

interface ClothingItem {
    String getType();   // Method to get type of clothing item
    String getColor();  // Method to get color of clothing item
}

class Top implements ClothingItem {
    private String type;
    private String color;

    public Top(String color) {
        this.type = "Top";
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String toString() {
        return color + " " + type;
    }
}

class Bottom implements ClothingItem {
    private String type;
    private String color;

    public Bottom(String color) {
        this.type = "Bottom";
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String toString() {
        return color + " " + type;
    }
}

public class FashionManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color for top: ");
        String topColor = scanner.nextLine();
        ClothingItem top = new Top(topColor);

        System.out.print("Enter color for bottom: ");
        String bottomColor = scanner.nextLine();
        ClothingItem bottom = new Bottom(bottomColor);

        System.out.println("\nOutfit:");
        System.out.println("Top: " + top);
        System.out.println("Bottom: " + bottom);
    }
}
