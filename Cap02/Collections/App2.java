package Collections;

import java.util.HashSet;

public class App2 {
    
    public static void main(String... args) {
        final HashSet<String> set = new HashSet<>();
        set.add("Xavier");
        set.add("Miguel");
        set.add("Luisa");
        set.add("Miguel");
        set.add("Helder");
        set.add("Pedro");
        set.add("Miguel");
        set.add("Sandra");
        set.add("Helder");
        set.add("Maria");

        System.out.println("Número de elementos no set: " + set.size());
    }
}
