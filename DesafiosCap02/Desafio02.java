import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    
    public static void main(String[] args) {

            int[] array1 = {1,2,3,4};
            int[] array2 = {2,5};
            ArrayList<Integer> listaFinal = new Desafio02().formatarListas(array1,array2);
            for(int i=0; i<listaFinal.size(); i++) {
                if(i == listaFinal.size()-1)
                    System.out.print(listaFinal.get(i) + "");
                else
                    System.out.print(listaFinal.get(i) + ",");
            }
            
    }

    public ArrayList<Integer> formatarListas(int[] array1, int[] array2) {

        int[] novaArray = concatenarArrays(array1, array2);
        novaArray = ordenarDecrescente(novaArray);
        return removerRepeticoes(novaArray);
    }

    public int[] concatenarArrays(int[] array1, int[] array2) {

        int[] novaArray = new int[array1.length + array2.length];

        for(int i=0; i<novaArray.length; i++) {

            if(i - array1.length < 0)
                novaArray[i] = array1[i];
            else
                novaArray[i] = array2[i-array1.length]; 
        }
        return novaArray; 
    }

    public int[] ordenarDecrescente(int[] array) {
        
        Arrays.sort(array);
        return inverterArray(array);
    }

    public ArrayList<Integer> removerRepeticoes(int[] array) {

        ArrayList<Integer> novaLista = new ArrayList<Integer>();
        for(int i=0; i<array.length; i++) {
            novaLista.add(array[i]);
            for(int j=i+1; j<array.length; j++) {
                if(array[j] != array[i])
                    break;
                else
                    i = j;
            }
        }
        return novaLista;
    }

    public int[] inverterArray(int[] array) {

        int i=0;    int j=array.length-1;
        while(i<j) {
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            i++;    j--;
        }
        return array;
    }
}
