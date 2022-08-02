package Desafio05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Map.Entry;

public abstract class GrafoConversoesService {
    
    // public static GrafoConversoes connectAllNodes(GrafoConversoes grafo) {


    //     String lastNode;

    //     for (String currentNode: grafo.getGrafo().keySet()) {

    //         if(hasPathBFS(currentNode, destino, grafo))

    //         lastNode = currentNode;
    //     }
    // }

    public static boolean hasPathDFS(GrafoConversoes grafo, String origem, String destino,
    HashMap<String, Boolean> descobertos, Stack<String> path) {

       // mark the current node as discovered
       descobertos.put(origem, true);
 
       // include the current node in the path
       path.add(origem);

       // if destination vertex is found
       if (origem == destino) {
           return true;
       }

       // do for every edge (origem, i)
       for (String i : grafo.getGrafo().get(origem).keySet())
       {
            System.out.println(descobertos);
           // if `u` is not yet discovered
           if ((descobertos.get(i) == null ? false : descobertos.get(i)))
           {
            System.out.println("!!!!!!!!!");
               // return true if the destination is found
               if (hasPathDFS(grafo, i, destino, descobertos, path)) {
                   return true;
               }
           }
       }

       // backtrack: remove the current node from the path
       path.pop();

       // return false if destination vertex is not reachable from src
       return false;
    }

    // public void autopreencherGrafo(GrafoConversoes grafo) {
        
    //     for (Entry<String,HashMap<String,BigDecimal>> entry1: grafo.getGrafo().entrySet()) {

    //         grafoToString += "\n" + entry1.getKey() + ":\n";

    //         for(Entry<String,BigDecimal> entry2 : entry1.getValue().entrySet()) {
                
    //             grafoToString += "     " + entry2.getKey();
    //             grafoToString += " - " + entry2.getValue() + "\n";
    //         };
    //     }
    // }
}
