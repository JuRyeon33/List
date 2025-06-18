import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Mango");

        //int index = fruits.indexOf("Banana");
        //fruits.set(1, "Orange");
        List<String> subList = fruits.subList(0, 2);

        for (int i = 0; i < subList.size(); i++) {
            System.out.println(subList.get(i));
        }

    }
}