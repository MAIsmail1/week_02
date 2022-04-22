import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // first part of "for" is the initial value. second part is the termination condition. 3rd part is increment
        // as soon as termination condition isn't met/false, it stops running
        // sout executed on each iteration and can be complex
        //  for(int i = 1; i<=10; i++) {
        //      System.out.println(i);


        ArrayList<String> shoppingList = new ArrayList();
        shoppingList.add("milk");
        shoppingList.add("apples");
        shoppingList.add("crisps");
        shoppingList.add("bread");
        shoppingList.add("eggs");


        // initial value: 0 - array list index starts at 0
        // stop condition: length of array list
        // increment: 1
        // for (int i = 0; i < shoppingList.size(); i++) {
        // I want to print "I am buying <thing>"
        //   System.out.println("I am buying " + shoppingList.get(i));

        //}

        //       for (int i = shoppingList.size() - 1; i >= 0; i--) {
        //           if (shoppingList.get(i).equals("crisps")) {
        //              System.out.println("Yay Crisps");
        //              break;
        //           } else {
        //              System.out.println("I am buying " + shoppingList.get(i));
        //           }
        //       }

        for (int i = 0; i < shoppingList.size(); i++) {
            shoppingList.remove(i);
        }
        System.out.println(shoppingList);
    }
}

