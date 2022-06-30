public class Desafio03 {
    
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7}; 
        int[] array2 = {2, 4, 6, 8, 12, 15};

        int[] arrayConsolidado = new int[array1.length + array2.length];

        juntarArrays(array1, array2, arrayConsolidado);

        System.out.println(arrayToString(arrayConsolidado));
    }

    public static void juntarArrays(int[] array1, int[] array2, 
    int[] arrayConsolidado) {
        
        int tamanhoTotal = array1.length+array2.length;
        int tamanhoArray1 = array1.length;

        for(int i=0; i<tamanhoTotal; i++) {

            // i está em array1
            if(i<tamanhoArray1)
                arrayConsolidado[i] = array1[i];
            // i está em array2
            else
                arrayConsolidado[i] = array2[i-tamanhoArray1];
        }

        selectionSort(arrayConsolidado);
    }

    public static void selectionSort(int[] array) {

        for(int i=0; i<array.length; i++) {

            // procura menor
            int posMenor = i;
            for(int j=i+1; j<array.length; j++) {
                if (array[j] < array[posMenor]) {
                    posMenor = j;
                }
            }

            // troca o menor com a posicao inicial
            int trocado = array[i];
            array[i] = array[posMenor];
            array[posMenor] = trocado;
        }
    }

    public static String arrayToString(int[] array) {
        String saida = "[";

        for(int i=0; i<array.length; i++) {

            saida = saida + array[i];

            // nao é o ultimo elemento
            if(i !=  array.length-1)
                saida += ", ";
            // é o ultimo elemento
            else
                saida += "]";
        }

        return saida;
    }
}