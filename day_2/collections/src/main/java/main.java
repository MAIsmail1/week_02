import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String item1 = "milk";
        String item2 = "bread";
        String item3 = "coffee";
        String item4 = "toothpaste";

        // arrays

        String[] shoppingList = new String[5];
        shoppingList[0] = "milk";
        shoppingList[1] = "bread";
        // System.out.println(shoppingList[0]);
        // System.out.println(shoppingList[1]);













        // arraylist

        ArrayList<String> betterShoppingList = new ArrayList();
        //System.out.println(betterShoppingList);

        betterShoppingList.add("milk");
        betterShoppingList.add("bread");
        betterShoppingList.add("eggs");
        // search for an item
        //System.out.println(betterShoppingList.indexOf("milk"));

        //display item at specific index
        //System.out.println(betterShoppingList.get(2));

        //count items in array list
        //System.out.println(betterShoppingList.size());

        //remove item by index number
        //betterShoppingList.remove(0);

        //check if item is present
        //System.out.println(betterShoppingList.contains("milk"));

        //clear out
        betterShoppingList.clear();
        //System.out.println(betterShoppingList.isEmpty());








        // Map - HashMap

        // consists of key-value pairs

        HashMap<String, Integer> mappedShoppingList = new HashMap();

        // adding a value

        mappedShoppingList.put("milk", 3);
        mappedShoppingList.put("bread", 10);
        mappedShoppingList.put("eggs", 15);

        // accessing a value
        System.out.println(mappedShoppingList.get("milk"));

        // deleting a value
        mappedShoppingList.remove("eggs");

        // updating a value
        mappedShoppingList.replace("bread", 6);

        System.out.println(mappedShoppingList.get("bread"));

        System.out.println(mappedShoppingList.keySet());
        System.out.println(mappedShoppingList.values());










        





    }
}
