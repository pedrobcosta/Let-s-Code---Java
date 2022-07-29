package Desafio05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map.Entry;

public class GrafoConversoes {
    
    private HashMap<String,HashMap<String,BigDecimal>> grafo;

    public HashMap<String, HashMap<String, BigDecimal>> getGrafo() {
        return grafo;
    }

    public GrafoConversoes() {

        this.grafo = new HashMap<>();
    }

    public void adicionarVertice(String vertice) {

        if (!this.grafo.containsKey(vertice))
            this.grafo.put(vertice, new HashMap<>());
    }

    public void adicionarAresta(String vertice, String keyAresta, BigDecimal valueAresta) {

        HashMap<String, BigDecimal> aresta = this.grafo.get(vertice);
        aresta.put(keyAresta, valueAresta);
        grafo.put(vertice, aresta);
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
