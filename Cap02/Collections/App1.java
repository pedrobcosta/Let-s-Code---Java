package Collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App1 {
    
    public static void main(String... args) {
        final List<String> shuffleArray = new ArrayList<>();
        shuffleArray.add("Ana");
        shuffleArray.add("Bruno");
        shuffleArray.add("Carla");
        shuffleArray.add("David");
        shuffleArray.add("Eugénia");
        shuffleArray.add("Filipe");
        shuffleArray.add("Gustavo");
        shuffleArray.add("Helena");

        shuffle(shuffleArray);

        shuffleArray.forEach(System.out::println);
    }

    private static void shuffle(List<?> list) {
        
        Collections.shuffle(list);
    }

}
