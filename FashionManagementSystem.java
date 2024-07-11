import java.util.Scanner;

// Interface for clothing items
interface ClothingItem {
    String getType();   // Method to get type of clothing item
    String getColor();  // Method to get color of clothing item
}

// Class for tops
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

// Class for bottoms
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

// Main class to manage outfits
public class FashionManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for top
        System.out.print("Enter color for top: ");
        String topColor = scanner.nextLine();
        ClothingItem top = new Top(topColor);

        // Input for bottom
        System.out.print("Enter color for bottom: ");
        String bottomColor = scanner.nextLine();
        ClothingItem bottom = new Bottom(bottomColor);

        // Display the outfit
        System.out.println("\nOutfit:");
        System.out.println("Top: " + top);
        System.out.println("Bottom: " + bottom);
    }
}
