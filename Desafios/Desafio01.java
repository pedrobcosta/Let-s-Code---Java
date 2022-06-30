import java.util.Arrays;

public class Desafio01 {
    public static class Solucao {

        public int[] somaDois(int[] nums, int alvo) {
            int indexLimit = 0;
            while(nums[indexLimit] < alvo) {
                indexLimit = indexLimit + 1;
            }

            int first=0, second=1;

            outerLooop:     // procura por indexes da soma exata
            for(first=0; first<indexLimit; first++) {
                for(second=first+1; second<indexLimit+1; second++) {
                    if(nums[first] + nums[second] == alvo)
                        break outerLooop;
                    if(nums[first] + nums[second] > alvo)
                        break;
                }
            }

            if(nums[first] + nums[second] != alvo) {        // soma exata nao encontrada
                first = -1;
                second = -1;
            }

            int indexList[] = {first, second};              // indexes da soma exata
            return indexList;

        }
    }

    public static void main(String[] args) {
        int[] nums = {2,4,7,8,12};
        Solucao solucao = new Solucao();

        int[] resposta = solucao.somaDois(nums, 9);
        System.out.println(Arrays.toString(resposta)); 
    }
}