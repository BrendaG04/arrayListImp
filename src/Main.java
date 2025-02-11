import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("hamburger");
        food.set(0 ,"sushi");
        food.remove(0);
        food.clear();

        for (String s : food) {
            System.out.println(s);
        }

        //
        arrayList playersarray = new arrayList();
        playersarray.add("A");
        playersarray.add("B");
        playersarray.add("C");
        playersarray.insert(0,"X");
        playersarray.remove("A");
        System.out.println(playersarray.search("A"));

        System.out.println(playersarray);
        System.out.println("Size: " + playersarray.size);
        System.out.println("Capacity: " + playersarray.capacity);
        System.out.println("Empty? " + playersarray.isEmpty());




    }
}