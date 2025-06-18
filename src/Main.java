import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listFruits = new ArrayList<>();
        Set<String> fruits = new HashSet<>();


        fruits.add("Apple");
        fruits.add("Banana");


        for (String fruit:fruits) {
            System.out.println(fruit.hashCode());
        }
    }
}