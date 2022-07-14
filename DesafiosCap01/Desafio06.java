public class Desafio06 {
    
    public static void main(String[] args) {

        int[] array1 = {15,30,100,50,23};
        int[] array2 = {1000,1,500,600,100};

        System.out.println("Exemplo 1--------------------------\n\n"+
                            "Entrada = {15,30,100,50,23}     numero: 3\n"+
                            "Saída:");
        maximoCombinacoes(array1,3);
        System.out.println("\n");

        System.out.println("Exemplo 2--------------------------\n\n"+
                            "Entrada = {1000,1,500,600,100}  numero: 2 \n"+
                            "Saída:");
        maximoCombinacoes(array2,2);
        System.out.println("\n");

        System.out.println("Exemplo 3--------------------------\n\n"+
                            "Entrada = {1000,1,500,600,100}  numero: 10\n"+
                            "Saída:");
        maximoCombinacoes(array2,10);
    }

    // int[], int -> int 
    // recebe uma array de inteiros e o numero de elementos a serem combinados em sequencia
    // retorna a combinação de maior valor numa sequencia de 'num' elementos
    public static int maximoCombinacoes(int array[], int num) {
        // exceção
        if(num > array.length) {
            System.out.println("-1, porque nao ha elementos suficientes no array");
            return -1;
        }
        // set inicial
        int sum = 0;
        int greatestSum = 0;

        int firstInSum = 0;
        int currentInSum = firstInSum;
        int greatestSumIndex = firstInSum;
        // percorre toda a lista, mudando o primeiro elemento da sequencia
        while(firstInSum <= array.length-num) {
            sum = sum + array[currentInSum];
            // percorreu 'num' elementos em sequencia
            if(currentInSum - firstInSum == num - 1) {
                if(sum > greatestSum) {
                    greatestSum = sum;
                    greatestSumIndex = firstInSum;
                }
                // reset
                sum = 0;
                currentInSum = firstInSum;
                firstInSum = firstInSum + 1;
            }
            // proximo elemento
            currentInSum++;
        }
        // fim
        String resposta= greatestSum + ", porque a maior combinação de " + num + 
        " números seguidos é ";
        for(int i=0; i<num; i++) {
            resposta += array[greatestSumIndex + i];
            if(i < num - 2)           resposta += ",";
            else if(i == num - 2)   resposta += " e ";
        }
        System.out.println(resposta);
        return greatestSum;
        }

}
