package Collections;

import java.util.HashMap;
import java.util.Map;

public class App3 {
    
    public static void main(String... args) {
        final Map<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Vermelho");
        hash_map.put(2, "Verde");
        hash_map.put(3, "Preto");
        hash_map.put(4, "Branco");
        hash_map.put(5, "Azul");
    
        System.out.println("O mapa tem a cor \'Verde\'?");
        if ( hash_map.containsValue("Verde") ) {
            System.out.println("Sim, o mapa tem a cor \'Verde\'!");
        } else {
            System.out.println("Não, o mapa não tem a cor \'Verde\'!");
        }
    }
}
