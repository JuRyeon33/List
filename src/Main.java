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

        //fruits.remove("Banana");
        fruits.remove(1);

       // for(int i = 0; i < fruits.size(); i++) {
        //    System.out.println(fruits.get(i));
        //}

        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        if (fruits.contains("Apple")) {
            System.out.println("Apple이 목록에 있습니다.");
        }
    }
}