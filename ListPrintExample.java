import java.util.ArrayList;
import java.util.List;

public class ListPrintExample {
    public static void main(String[] args) {
        List<String> items = createList();

        // Print each item from the list using a for loop
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static List<String> createList() {
        // Create a new list
        List<String> items = new ArrayList<>();

        // Add items to the list
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");

        // Return the list
        return items;
    }
}
