package Desafio05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public abstract class GrafoConversoesService {
    
    public boolean hasPathBFS(String origem, String destino, GrafoConversoes grafo) {

        LinkedList<String> proximosNos = new LinkedList<>();
        
        HashSet<String> visitado = new HashSet<>();
        proximosNos.add(origem);
        while(!proximosNos.isEmpty()) {
            
            String no = proximosNos.remove();
            if(no == destino)
                return true;
            if(visitado.contains(no))
                continue;
            visitado.add(no);

            for (Entry<String,BigDecimal> child: grafo.getGrafo().get(no).entrySet()) {
                proximosNos.add(child.getKey());
            }
        }
        return false;
    }

    public void autopreencherGrafo(GrafoConversoes grafo) {
        
        for (Entry<String,HashMap<String,BigDecimal>> entry1: grafo.getGrafo().entrySet()) {

            grafoToString += "\n" + entry1.getKey() + ":\n";

            for(Entry<String,BigDecimal> entry2 : entry1.getValue().entrySet()) {
                
                grafoToString += "     " + entry2.getKey();
                grafoToString += " - " + entry2.getValue() + "\n";
            };
        }
    }
}
