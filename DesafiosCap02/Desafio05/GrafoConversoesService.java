package Desafio05;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map.Entry;

public abstract class GrafoConversoesService {
    
    public static HashMap<String,HashMap<String,BigDecimal>> 
    preencherReciprocas(GrafoConversoes grafo) {
        
        HashMap<String, HashMap<String, BigDecimal>> novoGrafo = new HashMap<>();

        for (Entry<String,HashMap<String,BigDecimal>> entry1: grafo.entrySet()) {

            novoGrafo.put(entry1.getKey(), entry1.getValue());
            
            for(Entry<String,BigDecimal> entry2 : entry1.getValue().entrySet()) {
                
                String verticeReciproco = entry2.getKey();
                String keyArestaReciproco = entry1.getKey();
                System.out.println(entry2.getValue());
                System.out.println(BigDecimal.ONE.divide(entry2.getValue(),2, RoundingMode.HALF_UP));
                BigDecimal valueArestaReciproco = BigDecimal.ONE.divide(entry2.getValue(), RoundingMode.HALF_DOWN);
                
                this.adicionarVertice(verticeReciproco);
                this.adicionarAresta(verticeReciproco, keyArestaReciproco, valueArestaReciproco);
            };
        }
        
    }

}
