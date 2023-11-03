import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    record GroceryItem(String name, String type, int count) {

        public GroceryItem(String name) {
            this(name, "DAIRY", 1);

        }

        @Override
        public String toString() {
            return String.format("%d %s in %s", count, name.toUpperCase(), type);
        }
    }
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("orange", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("yogurt"));
        groceryList.add(0, new GroceryItem("apple", "PRODUCE", 6));
        groceryList.set(1, new GroceryItem("milk", "DIARY", 3));
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}
