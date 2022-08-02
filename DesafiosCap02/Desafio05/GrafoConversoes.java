package Desafio05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map.Entry;

public class GrafoConversoes {
    
    private HashMap<String,HashMap<String,BigDecimal>> grafo = new HashMap<>();

    public HashMap<String, HashMap<String, BigDecimal>> getGrafo() {
        return grafo;
    }

    public void adicionarVertice(String vertice) {

        if (!this.grafo.containsKey(vertice))
            this.grafo.put(vertice, new HashMap<>());
    }

    public void adicionarAresta(String vertice, String keyAresta, BigDecimal valueAresta) {

        HashMap<String, BigDecimal> arestas = this.grafo.get(vertice);
        arestas.put(keyAresta, valueAresta);
        grafo.put(vertice, arestas);

        BigDecimal valueReciproco = BigDecimal.ONE.divide(valueAresta,2, RoundingMode.HALF_UP);
        HashMap<String, BigDecimal> arestasReciproca = this.grafo.get(keyAresta) == null ? new HashMap<>() : this.grafo.get(keyAresta);
        arestasReciproca.put(vertice, valueReciproco);
        grafo.put(keyAresta, arestasReciproca);
    }

    @Override
    public String toString() {
        
        String grafoToString = "";
        
        for (Entry<String,HashMap<String,BigDecimal>> entry1: grafo.entrySet()) {

            grafoToString += "\n" + entry1.getKey() + ":\n";

            for(Entry<String,BigDecimal> entry2 : entry1.getValue().entrySet()) {
                
                grafoToString += "     " + entry2.getKey();
                grafoToString += " - " + entry2.getValue() + "\n";
            };
        }

        return grafoToString;
    }
}
