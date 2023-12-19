import java.util.HashSet;
import java.util.Set;

public class Lab07 {
    public static void main(String[] args) {
        // Creating and testing MySet
        MySet<String> mySet = new MySet<>();

        mySet.add("English");
        mySet.add("Numerical");
        mySet.add("Micro");

        System.out.println("Set size: " + mySet.size());
        System.out.println("Set contains 'Micro': " + mySet.contains("Micro"));

        mySet.remove("Micro");

        System.out.println("Set size after removal: " + mySet.size());
        System.out.println("Set contains 'Micro' after removal: " + mySet.contains("Micro"));

        Set<String> additionalSet = new HashSet<>();
        additionalSet.add("Algorithms");
        additionalSet.add("Object-Oriented");

        mySet.addAll(additionalSet);
        System.out.println("Set size after addAll: " + mySet.size());
    }
}